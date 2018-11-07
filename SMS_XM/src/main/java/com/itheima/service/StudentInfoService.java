package com.itheima.service;

import com.itheima.domain.TbStudent;

import java.util.List;

/**
 * 学生基础信息接口
 */
public interface StudentInfoService {

    List<TbStudent> findAllStudents();

    void addStudent(TbStudent student);

    void deleteStudentById(String id);

    TbStudent findStudentById(String id);

    void updateStudent(TbStudent student);

    List<TbStudent> searchByCondition(String studentName);

    void addStudentBatch(List<TbStudent> list);

    void changeStudentFlagBySid(String id);
}
