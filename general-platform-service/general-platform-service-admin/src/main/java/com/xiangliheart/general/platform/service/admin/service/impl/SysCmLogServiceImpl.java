/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.general.platform.service.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.xiangliheart.general.platform.common.repository.pagehelper.PageRequest;
import com.xiangliheart.general.platform.service.admin.dao.SysCmLogMapper;
import com.xiangliheart.general.platform.service.admin.entity.SysCmLog;
import com.xiangliheart.general.platform.service.admin.service.SysCmLogService;

@Service
public class SysCmLogServiceImpl implements SysCmLogService {

    @Autowired
    private SysCmLogMapper sysCmLogMapper;

    @Override
    public int save(SysCmLog record) {
        if (record.getId() == null || record.getId() == 0) {
            return sysCmLogMapper.insertSelective(record);
        }
        return sysCmLogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int saveList(List<SysCmLog> records) {
        return 0;
    }

    @Override
    public int delete(SysCmLog record) {
        return sysCmLogMapper.deleteByPrimaryKey(record.getId());
    }

    @Override
    public int delete(List<SysCmLog> records) {
        for (SysCmLog record : records) {
            delete(record);
        }
        return 1;
    }

    @Override
    public int update(SysCmLog record) {
        return 0;
    }

    @Override
    public SysCmLog findById(Long id) {
        return sysCmLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageInfo findPage(PageRequest pageRequest) {
        /*Object label = pageRequest.getParam("userName");
        if(label != null) {
        	return MybatisPageHelper.findPage(pageRequest, SysCmLogMapper, "findPageByUserName", label);
        }
        return MybatisPageHelper.findPage(pageRequest, SysCmLogMapper);*/
        return null;
    }

}
