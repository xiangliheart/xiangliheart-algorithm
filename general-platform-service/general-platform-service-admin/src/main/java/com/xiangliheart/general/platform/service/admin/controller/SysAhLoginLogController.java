/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.general.platform.service.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xiangliheart.general.platform.common.repository.pagehelper.PageRequest;
import com.xiangliheart.general.platform.common.web.http.HttpResult;
import com.xiangliheart.general.platform.service.admin.entity.SysAhLoginLog;
import com.xiangliheart.general.platform.service.admin.service.SysAhLoginLogService;

/**
 * SysAhLoginLogController 登录日志控制器
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/11/27
 */
@RestController
@RequestMapping("loginlog")
public class SysAhLoginLogController {

    @Autowired
    private SysAhLoginLogService sysAhLoginLogService;

    @PostMapping(value = "/findPage")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(sysAhLoginLogService.findPage(pageRequest));
    }

    @PostMapping(value = "/delete")
    public HttpResult delete(@RequestBody List<SysAhLoginLog> records) {
        return HttpResult.ok(sysAhLoginLogService.delete(records));
    }
}
