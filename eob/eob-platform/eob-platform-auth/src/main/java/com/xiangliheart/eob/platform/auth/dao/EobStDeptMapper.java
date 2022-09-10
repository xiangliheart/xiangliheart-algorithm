package com.xiangliheart.eob.platform.auth.dao;

import com.xiangliheart.eob.platform.auth.entity.EobStDept;

/**
 * EobStDeptMapper
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/10
 */
public interface EobStDeptMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EobStDept row);

    int insertSelective(EobStDept row);

    EobStDept selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EobStDept row);

    int updateByPrimaryKey(EobStDept row);
}