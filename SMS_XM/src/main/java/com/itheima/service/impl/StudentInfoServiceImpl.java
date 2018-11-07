package com.itheima.service.impl;

import com.itheima.dao.TbStudentMapper;
import com.itheima.domain.TbStudent;
import com.itheima.domain.TbStudentExample;
import com.itheima.service.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class StudentInfoServiceImpl implements StudentInfoService {

    @Autowired
    private TbStudentMapper studentInfoDao;

    @Override
    public List<TbStudent> findAllStudents() {
        TbStudentExample studentExample=new TbStudentExample();
        studentExample.createCriteria().andDeleteFlagEqualTo(0);
        return studentInfoDao.selectByExample(studentExample);
    }

    @Override
    public void addStudent(TbStudent student) {
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd : hh:mm:ss");
        student.setLastUpdateTime(format.format(new Date()));
        student.setDeleteFlag(0);
        student.setUsableFlag(0);
        studentInfoDao.insert(student);
    }

    @Override
    public void deleteStudentById(String id) {
        TbStudent student=studentInfoDao.selectByPrimaryKey(Integer.parseInt(id));
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd : hh:mm:ss");
        student.setLastUpdateTime(format.format(new Date()));
        student.setDeleteFlag(1);
        student.setUsableFlag(1);
        studentInfoDao.updateByPrimaryKey(student);
    }

    @Override
    public void changeStudentFlagBySid(String id) {
        TbStudent student=studentInfoDao.selectByPrimaryKey(Integer.parseInt(id));
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd : hh:mm:ss");
        student.setLastUpdateTime(format.format(new Date()));
        if (student.getUsableFlag()==1){
            //如果可用标志为不可用,则切换成可用状态
            student.setUsableFlag(0);
        }else if(student.getUsableFlag()==0){
            //如果可用标志为可用,则切换成不可用状态
            student.setUsableFlag(1);
        }
        studentInfoDao.updateByPrimaryKey(student);
    }

    @Override
    public TbStudent findStudentById(String id) {
        return studentInfoDao.selectByPrimaryKey(Integer.parseInt(id));
    }

    @Override
    public void updateStudent(TbStudent student) {
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd : hh:mm:ss");
        student.setLastUpdateTime(format.format(new Date()));
        studentInfoDao.updateByPrimaryKey(student);
    }

    @Override
    public List<TbStudent> searchByCondition(String studentName) {
        TbStudentExample studentExample=new TbStudentExample();
        studentExample.createCriteria().andStudentNameLike("%"+studentName+"%").andDeleteFlagEqualTo(0);
        return studentInfoDao.selectByExample(studentExample);
    }

    @Override
    public void addStudentBatch(List<TbStudent> list) {
        for (TbStudent student:list) {
            //查找出指定学生id的学生,如果该学生存在,那么改为更新操作,否则为插入操作
            TbStudentExample studentExample=new TbStudentExample();
            studentExample.createCriteria().andStudentIdEqualTo(student.getStudentId());
            List<TbStudent> searchResult=studentInfoDao.selectByExample(studentExample);
            if (searchResult.size()==0){
                //该学生不存在,进行新增操作
                DateFormat format=new SimpleDateFormat("yyyy-MM-dd : hh:mm:ss");
                student.setLastUpdateTime(format.format(new Date()));
                student.setDeleteFlag(0);
                student.setUsableFlag(0);
                studentInfoDao.insert(student);
            }else{
                //该学生已经存在,进行更新操作
                for (TbStudent student1:searchResult) {
                    student.setSid(student1.getSid());
                }
                DateFormat format=new SimpleDateFormat("yyyy-MM-dd : hh:mm:ss");
                student.setLastUpdateTime(format.format(new Date()));
                student.setDeleteFlag(0);
                student.setUsableFlag(0);
                studentInfoDao.updateByPrimaryKey(student);
            }


        }
    }


}
