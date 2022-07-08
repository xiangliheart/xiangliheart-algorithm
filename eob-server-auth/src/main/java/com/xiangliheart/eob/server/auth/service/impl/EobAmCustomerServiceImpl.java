/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.eob.server.auth.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiangliheart.eob.server.auth.dao.EobAmCustomerMapper;
import com.xiangliheart.eob.server.auth.entity.EobAmCustomer;
import com.xiangliheart.eob.server.auth.service.EobAmCustomerService;
import com.xiangliheart.eob.server.auth.utils.pagehelper.PageRequest;
import com.xiangliheart.eob.server.auth.utils.pagehelper.PageResult;
import com.xiangliheart.eob.server.auth.utils.pagehelper.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public EobAmCustomer findByPrimaryKey(String customerId) {
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

    /**
     * findAll
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/7/9
     */
    @Override
    public List<EobAmCustomer> findAll() {
        return eobAmCustomerMapper.selectAll();
    }

    /**
     * findPage
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/7/9
     */
    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return PageUtils.getPageResult(pageRequest, getPageInfo(pageRequest));
    }

    /**
     * getPageInfo 调用分页插件完成分页
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/7/9
     */
    private PageInfo<EobAmCustomer> getPageInfo(PageRequest pageRequest) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<EobAmCustomer> eobAmCustomers = eobAmCustomerMapper.selectPage();
        return new PageInfo<EobAmCustomer>(eobAmCustomers);
    }
}


