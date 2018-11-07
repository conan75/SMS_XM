package com.itheima.dao;

import com.itheima.domain.TbStudent;
import com.itheima.domain.TbStudentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbStudentMapper {
    int countByExample(TbStudentExample example);

    int deleteByExample(TbStudentExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(TbStudent record);

    int insertSelective(TbStudent record);

    List<TbStudent> selectByExample(TbStudentExample example);

    TbStudent selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") TbStudent record, @Param("example") TbStudentExample example);

    int updateByExample(@Param("record") TbStudent record, @Param("example") TbStudentExample example);

    int updateByPrimaryKeySelective(TbStudent record);

    int updateByPrimaryKey(TbStudent record);

}