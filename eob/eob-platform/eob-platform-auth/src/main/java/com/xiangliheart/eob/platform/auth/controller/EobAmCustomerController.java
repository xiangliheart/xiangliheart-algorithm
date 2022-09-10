/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.eob.platform.auth.controller;

import com.xiangliheart.eob.platform.auth.utils.pagehelper.PageRequest;
import com.xiangliheart.eob.platform.auth.entity.EobAmCustomer;
import com.xiangliheart.eob.platform.auth.service.EobAmCustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * EobAmCustomerController
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/2
 */
@Api(tags = "EobAmCustomerController-客户管理")
@RestController
@RequestMapping("/eobAmCustomer")
public class EobAmCustomerController {
    @Autowired
    EobAmCustomerService eobAmCustomerService;


    /**
     * createtSingle
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/7/2
     * @params: EobAmCustomer eobAmCustomer
     */
    @ApiOperation(value = "创建单条客户信息", notes = "创建单条客户信息")
    @PostMapping(value = "/create/single")
    public Object createSingle(@RequestBody EobAmCustomer eobAmCustomer) {
        return eobAmCustomerService.insert(eobAmCustomer);
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
    public Object createList(@RequestParam List<EobAmCustomer> eobAmCustomerList) {
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
    public EobAmCustomer querySingle(@RequestParam String customerId) {
        EobAmCustomer eobAmCustomer = eobAmCustomerService.findByPrimaryKey(customerId);
        return eobAmCustomer;
    }

    /**
     * queryPage
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/7/2
     * @params: EobAmCustomer eobAmCustomer
     */
    @ApiOperation(value = "分页查询客户信息", notes = "分页查询客户信息")
    @PostMapping(value = "/query/page")
    public Object queryPage(@RequestBody PageRequest pageRequest) {
        return eobAmCustomerService.findPage(pageRequest);
    }

    /**
     * updateByPrimaryKeySelective
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/7/2
     * @params: EobAmCustomer eobAmCustomer
     */
    @ApiOperation(value = "修改单条客户信息", notes = "修改单条客户信息")
    @PostMapping(value = "/modify/single")
    public Object modifySingle(@RequestParam EobAmCustomer eobAmCustomer) {
        return eobAmCustomerService.updateByPrimaryKeySelective(eobAmCustomer);
    }

    /**
     * updateByPrimaryKey
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/7/2
     * @params: List<EobAmCustomer> eobAmCustomerList
     */
    @ApiOperation(value = "批量修改客户信息", notes = "批量修改客户信息")
    @PostMapping(value = "/modify/list")
    public Object modifyList(@RequestParam List<EobAmCustomer> eobAmCustomerList) {
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
        return eobAmCustomerService.deleteByPrimaryKey(customerId);
    }

    /**
     * deleteList
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/7/2
     * @params: List<String> customerIdList
     */
    @ApiOperation(value = "批量删除客户信息", notes = "批量删除客户信息")
    @PostMapping(value = "/delete/list")
    public Object deleteList(@RequestParam List<String> customerIdList) {
        return null;
    }
}
