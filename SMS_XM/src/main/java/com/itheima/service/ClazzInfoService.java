package com.itheima.service;

import com.itheima.domain.TbClazz;

import java.util.List;

public interface ClazzInfoService {
    List<TbClazz> findAllClazz();

    void addClazz(TbClazz clazz);

    void deleteClazzById(String id);

    TbClazz findClazzById(String id);

    void updateClazz(TbClazz clazz);

    List<TbClazz> searchByCondition(String clazzName);

    void changeClazzFlagBySid(String id);
}
