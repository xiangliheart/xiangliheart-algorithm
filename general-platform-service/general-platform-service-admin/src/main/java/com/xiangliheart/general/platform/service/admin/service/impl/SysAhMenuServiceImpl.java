/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.general.platform.service.admin.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.xiangliheart.general.platform.common.repository.pagehelper.PageRequest;
import com.xiangliheart.general.platform.service.admin.constant.SysConstants;
import com.xiangliheart.general.platform.service.admin.dao.SysAhMenuMapper;
import com.xiangliheart.general.platform.service.admin.entity.SysAhMenu;
import com.xiangliheart.general.platform.service.admin.service.SysAhMenuService;

@Service
public class SysAhMenuServiceImpl implements SysAhMenuService {

    @Autowired
    private SysAhMenuMapper SysAhMenuMapper;

    @Override
    public int save(SysAhMenu record) {
        if (record.getId() == null || record.getId() == 0) {
            return SysAhMenuMapper.insertSelective(record);
        }
        if (record.getParentId() == null) {
            record.setParentId(0L);
        }
        return SysAhMenuMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int saveList(List<SysAhMenu> records) {
        return 0;
    }

    @Override
    public int delete(SysAhMenu record) {
        return SysAhMenuMapper.deleteByPrimaryKey(record.getId());
    }

    @Override
    public int delete(List<SysAhMenu> records) {
        for (SysAhMenu record : records) {
            delete(record);
        }
        return 1;
    }

    @Override
    public int update(SysAhMenu record) {
        return 0;
    }

    @Override
    public SysAhMenu findById(Long id) {
        return SysAhMenuMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageInfo findPage(PageRequest pageRequest) {
        // return MybatisPageHelper.findPage(pageRequest, SysAhMenuMapper);
        return null;
    }

    @Override
    public List<SysAhMenu> findTree(String userName, int menuType) {
        List<SysAhMenu> SysAhMenus = new ArrayList<>();
        List<SysAhMenu> menus = findByUser(userName);
        for (SysAhMenu menu : menus) {
            if (menu.getParentId() == null || menu.getParentId() == 0) {
                menu.setLevel(0);
                if (!exists(SysAhMenus, menu)) {
                    SysAhMenus.add(menu);
                }
            }
        }
        SysAhMenus.sort((o1, o2) -> o1.getOrderNum().compareTo(o2.getOrderNum()));
        findChildren(SysAhMenus, menus, menuType);
        return SysAhMenus;
    }

    @Override
    public List<SysAhMenu> findByUser(String userName) {
        if (userName == null || "".equals(userName) || SysConstants.ADMIN.equalsIgnoreCase(userName)) {
            return SysAhMenuMapper.selectAll();
        }
        // return SysAhMenuMapper.findByUserName(userName);
        return null;
    }

    private void findChildren(List<SysAhMenu> SysAhMenus, List<SysAhMenu> menus, int menuType) {
        for (SysAhMenu SysAhMenu : SysAhMenus) {
            List<SysAhMenu> children = new ArrayList<>();
            for (SysAhMenu menu : menus) {
                if (menuType == 1 && menu.getType() == 2) {
                    // 如果是获取类型不需要按钮，且菜单类型是按钮的，直接过滤掉
                    continue;
                }
                if (SysAhMenu.getId() != null && SysAhMenu.getId().equals(menu.getParentId())) {
                    menu.setParentName(SysAhMenu.getName());
                    menu.setLevel(SysAhMenu.getLevel() + 1);
                    if (!exists(children, menu)) {
                        children.add(menu);
                    }
                }
            }
            SysAhMenu.setChildren(children);
            children.sort((o1, o2) -> o1.getOrderNum().compareTo(o2.getOrderNum()));
            findChildren(children, menus, menuType);
        }
    }

    private boolean exists(List<SysAhMenu> SysAhMenus, SysAhMenu SysAhMenu) {
        boolean exist = false;
        for (SysAhMenu menu : SysAhMenus) {
            if (menu.getId().equals(SysAhMenu.getId())) {
                exist = true;
            }
        }
        return exist;
    }

}
