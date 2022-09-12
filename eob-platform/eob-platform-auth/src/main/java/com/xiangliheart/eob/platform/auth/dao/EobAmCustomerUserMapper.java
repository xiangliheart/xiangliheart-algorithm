package com.xiangliheart.eob.platform.auth.dao;

import com.xiangliheart.eob.platform.auth.entity.EobAmCustomerUser;

/**
 * EobAmCustomerUserMapper
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/10
 */
public interface EobAmCustomerUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EobAmCustomerUser row);

    int insertSelective(EobAmCustomerUser row);

    EobAmCustomerUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EobAmCustomerUser row);

    int updateByPrimaryKey(EobAmCustomerUser row);
}