/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.general.platform.service.admin.service;

import java.util.List;

import com.xiangliheart.general.platform.common.repository.pagehelper.PageRequest;
import com.xiangliheart.general.platform.common.repository.pagehelper.PageResult;
import com.xiangliheart.general.platform.service.admin.entity.SysAmCustomer;

/**
 * SysAmCustomerService
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/2
 */
public interface SysAmCustomerService {
    int deleteByPrimaryKey(String customerId);

    int insert(SysAmCustomer row);

    int insertSelective(SysAmCustomer row);

    SysAmCustomer findByPrimaryKey(String customerId);

    int updateByPrimaryKeySelective(SysAmCustomer row);

    int updateByPrimaryKey(SysAmCustomer row);

    List<SysAmCustomer> findAll();

    PageResult findPage(PageRequest pageRequest);
}
