package com.itheima.service.impl;

import com.itheima.dao.TbClazzMapper;
import com.itheima.domain.TbClazz;
import com.itheima.domain.TbClazzExample;
import com.itheima.service.ClazzInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class ClazzInfoServiceImpl implements ClazzInfoService {

    @Autowired
    private TbClazzMapper clazzInfoDao;

    @Override
    public List<TbClazz> findAllClazz() {
        TbClazzExample clazzExample=new TbClazzExample();
        clazzExample.createCriteria().andDeleteFlagEqualTo(0);
        return clazzInfoDao.selectByExample(clazzExample);
    }

    @Override
    public void addClazz(TbClazz clazz) {
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd : hh:mm:ss");
        clazz.setClazzId(UUID.randomUUID().toString().replace("-",""));
        clazz.setLastUpdateTime(format.format(new Date()));
        clazz.setDeleteFlag(0);
        clazz.setUsableFlag(0);
        clazzInfoDao.insert(clazz);
    }

    @Override
    public void deleteClazzById(String id) {
        TbClazz clazz=clazzInfoDao.selectByPrimaryKey(Integer.parseInt(id));
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd : hh:mm:ss");
        clazz.setLastUpdateTime(format.format(new Date()));
        clazz.setUsableFlag(1);
        clazz.setDeleteFlag(1);
        clazzInfoDao.updateByPrimaryKey(clazz);
    }

    @Override
    public TbClazz findClazzById(String id) {
        return clazzInfoDao.selectByPrimaryKey(Integer.parseInt(id));
    }

    @Override
    public void updateClazz(TbClazz clazz) {
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd : hh:mm:ss");
        clazz.setLastUpdateTime(format.format(new Date()));
        clazzInfoDao.updateByPrimaryKey(clazz);
    }

    @Override
    public List<TbClazz> searchByCondition(String clazzName) {
        TbClazzExample clazzExample=new TbClazzExample();
        clazzExample.createCriteria().andClazzNameLike("%"+clazzName+"%").andDeleteFlagEqualTo(0);
        return clazzInfoDao.selectByExample(clazzExample);
    }

    @Override
    public void changeClazzFlagBySid(String id) {
        TbClazz clazz=clazzInfoDao.selectByPrimaryKey(Integer.parseInt(id));
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd : hh:mm:ss");
        clazz.setLastUpdateTime(format.format(new Date()));
        if (clazz.getUsableFlag()==1){
            //如果可用标志为不可用,则切换成可用状态
            clazz.setUsableFlag(0);
        }else if(clazz.getUsableFlag()==0){
            //如果可用标志为可用,则切换成不可用状态
            clazz.setUsableFlag(1);
        }
        clazzInfoDao.updateByPrimaryKey(clazz);
    }
}
