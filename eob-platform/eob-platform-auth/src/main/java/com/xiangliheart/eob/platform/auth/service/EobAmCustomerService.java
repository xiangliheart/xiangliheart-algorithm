/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.eob.platform.auth.service;

import com.xiangliheart.eob.common.repository.pagehelper.PageRequest;
import com.xiangliheart.eob.common.repository.pagehelper.PageResult;
import com.xiangliheart.eob.platform.auth.entity.EobAmCustomer;

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
