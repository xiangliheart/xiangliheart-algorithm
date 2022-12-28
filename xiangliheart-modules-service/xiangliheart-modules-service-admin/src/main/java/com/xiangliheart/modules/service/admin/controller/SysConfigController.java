/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.modules.service.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.xiangliheart.modules.common.repository.pagehelper.PageRequest;
import com.xiangliheart.modules.common.web.http.HttpResult;
import com.xiangliheart.modules.service.admin.entity.SysConfig;
import com.xiangliheart.modules.service.admin.service.SysConfigService;

/**
 * SysConfigController 系统配置控制器
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/11/27
 */
@RestController
@RequestMapping("config")
public class SysConfigController {

    @Autowired
    private SysConfigService sysCmConfigService;

    @PostMapping(value = "/save")
    public HttpResult save(@RequestBody SysConfig record) {
        return HttpResult.ok(sysCmConfigService.save(record));
    }

    @PostMapping(value = "/delete")
    public HttpResult delete(@RequestBody List<SysConfig> records) {
        return HttpResult.ok(sysCmConfigService.delete(records));
    }

    @PostMapping(value = "/findPage")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(sysCmConfigService.findPage(pageRequest));
    }

    @GetMapping(value = "/findByLable")
    public HttpResult findByLable(@RequestParam String lable) {
        return HttpResult.ok(sysCmConfigService.findByLable(lable));
    }
}
