/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.modules.service.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xiangliheart.modules.common.repository.pagehelper.PageRequest;
import com.xiangliheart.modules.common.web.http.HttpResult;
import com.xiangliheart.modules.service.admin.entity.SysLog;
import com.xiangliheart.modules.service.admin.service.SysLogService;

/**
 * SysLogController 操作日志控制器
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/11/27
 */
@RestController
@RequestMapping("log")
public class SysLogController {

    @Autowired
    private SysLogService sysCmLogService;

    @PostMapping(value = "/findPage")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(sysCmLogService.findPage(pageRequest));
    }

    @PostMapping(value = "/delete")
    public HttpResult delete(@RequestBody List<SysLog> records) {
        return HttpResult.ok(sysCmLogService.delete(records));
    }
}
