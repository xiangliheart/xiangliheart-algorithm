/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.modules.service.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.xiangliheart.modules.common.web.http.HttpResult;
import com.xiangliheart.modules.service.admin.entity.SysAhMenu;
import com.xiangliheart.modules.service.admin.service.SysAhMenuService;

/**
 * SysAhMenuController 菜单控制器
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/11/27
 */
@RestController
@RequestMapping("menu")
public class SysAhMenuController {
    @Autowired
    private SysAhMenuService sysAhMenuService;

    @PostMapping(value = "/save")
    public HttpResult save(@RequestBody SysAhMenu record) {
        return HttpResult.ok(sysAhMenuService.save(record));
    }

    @PostMapping(value = "/delete")
    public HttpResult delete(@RequestBody List<SysAhMenu> records) {
        return HttpResult.ok(sysAhMenuService.delete(records));
    }

    @GetMapping(value = "/findNavTree")
    public HttpResult findNavTree(@RequestParam String userName) {
        return HttpResult.ok(sysAhMenuService.findTree(userName, 1));
    }

    @GetMapping(value = "/findMenuTree")
    public HttpResult findMenuTree() {
        return HttpResult.ok(sysAhMenuService.findTree(null, 0));
    }
}
