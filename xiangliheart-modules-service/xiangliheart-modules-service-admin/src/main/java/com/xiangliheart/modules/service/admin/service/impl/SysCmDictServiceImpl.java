/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.modules.service.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.xiangliheart.modules.common.repository.pagehelper.PageRequest;
import com.xiangliheart.modules.service.admin.dao.SysCmDictMapper;
import com.xiangliheart.modules.service.admin.entity.SysCmDict;
import com.xiangliheart.modules.service.admin.service.SysCmDictService;

@Service
public class SysCmDictServiceImpl implements SysCmDictService {

    @Autowired
    private SysCmDictMapper sysCmDictMapper;

    @Override
    public int save(SysCmDict record) {
        if (record.getId() == null || record.getId() == 0) {
            return sysCmDictMapper.insertSelective(record);
        }
        return sysCmDictMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int saveList(List<SysCmDict> records) {
        return 0;
    }

    @Override
    public int delete(SysCmDict record) {
        return sysCmDictMapper.deleteByPrimaryKey(record.getId());
    }

    @Override
    public int delete(List<SysCmDict> records) {
        for (SysCmDict record : records) {
            delete(record);
        }
        return 1;
    }

    @Override
    public int update(SysCmDict record) {
        return 0;
    }

    @Override
    public SysCmDict findById(Long id) {
        return sysCmDictMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageInfo findPage(PageRequest pageRequest) {
        /*Object label = pageRequest.getParam("label");
        if(label != null) {
        	return MybatisPageHelper.findPage(pageRequest, SysCmDictMapper, "findPageByLabel", label);
        }
        return MybatisPageHelper.findPage(pageRequest, SysCmDictMapper);*/
        return null;
    }

    @Override
    public List<SysCmDict> findByLable(String lable) {
        // return sysCmDictMapper.findByLable(lable);
        return null;
    }

}
