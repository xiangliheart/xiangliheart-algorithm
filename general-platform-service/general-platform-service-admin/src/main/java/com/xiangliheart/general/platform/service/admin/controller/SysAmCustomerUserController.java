package com.xiangliheart.general.platform.service.admin.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xiangliheart.general.platform.common.web.http.HttpResult;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * SysAmCustomerUserController 用户控制器
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/10
 */
@RestController
@RequestMapping("user")
@Api(tags = "用户信息管理-SysAmCustomerUserController")
public class SysAmCustomerUserController {

    @PreAuthorize("hasAuthority('sys:user:view')")
    @GetMapping(value = "/view")
    @ApiOperation(value = "查询用户信息", notes = "查询用户信息")
    public HttpResult view() {
        return HttpResult.ok("the findAll service is called success.");
    }

    @PreAuthorize("hasAuthority('sys:user:edit')")
    @GetMapping(value = "/edit")
    @ApiOperation(value = "修改用户信息", notes = "修改用户信息")
    public HttpResult edit() {
        return HttpResult.ok("the edit service is called success.");
    }

    @PreAuthorize("hasAuthority('sys:user:delete')")
    @GetMapping(value = "/delete")
    @ApiOperation(value = "删除用户信息", notes = "删除用户信息")
    public HttpResult delete() {
        return HttpResult.ok("the delete service is called success.");
    }
}
