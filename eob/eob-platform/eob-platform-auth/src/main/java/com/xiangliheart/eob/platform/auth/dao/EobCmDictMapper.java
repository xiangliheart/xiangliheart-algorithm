package com.xiangliheart.eob.platform.auth.dao;

import com.xiangliheart.eob.platform.auth.entity.EobCmDict;

/**
 * EobCmDictMapper
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/10
 */
public interface EobCmDictMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EobCmDict row);

    int insertSelective(EobCmDict row);

    EobCmDict selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EobCmDict row);

    int updateByPrimaryKey(EobCmDict row);
}