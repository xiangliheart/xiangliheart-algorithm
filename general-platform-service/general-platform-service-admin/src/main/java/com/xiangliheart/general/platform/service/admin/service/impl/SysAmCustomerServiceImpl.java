/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.general.platform.service.admin.service.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.xiangliheart.general.platform.common.repository.pagehelper.PageRequest;
import com.xiangliheart.general.platform.service.admin.dao.SysAmCustomerMapper;
import com.xiangliheart.general.platform.service.admin.entity.SysAmCustomer;
import com.xiangliheart.general.platform.service.admin.service.SysAmCustomerService;

import tk.mybatis.mapper.entity.Example;

/**
 * SysAmCustomerServiceImpl
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/2
 */
@Service
public class SysAmCustomerServiceImpl implements SysAmCustomerService {

    @Autowired
    SysAmCustomerMapper sysAmCustomerMapper;

    @Override
    public int save(SysAmCustomer record) {
        return sysAmCustomerMapper.insert(record);
    }

    @Override
    public int saveList(List<SysAmCustomer> records) {
        return sysAmCustomerMapper.insertList(records);
    }

    @Override
    public int delete(SysAmCustomer record) {
        return sysAmCustomerMapper.delete(record);
    }

    @Override
    public int delete(List<SysAmCustomer> records) {
        return 0;
    }

    @Override
    public int update(SysAmCustomer record) {
        return sysAmCustomerMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public SysAmCustomer findById(Long id) {
        return sysAmCustomerMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageInfo findPage(PageRequest pageRequest) {
        RowBounds rowBounds = new RowBounds(pageRequest.getPageNum(), pageRequest.getPageSize());
        Example example = new Example(SysAmCustomer.class);
        List<SysAmCustomer> sysAmCustomers = sysAmCustomerMapper.selectByExampleAndRowBounds(example, rowBounds);
        return new PageInfo(sysAmCustomers);
    }
}
