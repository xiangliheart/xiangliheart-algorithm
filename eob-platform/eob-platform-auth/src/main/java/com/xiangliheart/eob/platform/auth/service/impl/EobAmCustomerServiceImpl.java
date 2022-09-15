/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.eob.platform.auth.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiangliheart.eob.common.repository.pagehelper.PageRequest;
import com.xiangliheart.eob.common.repository.pagehelper.PageResult;
import com.xiangliheart.eob.common.repository.pagehelper.PageUtils;
import com.xiangliheart.eob.platform.auth.dao.EobAmCustomerMapper;
import com.xiangliheart.eob.platform.auth.entity.EobAmCustomer;
import com.xiangliheart.eob.platform.auth.service.EobAmCustomerService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * EobAmCustomerServiceImpl
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/2
 */
@Service("eobAmCustomerService")
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
        Example example = new Example(EobAmCustomer.class);

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
        RowBounds rowBounds = new RowBounds(pageRequest.getPageNum(), pageRequest.getPageSize());
        Example example = new Example(EobAmCustomer.class);
        List<EobAmCustomer> eobAmCustomers = eobAmCustomerMapper.selectByExampleAndRowBounds(example, rowBounds);
        return new PageInfo<EobAmCustomer>(eobAmCustomers);
    }
}


