package com.itheima.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itheima.domain.TbClazz;
import com.itheima.domain.TbStudent;
import com.itheima.service.ClazzInfoService;
import com.itheima.service.StudentInfoService;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

/**
 * 学生基础信息
 */
@Controller
@RequestMapping("/studentInfo")
public class StudentInfoController {

    @Autowired
    private StudentInfoService studentrService;

    @Autowired
    private ClazzInfoService clazzInfoService;

    /**
     * 查看所有学生信息
     * @param model
     * @return
     */
    @RequestMapping("/student_list")
    public String list(Model model, @RequestParam(required = false,defaultValue = "1",value = "pn")Integer pn){
        PageHelper.startPage(pn,10);
        List<TbStudent> list = studentrService.findAllStudents();
        PageInfo pageInfo = new PageInfo<>(list,10);
        model.addAttribute("pageInfo",pageInfo);
        return "student_list";
    }

    /**
     * 跳转至添加学生界面
     * @return
     */
    @RequestMapping("/toAddStudent")
    public String toAddStudent(Model model){
        model.addAttribute("clazzList",clazzInfoService.findAllClazz());
        return "student_add";
    }

    /**
     * 添加学生信息
     * @param student
     * @return
     */
    @RequestMapping("/addStudent")
    public String addStudent(TbStudent student){
        TbClazz clazz=clazzInfoService.findClazzById(student.getTbClassId());
        student.setTbClassName(clazz.getClazzName());
        student.setTbClassId(clazz.getClazzId());
        studentrService.addStudent(student);
        return "redirect:/studentInfo/student_list";
    }

    /**
     * 根据学生id修改学生可用标志
     * @param id
     * @return
     */
    @RequestMapping("/changeFlag/{sId}/{pageNum}")
    public String changeStudentFlagBySid(@PathVariable("sId") String id,@PathVariable("pageNum") String curPage){
        studentrService.changeStudentFlagBySid(id);
        return "redirect:/studentInfo/student_list?pn="+curPage;
    }

    /**
     * 根据学生id删除学生,将删除标志置为1
     * @param id
     * @return
     */
    @RequestMapping("/del/{sId}/{pageNum}")
    public String deleteStudentBySid(@PathVariable("sId") String id,@PathVariable("pageNum") String curPage){
        studentrService.deleteStudentById(id);
        return "redirect:/studentInfo/student_list?pn="+curPage;
    }

    /**
     * 查询指定id的学生信息跳转至学生信息更新页面
     * @param model
     * @param id
     * @return
     */
    @RequestMapping("toUpdateStudent")
    public String toUpdateStudent(Model model,String id,String curPage){
        model.addAttribute("student",studentrService.findStudentById(id));
        model.addAttribute("curPage",curPage);
        return "student_update";
    }

    /**
     * 更新学生信息
     * @param student
     * @return
     */
    @RequestMapping("/updateStudent")
    public String updateStudent(TbStudent student,String curPage){
        studentrService.updateStudent(student);
        return "redirect:/studentInfo/student_list?pn="+curPage;
    }

    /**
     * 根据指定条件查找相对应的学生信息
     * @param model
     * @param studentName
     * @return
     */
    @RequestMapping("/searchByCondition")
    public String searchByCondition(Model model,String studentName,@RequestParam(required = false,defaultValue = "1",value = "pn")Integer pn){
        if (StringUtils.isBlank(studentName)){
            return "redirect:/studentInfo/student_list";
        }
        PageHelper.startPage(pn,10);
        List<TbStudent> list = studentrService.searchByCondition(studentName);
        PageInfo pageInfo = new PageInfo<>(list,10);
        model.addAttribute("pageInfo",pageInfo);
        return "student_list";
    }

    /**
     * 导入excel中的学生信息
     * @param excelFile
     * @return
     */
    @RequestMapping("/importExcel")
    public String importExcel(Model model, MultipartFile excelFile, TbClazz clazz){

        List<TbStudent> list = new ArrayList<>();
        if (excelFile.getOriginalFilename().endsWith("xls")) {
            // 用hssf解析
            try {
                HSSFWorkbook workbook = new HSSFWorkbook(excelFile.getInputStream());
                HSSFSheet sheet = workbook.getSheetAt(0);
                for (Row row : sheet) {
                    if (row.getRowNum() < 3) {
                        continue;
                    }
                    row.getCell(0).setCellType(Cell.CELL_TYPE_STRING);
                    if (StringUtils.isBlank(row.getCell(0).getStringCellValue())) {
                        continue;
                    }
                    TbStudent student = new TbStudent();
                    student.setSid(Integer.parseInt(row.getCell(0).getStringCellValue()));
                    row.getCell(2).setCellType(Cell.CELL_TYPE_STRING);
                    student.setStudentId(Integer.parseInt(row.getCell(2).getStringCellValue()));
                    student.setStudentName(row.getCell(3).getStringCellValue());

                    int sex=99;
                    String sexTemp=row.getCell(4).getStringCellValue();
                    if("男".equals(sexTemp)){
                        sex=0;
                    }else if("女".equals(sexTemp)){
                        sex=1;
                    }
                    student.setSex(sex);

                    int stats=99;
                    String statsTemp=row.getCell(5).getStringCellValue();
                    if("新生".equals(statsTemp)){
                        stats=0;
                    }else if("升级".equals(statsTemp)){
                        stats=1;
                    }
                    student.setStats(stats);


                    student.setIdcardNo(row.getCell(6).getStringCellValue());
                    student.setMobileNo(row.getCell(7).getStringCellValue());
                    student.setClassOpenDate(row.getCell(15).getStringCellValue());
                    student.setNormalGraduateDate(row.getCell(16).getStringCellValue());
                    student.setActualGraduateDate(row.getCell(17).getStringCellValue());
                    student.setIdcardAddress(row.getCell(21).getStringCellValue());
                    student.setActualAdderss(row.getCell(22).getStringCellValue());
                    student.setFamilyPhone(row.getCell(23).getStringCellValue());
                    student.setQq(row.getCell(24).getStringCellValue());
                    student.setEducation(row.getCell(25).getStringCellValue());
                    student.setGraduateSchool(row.getCell(26).getStringCellValue());
                    student.setMajor(row.getCell(27).getStringCellValue());
                    student.setGraduateDate(row.getCell(28).getStringCellValue());
                    row.getCell(29).setCellType(Cell.CELL_TYPE_STRING);
                    student.setAge(Integer.parseInt(row.getCell(29).getStringCellValue()));
                    student.setStudentNo(row.getCell(30).getStringCellValue());
                    if (clazz!=null){
                        student.setTbClassId(clazz.getClazzId());
                        student.setTbClassName(clazz.getClazzName());
                        list.add(student);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            model.addAttribute("msg","文件格式错误!");
            return "error";
        }
        studentrService.addStudentBatch(list);
        return "redirect:/studentInfo/student_list";
    }
}
