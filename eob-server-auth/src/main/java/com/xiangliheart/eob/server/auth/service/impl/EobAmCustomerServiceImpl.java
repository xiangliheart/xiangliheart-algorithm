/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.eob.server.auth.service.impl;

import com.xiangliheart.eob.server.auth.dao.EobAmCustomerMapper;
import com.xiangliheart.eob.server.auth.entity.EobAmCustomer;
import com.xiangliheart.eob.server.auth.service.EobAmCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * EobAmCustomerServiceImpl
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/2
 */
@Service
public class EobAmCustomerServiceImpl implements EobAmCustomerService {

    @Autowired
    EobAmCustomerMapper eobAmCustomerMapper;
    /**
     * deleteByPrimaryKey
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/7/2
     * @params: String customerId
     */
    @Override
    public int deleteByPrimaryKey(String customerId) {
        return eobAmCustomerMapper.deleteByPrimaryKey(customerId);
    }

    /**
     * insert
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/7/2
     * @params: EobAmCustomer eobAmCustomer
     */
    @Override
    public int insert(EobAmCustomer eobAmCustomer) {
        return eobAmCustomerMapper.insert(eobAmCustomer);
    }

    /**
     * insertSelective
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/7/2
     * @params: EobAmCustomer eobAmCustomer
     */
    @Override
    public int insertSelective(EobAmCustomer eobAmCustomer) {
        return eobAmCustomerMapper.insertSelective(eobAmCustomer);
    }

    /**
     * selectByPrimaryKey
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/7/2
     * @params: String customerId
     * @return: EobAmCustomer eobAmCustomer
     */
    @Override
    public EobAmCustomer selectByPrimaryKey(String customerId) {
        return eobAmCustomerMapper.selectByPrimaryKey(customerId);
    }

    /**
     * updateByPrimaryKeySelective
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/7/2
     * @params: EobAmCustomer eobAmCustomer
     */
    @Override
    public int updateByPrimaryKeySelective(EobAmCustomer eobAmCustomer) {
        return eobAmCustomerMapper.updateByPrimaryKeySelective(eobAmCustomer);
    }

    /**
     * updateByPrimaryKey
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/7/2
     * @params: EobAmCustomer eobAmCustomer
     */
    @Override
    public int updateByPrimaryKey(EobAmCustomer eobAmCustomer) {
        return eobAmCustomerMapper.updateByPrimaryKey(eobAmCustomer);
    }
}


