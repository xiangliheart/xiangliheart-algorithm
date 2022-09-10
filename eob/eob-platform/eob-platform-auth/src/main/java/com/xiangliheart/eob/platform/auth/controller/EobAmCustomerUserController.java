package com.xiangliheart.eob.platform.auth.controller;

import com.xiangliheart.eob.common.web.http.HttpResult;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * EobAmCustomerUserController 用户控制器
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/10
 */
@RestController
@RequestMapping("user")
public class EobAmCustomerUserController {

    @PreAuthorize("hasAuthority('sys:user:view')")
    @GetMapping(value = "/findAll")
    public HttpResult findAll() {
        return HttpResult.ok("the findAll service is called success.");
    }

    @PreAuthorize("hasAuthority('sys:user:edit')")
    @GetMapping(value = "/edit")
    public HttpResult edit() {
        return HttpResult.ok("the edit service is called success.");
    }

    @PreAuthorize("hasAuthority('sys:user:delete')")
    @GetMapping(value = "/delete")
    public HttpResult delete() {
        return HttpResult.ok("the delete service is called success.");
    }
}
