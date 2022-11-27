/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.modules.service.admin.service;

import java.util.List;

import com.xiangliheart.modules.common.repository.service.CurdService;
import com.xiangliheart.modules.service.admin.entity.SysAhMenu;
import com.xiangliheart.modules.service.admin.entity.SysAhRole;
import com.xiangliheart.modules.service.admin.entity.SysAhRoleMenu;

/**
 * SysAhRoleService 角色管理
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/11/27
 */
public interface SysAhRoleService extends CurdService<SysAhRole> {

    List<SysAhRole> findAll();

    List<SysAhMenu> findRoleMenus(Long roleId);

    int saveRoleMenus(List<SysAhRoleMenu> records);

    List<SysAhRole> findByName(String name);
}
