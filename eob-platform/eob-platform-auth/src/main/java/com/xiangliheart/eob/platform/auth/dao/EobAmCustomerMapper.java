package com.xiangliheart.eob.platform.auth.dao;

import com.xiangliheart.eob.platform.auth.entity.EobAmCustomer;

import java.util.List;

public interface EobAmCustomerMapper {
    int deleteByPrimaryKey(String id);

    int insert(EobAmCustomer row);

    int insertSelective(EobAmCustomer row);

    EobAmCustomer selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(EobAmCustomer row);

    int updateByPrimaryKey(EobAmCustomer row);

    List<EobAmCustomer> selectAll();

    List<EobAmCustomer> selectPage();
}