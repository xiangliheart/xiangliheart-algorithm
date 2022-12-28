/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.modules.service.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.xiangliheart.modules.common.web.http.HttpResult;
import com.xiangliheart.modules.service.admin.entity.SysStDept;
import com.xiangliheart.modules.service.admin.service.SysDeptService;

/**
 * SysDeptController 机构控制器
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/11/27
 */
@RestController
@RequestMapping("机构管理-dept")
public class SysDeptController {

    @Autowired
    private SysDeptService sysStDeptService;

    @PostMapping(value = "/save")
    public HttpResult save(@RequestBody SysStDept record) {
        return HttpResult.ok(sysStDeptService.save(record));
    }

    @PostMapping(value = "/delete")
    public HttpResult delete(@RequestBody List<SysStDept> records) {
        return HttpResult.ok(sysStDeptService.delete(records));
    }

    @GetMapping(value = "/findTree")
    public HttpResult findTree() {
        return HttpResult.ok(sysStDeptService.findTree());
    }
}
