package com.xiangliheart.eob.platform.auth.dao;

import com.xiangliheart.eob.platform.auth.entity.EobAhRoleMenu;

/**
 * EobAhRoleMenuMapper
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/10
 */
public interface EobAhRoleMenuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EobAhRoleMenu row);

    int insertSelective(EobAhRoleMenu row);

    EobAhRoleMenu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EobAhRoleMenu row);

    int updateByPrimaryKey(EobAhRoleMenu row);
}