/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.general.platform.service.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageInfo;
import com.xiangliheart.general.platform.common.repository.pagehelper.PageRequest;
import com.xiangliheart.general.platform.service.admin.constant.SysConstants;
import com.xiangliheart.general.platform.service.admin.dao.SysAhRoleMapper;
import com.xiangliheart.general.platform.service.admin.entity.SysAhMenu;
import com.xiangliheart.general.platform.service.admin.entity.SysAhRole;
import com.xiangliheart.general.platform.service.admin.entity.SysAhRoleMenu;
import com.xiangliheart.general.platform.service.admin.service.SysAhRoleService;

@Service
public class SysAhRoleServiceImpl implements SysAhRoleService {

    @Autowired
    private SysAhRoleMapper sysAhRoleMapper;
    @Autowired
    private com.xiangliheart.general.platform.service.admin.dao.SysAhRoleMenuMapper sysAhRoleMenuMapper;
    @Autowired
    private com.xiangliheart.general.platform.service.admin.dao.SysAhMenuMapper sysAhMenuMapper;

    @Override
    public int save(SysAhRole record) {
        if (record.getId() == null || record.getId() == 0) {
            return sysAhRoleMapper.insertSelective(record);
        }
        return sysAhRoleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int saveList(List<SysAhRole> records) {
        return 0;
    }

    @Override
    public int delete(SysAhRole record) {
        return sysAhRoleMapper.deleteByPrimaryKey(record.getId());
    }

    @Override
    public int delete(List<SysAhRole> records) {
        for (SysAhRole record : records) {
            delete(record);
        }
        return 1;
    }

    @Override
    public int update(SysAhRole record) {
        return 0;
    }

    @Override
    public SysAhRole findById(Long id) {
        return sysAhRoleMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageInfo findPage(PageRequest pageRequest) {
        /*Object label = pageRequest.getParam("name");
        if(label != null) {
        	return MybatisPageHelper.findPage(pageRequest, SysAhRoleMapper, "findPageByName", label);
        }
        return MybatisPageHelper.findPage(pageRequest, SysAhRoleMapper);*/
        return null;
    }

    @Override
    public List<SysAhRole> findAll() {
        return sysAhRoleMapper.selectAll();
    }

    public SysAhRoleMapper getSysAhRoleMapper() {
        return sysAhRoleMapper;
    }

    public void setSysAhRoleMapper(SysAhRoleMapper SysAhRoleMapper) {
        this.sysAhRoleMapper = SysAhRoleMapper;
    }

    @Override
    public List<SysAhMenu> findRoleMenus(Long roleId) {
        SysAhRole SysAhRole = sysAhRoleMapper.selectByPrimaryKey(roleId);
        if (SysConstants.ADMIN.equalsIgnoreCase(SysAhRole.getName())) {
            // 如果是超级管理员，返回全部
            return sysAhMenuMapper.selectAll();
        }
        // return sysAhMenuMapper.findRoleMenus(roleId);
        return null;
    }

    @Transactional
    @Override
    public int saveRoleMenus(List<SysAhRoleMenu> records) {
        if (records == null || records.isEmpty()) {
            return 1;
        }
        String roleId = records.get(0).getRoleId();
        sysAhRoleMenuMapper.deleteByPrimaryKey(roleId);
        for (SysAhRoleMenu record : records) {
            sysAhRoleMenuMapper.insertSelective(record);
        }
        return 1;
    }

    @Override
    public List<SysAhRole> findByName(String name) {
        // return sysAhRoleMapper.findByName(name);
        return null;
    }

}
