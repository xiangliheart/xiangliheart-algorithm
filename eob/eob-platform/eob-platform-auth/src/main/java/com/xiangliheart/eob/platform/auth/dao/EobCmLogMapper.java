package com.xiangliheart.eob.platform.auth.dao;

import com.xiangliheart.eob.platform.auth.entity.EobCmLog;

/**
 * EobCmLogMapper
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/10
 */
public interface EobCmLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EobCmLog row);

    int insertSelective(EobCmLog row);

    EobCmLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EobCmLog row);

    int updateByPrimaryKey(EobCmLog row);
}