package com.xiangliheart.eob.platform.auth.dao;

import com.xiangliheart.eob.platform.auth.entity.EobAhMenu;

/**
 * EobAhMenuMapper
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/10
 */
public interface EobAhMenuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EobAhMenu row);

    int insertSelective(EobAhMenu row);

    EobAhMenu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EobAhMenu row);

    int updateByPrimaryKey(EobAhMenu row);
}