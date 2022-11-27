/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.general.platform.service.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.xiangliheart.general.platform.common.repository.pagehelper.PageRequest;
import com.xiangliheart.general.platform.common.web.http.HttpResult;
import com.xiangliheart.general.platform.service.admin.constant.SysConstants;
import com.xiangliheart.general.platform.service.admin.dao.SysAhRoleMapper;
import com.xiangliheart.general.platform.service.admin.entity.SysAhRole;
import com.xiangliheart.general.platform.service.admin.entity.SysAhRoleMenu;
import com.xiangliheart.general.platform.service.admin.service.SysAhRoleService;

/**
 * SysRoleController 角色控制器
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/11/27
 */
@RestController
@RequestMapping("role")
public class SysRoleController {

    @Autowired
    private SysAhRoleService sysRoleService;
    @Autowired
    private SysAhRoleMapper sysRoleMapper;

    @PostMapping(value = "/save")
    public HttpResult save(@RequestBody SysAhRole record) {
        SysAhRole role = sysRoleService.findById(record.getId());
        if (role != null) {
            if (SysConstants.ADMIN.equalsIgnoreCase(role.getName())) {
                return HttpResult.error("超级管理员不允许修改!");
            }
        }
        // 新增角色
        if ((record.getId() == null || record.getId() == 0) && !sysRoleService.findByName(record.getName()).isEmpty()) {
            return HttpResult.error("角色名已存在!");
        }
        return HttpResult.ok(sysRoleService.save(record));
    }

    @PostMapping(value = "/delete")
    public HttpResult delete(@RequestBody List<SysAhRole> records) {
        return HttpResult.ok(sysRoleService.delete(records));
    }

    @PostMapping(value = "/findPage")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(sysRoleService.findPage(pageRequest));
    }

    @GetMapping(value = "/findAll")
    public HttpResult findAll() {
        return HttpResult.ok(sysRoleService.findAll());
    }

    @GetMapping(value = "/findRoleMenus")
    public HttpResult findRoleMenus(@RequestParam Long roleId) {
        return HttpResult.ok(sysRoleService.findRoleMenus(roleId));
    }

    @PostMapping(value = "/saveRoleMenus")
    public HttpResult saveRoleMenus(@RequestBody List<SysAhRoleMenu> records) {
        for (SysAhRoleMenu record : records) {
            SysAhRole sysRole = sysRoleMapper.selectByPrimaryKey(record.getRoleId());
            if (SysConstants.ADMIN.equalsIgnoreCase(sysRole.getName())) {
                // 如果是超级管理员，不允许修改
                return HttpResult.error("超级管理员拥有所有菜单权限，不允许修改！");
            }
        }
        return HttpResult.ok(sysRoleService.saveRoleMenus(records));
    }
}
