/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.modules.service.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.xiangliheart.modules.common.repository.pagehelper.PageRequest;
import com.xiangliheart.modules.service.admin.dao.SysAhLoginLogMapper;
import com.xiangliheart.modules.service.admin.entity.SysAhLoginLog;
import com.xiangliheart.modules.service.admin.service.SysAhLoginLogService;

@Service
public class SysAhLoginLogServiceImpl implements SysAhLoginLogService {
    @Autowired
    private SysAhLoginLogMapper sysAhLoginLogMapper;

    @Override
    public int save(SysAhLoginLog record) {
        if (record.getId() == null || record.getId() == 0) {
            return sysAhLoginLogMapper.insertSelective(record);
        }
        return sysAhLoginLogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int saveList(List<SysAhLoginLog> records) {
        return 0;
    }

    @Override
    public int delete(SysAhLoginLog record) {
        return sysAhLoginLogMapper.deleteByPrimaryKey(record.getId());
    }

    @Override
    public int delete(List<SysAhLoginLog> records) {
        for (SysAhLoginLog record : records) {
            delete(record);
        }
        return 1;
    }

    @Override
    public int update(SysAhLoginLog record) {
        return 0;
    }

    @Override
    public SysAhLoginLog findById(Long id) {
        return sysAhLoginLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageInfo findPage(PageRequest pageRequest) {
        /*Object userName = pageRequest.getParam("userName");
        if(userName != null) {
        	return MybatisPageHelper.findPage(pageRequest, sysLoginLogMapper, "findPageByUserName", userName);
        }
        Object status = pageRequest.getParam("status");
        if(status != null) {
        	return MybatisPageHelper.findPage(pageRequest, sysLoginLogMapper, "findPageByStatus", status);
        }
        return MybatisPageHelper.findPage(pageRequest, sysLoginLogMapper);*/
        return null;
    }

}
