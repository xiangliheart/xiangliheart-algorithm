/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.general.platform.service.admin.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.xiangliheart.general.platform.service.admin.service.SysAmCustomerService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.xiangliheart.general.platform.common.repository.pagehelper.PageRequest;
import com.xiangliheart.general.platform.common.repository.pagehelper.PageResult;
import com.xiangliheart.general.platform.common.repository.pagehelper.PageUtils;
import com.xiangliheart.general.platform.service.admin.dao.SysAmCustomerMapper;
import com.xiangliheart.general.platform.service.admin.entity.SysAmCustomer;

import tk.mybatis.mapper.entity.Example;

/**
 * SysAmCustomerServiceImpl
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/2
 */
@Service
public class SysAmCustomerServiceImpl implements SysAmCustomerService {

    @Resource
    SysAmCustomerMapper sysAmCustomerMapper;

    /**
     * deleteByPrimaryKey
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/7/2
     * @params: String customerId
     */
    @Override
    public int deleteByPrimaryKey(String customerId) {
        return sysAmCustomerMapper.deleteByPrimaryKey(customerId);
    }

    /**
     * insert
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/7/2
     * @params: EobAmCustomer eobAmCustomer
     */
    @Override
    public int insert(SysAmCustomer eobAmCustomer) {
        Example example = new Example(SysAmCustomer.class);

        return sysAmCustomerMapper.insert(eobAmCustomer);
    }

    /**
     * insertSelective
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/7/2
     * @params: EobAmCustomer eobAmCustomer
     */
    @Override
    public int insertSelective(SysAmCustomer eobAmCustomer) {
        return sysAmCustomerMapper.insertSelective(eobAmCustomer);
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
    public SysAmCustomer findByPrimaryKey(String customerId) {
        return sysAmCustomerMapper.selectByPrimaryKey(customerId);
    }

    /**
     * updateByPrimaryKeySelective
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/7/2
     * @params: EobAmCustomer SysAmCustomer
     */
    @Override
    public int updateByPrimaryKeySelective(SysAmCustomer eobAmCustomer) {
        return sysAmCustomerMapper.updateByPrimaryKeySelective(eobAmCustomer);
    }

    /**
     * updateByPrimaryKey
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/7/2
     * @params: SysAmCustomer eobAmCustomer
     */
    @Override
    public int updateByPrimaryKey(SysAmCustomer eobAmCustomer) {
        return sysAmCustomerMapper.updateByPrimaryKey(eobAmCustomer);
    }

    /**
     * findAll
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/7/9
     */
    @Override
    public List<SysAmCustomer> findAll() {
        return sysAmCustomerMapper.selectAll();
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
    private PageInfo<SysAmCustomer> getPageInfo(PageRequest pageRequest) {
        RowBounds rowBounds = new RowBounds(pageRequest.getPageNum(), pageRequest.getPageSize());
        Example example = new Example(SysAmCustomer.class);
        List<SysAmCustomer> eobAmCustomers = sysAmCustomerMapper.selectByExampleAndRowBounds(example, rowBounds);
        return new PageInfo<SysAmCustomer>(eobAmCustomers);
    }
}
