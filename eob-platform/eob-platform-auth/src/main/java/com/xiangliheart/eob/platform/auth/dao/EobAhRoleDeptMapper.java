package com.xiangliheart.eob.platform.auth.dao;

import com.xiangliheart.eob.platform.auth.entity.EobAhRoleDept;

/**
 * EobAhRoleDeptMapper
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/10
 */
public interface EobAhRoleDeptMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EobAhRoleDept row);

    int insertSelective(EobAhRoleDept row);

    EobAhRoleDept selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EobAhRoleDept row);

    int updateByPrimaryKey(EobAhRoleDept row);
}