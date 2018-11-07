package com.itheima.dao;

import com.itheima.domain.TbClazz;
import com.itheima.domain.TbClazzExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TbClazzMapper {
    int countByExample(TbClazzExample example);

    int deleteByExample(TbClazzExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(TbClazz record);

    int insertSelective(TbClazz record);

    List<TbClazz> selectByExample(TbClazzExample example);

    TbClazz selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") TbClazz record, @Param("example") TbClazzExample example);

    int updateByExample(@Param("record") TbClazz record, @Param("example") TbClazzExample example);

    int updateByPrimaryKeySelective(TbClazz record);

    int updateByPrimaryKey(TbClazz record);

    @Select("select max(clazz_id)+1 from tb_clazz")
    String selectNextClazzId();
}