/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.eob.server.auth.dao;

import com.xiangliheart.eob.server.auth.entity.EobAmCustomer;

/**
 * EobAmCustomerMapper
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/3
 */
public interface EobAmCustomerMapper {
    int deleteByPrimaryKey(String customerId);

    int insert(EobAmCustomer row);

    int insertSelective(EobAmCustomer row);

    EobAmCustomer selectByPrimaryKey(String customerId);

    int updateByPrimaryKeySelective(EobAmCustomer row);

    int updateByPrimaryKey(EobAmCustomer row);
}