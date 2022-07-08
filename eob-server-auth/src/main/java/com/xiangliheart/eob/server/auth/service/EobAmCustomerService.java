/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.eob.server.auth.service;

import com.xiangliheart.eob.server.auth.entity.EobAmCustomer;
import com.xiangliheart.eob.server.auth.utils.pagehelper.PageRequest;
import com.xiangliheart.eob.server.auth.utils.pagehelper.PageResult;

import java.util.List;

/**
 * EobAmCustomerService
 * 
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/2
 */
public interface EobAmCustomerService {
    int deleteByPrimaryKey(String customerId);

    int insert(EobAmCustomer row);

    int insertSelective(EobAmCustomer row);

    EobAmCustomer findByPrimaryKey(String customerId);

    int updateByPrimaryKeySelective(EobAmCustomer row);

    int updateByPrimaryKey(EobAmCustomer row);

    List<EobAmCustomer> findAll();

    PageResult findPage(PageRequest pageRequest);
}
