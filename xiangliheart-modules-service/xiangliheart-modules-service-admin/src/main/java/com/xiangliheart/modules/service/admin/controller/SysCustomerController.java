/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.modules.service.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xiangliheart.modules.common.repository.pagehelper.PageRequest;
import com.xiangliheart.modules.service.admin.entity.SysCustomer;
import com.xiangliheart.modules.service.admin.service.SysCustomerService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

/**
 * SysCustomerController
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/2
 */
@Api(tags = "客户信息管理-SysAmCustomerController")
@RestController
@RequestMapping("/sysAmCustomer")
public class SysCustomerController {
    @Autowired
    SysCustomerService sysAmCustomerService;

    /**
     * createtSingle
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/7/2
     * @params: SysAmCustomer
     */
    @ApiOperation(value = "创建单条客户信息", notes = "创建单条客户信息")
    @PostMapping(value = "/create/single", consumes = {MediaType.APPLICATION_JSON_VALUE},
        produces = {MediaType.APPLICATION_JSON_VALUE})
    @ApiImplicitParam(name = "sysAmCustomer", value = "客户信息", paramType = "body", dataTypeClass = SysCustomer.class)
    public Object createSingle(@RequestBody SysCustomer sysAmCustomer) {
        return sysAmCustomerService.save(sysAmCustomer);
    }

    /**
     * createList
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/7/2
     * @params: List<EobAmCustomer> eobAmCustomerList
     */
    @ApiOperation(value = "批量创建客户信息", notes = "批量创建客户信息")
    @PostMapping(value = "/create/list")
    public Object createList(@RequestParam List<SysCustomer> sysAmCustomers) {
        return sysAmCustomerService.saveList(sysAmCustomers);
    }

    /**
     * querySingle
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/7/2
     * @params: String customerId
     */
    @ApiOperation(value = "查询单条客户信息", notes = "查询单条客户信息")
    @PostMapping(value = "/query/single")
    public SysCustomer querySingle(@RequestParam Long customerId) {
        return sysAmCustomerService.findById(customerId);
    }

    /**
     * queryPage
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/7/2
     * @params: PageRequest
     */
    @ApiOperation(value = "分页查询客户信息", notes = "分页查询客户信息")
    @PostMapping(value = "/query/page")
    public Object queryPage(@RequestBody PageRequest pageRequest) {
        return sysAmCustomerService.findPage(pageRequest);
    }

    /**
     * updateByPrimaryKeySelective
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/7/2
     * @params: SysAmCustomer sysAmCustomer
     */
    @ApiOperation(value = "修改单条客户信息", notes = "修改单条客户信息")
    @PostMapping(value = "/modify/single")
    public Object modifySingle(@RequestParam SysCustomer sysAmCustomer) {
        return sysAmCustomerService.update(sysAmCustomer);
    }

    /**
     * modifyList
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/7/2
     * @params: List<SysAmCustomer> sysAmCustomers
     */
    @ApiOperation(value = "批量修改客户信息", notes = "批量修改客户信息")
    @PostMapping(value = "/modify/list")
    public Object modifyList(@RequestParam List<SysCustomer> sysAmCustomers) {
        return null;
    }

    /**
     * deleteSingle
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/7/2
     * @params: String customerId
     */
    @PostMapping(value = "/delete/single")
    @ApiOperation(value = "删除单个客户信息", notes = "删除单个客户信息")
    public Object deleteSingle(@RequestParam SysCustomer sysAmCustomer) {
        return sysAmCustomerService.delete(sysAmCustomer);
    }

    /**
     * deleteList
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/7/2
     * @params: List<String> customerIds
     */
    @ApiOperation(value = "批量删除客户信息", notes = "批量删除客户信息")
    @PostMapping(value = "/delete/list")
    public Object deleteList(@RequestParam List<String> customerIds) {
        return null;
    }
}
