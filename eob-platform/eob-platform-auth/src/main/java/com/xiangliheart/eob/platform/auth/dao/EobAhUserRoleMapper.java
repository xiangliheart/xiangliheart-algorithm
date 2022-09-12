package com.xiangliheart.eob.platform.auth.dao;

import com.xiangliheart.eob.platform.auth.entity.EobAhUserRole;

/**
 * EobAhUserRoleMapper
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/10
 */
public interface EobAhUserRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EobAhUserRole row);

    int insertSelective(EobAhUserRole row);

    EobAhUserRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EobAhUserRole row);

    int updateByPrimaryKey(EobAhUserRole row);
}