/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.general.platform.service.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.xiangliheart.general.platform.common.repository.pagehelper.PageRequest;
import com.xiangliheart.general.platform.common.web.http.HttpResult;
import com.xiangliheart.general.platform.service.admin.entity.SysCmConfig;
import com.xiangliheart.general.platform.service.admin.service.SysCmConfigService;

/**
 * SysCmConfigController 系统配置控制器
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/11/27
 */
@RestController
@RequestMapping("config")
public class SysCmConfigController {

    @Autowired
    private SysCmConfigService sysCmConfigService;

    @PostMapping(value = "/save")
    public HttpResult save(@RequestBody SysCmConfig record) {
        return HttpResult.ok(sysCmConfigService.save(record));
    }

    @PostMapping(value = "/delete")
    public HttpResult delete(@RequestBody List<SysCmConfig> records) {
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
