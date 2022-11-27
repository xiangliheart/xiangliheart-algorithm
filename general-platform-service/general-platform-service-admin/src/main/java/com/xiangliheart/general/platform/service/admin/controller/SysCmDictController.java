/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.general.platform.service.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.xiangliheart.general.platform.common.repository.pagehelper.PageRequest;
import com.xiangliheart.general.platform.common.web.http.HttpResult;
import com.xiangliheart.general.platform.service.admin.entity.SysCmDict;
import com.xiangliheart.general.platform.service.admin.service.SysCmDictService;

/**
 * SysCmDictController 字典控制器
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/11/27
 */
@RestController
@RequestMapping("dict")
public class SysCmDictController {

    @Autowired
    private SysCmDictService sysCmDictService;

    @PostMapping(value = "/save")
    public HttpResult save(@RequestBody SysCmDict record) {
        return HttpResult.ok(sysCmDictService.save(record));
    }

    @PostMapping(value = "/delete")
    public HttpResult delete(@RequestBody List<SysCmDict> records) {
        return HttpResult.ok(sysCmDictService.delete(records));
    }

    @PostMapping(value = "/findPage")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(sysCmDictService.findPage(pageRequest));
    }

    @GetMapping(value = "/findByLable")
    public HttpResult findByLable(@RequestParam String lable) {
        return HttpResult.ok(sysCmDictService.findByLable(lable));
    }
}
