package com.xiangliheart.eob.platform.auth.dao;

import com.xiangliheart.eob.platform.auth.entity.EobAhRole;

/**
 * EobAhRoleMapper
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/10
 */
public interface EobAhRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EobAhRole row);

    int insertSelective(EobAhRole row);

    EobAhRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EobAhRole row);

    int updateByPrimaryKey(EobAhRole row);
}