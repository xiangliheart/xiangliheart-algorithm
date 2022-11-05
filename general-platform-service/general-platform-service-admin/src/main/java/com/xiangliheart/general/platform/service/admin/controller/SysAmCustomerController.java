/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.general.platform.service.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.xiangliheart.general.platform.common.repository.pagehelper.PageRequest;
import com.xiangliheart.general.platform.service.admin.entity.SysAmCustomer;
import com.xiangliheart.general.platform.service.admin.service.SysAmCustomerService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * SysAmCustomerController
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/2
 */
@Api(tags = "SysAmCustomerController-客户管理")
@RestController
@RequestMapping("/sysAmCustomer")
public class SysAmCustomerController {
    @Autowired
    SysAmCustomerService sysAmCustomerService;

    /**
     * createtSingle
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/7/2
     * @params: SysAmCustomer
     */
    @ApiOperation(value = "创建单条客户信息", notes = "创建单条客户信息")
    @PostMapping(value = "/create/single")
    public Object createSingle(@RequestBody SysAmCustomer sysAmCustomer) {
        return sysAmCustomerService.insert(sysAmCustomer);
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
    public Object createList(@RequestParam List<SysAmCustomer> sysAmCustomers) {
        return null;
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
    public SysAmCustomer querySingle(@RequestParam String customerId) {
        return sysAmCustomerService.findByPrimaryKey(customerId);
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
    public Object modifySingle(@RequestParam SysAmCustomer sysAmCustomer) {
        return sysAmCustomerService.updateByPrimaryKeySelective(sysAmCustomer);
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
    public Object modifyList(@RequestParam List<SysAmCustomer> sysAmCustomers) {
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
    public Object deleteSingle(@RequestParam String customerId) {
        return sysAmCustomerService.deleteByPrimaryKey(customerId);
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
