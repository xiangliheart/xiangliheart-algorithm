package com.xiangliheart.eob.platform.auth.dao;

import com.xiangliheart.eob.platform.auth.entity.EobCmConfig;

/**
 * EobCmConfigMapper
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/10
 */
public interface EobCmConfigMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EobCmConfig row);

    int insertSelective(EobCmConfig row);

    EobCmConfig selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EobCmConfig row);

    int updateByPrimaryKey(EobCmConfig row);
}