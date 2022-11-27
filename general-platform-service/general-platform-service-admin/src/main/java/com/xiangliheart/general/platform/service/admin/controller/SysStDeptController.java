/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.general.platform.service.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.xiangliheart.general.platform.common.web.http.HttpResult;
import com.xiangliheart.general.platform.service.admin.entity.SysStDept;
import com.xiangliheart.general.platform.service.admin.service.SysStDeptService;

/**
 * SysStDeptController 机构控制器
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/11/27
 */
@RestController
@RequestMapping("dept")
public class SysStDeptController {

    @Autowired
    private SysStDeptService sysStDeptService;

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
