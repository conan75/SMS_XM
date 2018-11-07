package com.itheima.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itheima.domain.TbClazz;
import com.itheima.service.ClazzInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 班级基础信息
 */
@Controller
@RequestMapping("/clazzInfo")
public class ClazzInfoController {

    @Autowired
    private ClazzInfoService clazzService;

    /**
     * 查看所有班级信息
     * @param model
     * @return
     */
    @RequestMapping("/clazz_list")
    public String list(Model model, @RequestParam(required = false,defaultValue = "1",value = "pn")Integer pn){
        PageHelper.startPage(pn,10);
        List<TbClazz> list = clazzService.findAllClazz();
        PageInfo pageInfo = new PageInfo<>(list,10);
        model.addAttribute("pageInfo",pageInfo);
        return "clazz_list";
    }

    /**
     * 跳转至添加班级界面
     * @return
     */
    @RequestMapping("/toAddClazz")
    public String toAddClazz(){
        return "clazz_add";
    }

    /**
     * 添加班级信息
     * @param clazz
     * @return
     */
    @RequestMapping("/addClazz")
    public String addClazz(TbClazz clazz){
        clazzService.addClazz(clazz);
        return "redirect:/clazzInfo/clazz_list";
    }

    /**
     * 根据班级id删除指定的班级信息
     * @param id
     * @return
     */
    @RequestMapping("/del/{cId}/{pageNum}")
    public String deleteClazzBySid(@PathVariable("cId") String id,@PathVariable("pageNum") String curPage){
        clazzService.deleteClazzById(id);
        return "redirect:/clazzInfo/clazz_list?pn="+curPage;
    }

    /**
     * 根据班级id修改班级可用标志
     * @param id
     * @return
     */
    @RequestMapping("/changeFlag/{cId}/{pageNum}")
    public String changeClazzFlagBySid(@PathVariable("cId") String id,@PathVariable("pageNum") String curPage){
        clazzService.changeClazzFlagBySid(id);
        return "redirect:/clazzInfo/clazz_list?pn="+curPage;
    }


    /**
     * 查询指定id的班级信息跳转至班级信息更新页面
     * @param model
     * @param id
     * @return
     */
    @RequestMapping("toUpdateClazz")
    public String toUpdateClazz(Model model,String id,String curPage){
        model.addAttribute("clazz",clazzService.findClazzById(id));
        model.addAttribute("curPage",curPage);
        return "clazz_update";
    }

    /**
     * 更新班级信息
     * @param clazz
     * @return
     */
    @RequestMapping("/updateClazz")
    public String updateClazz(TbClazz clazz,String curPage){
        clazzService.updateClazz(clazz);
        return "redirect:/clazzInfo/clazz_list?pn="+curPage;
    }

    /**
     * 根据指定条件查找相对应的班级信息
     * @param model
     * @param clazzName
     * @return
     */
    @RequestMapping("/searchByCondition")
    public String searchByCondition(Model model,String clazzName,@RequestParam(required = false,defaultValue = "1",value = "pn")Integer pn){
        if (StringUtils.isBlank(clazzName)){
            return "redirect:/clazzInfo/clazz_list";
        }
        PageHelper.startPage(pn,10);
        List<TbClazz> list = clazzService.searchByCondition(clazzName);
        PageInfo pageInfo = new PageInfo<>(list,10);
        model.addAttribute("pageInfo",pageInfo);
        return "clazz_list";
    }

}
