package com.xiangliheart.eob.platform.auth.dao;

import com.xiangliheart.eob.platform.auth.entity.EobAhLoginLog;

/**
 * EobAhLoginLogMapper
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/10
 */
public interface EobAhLoginLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EobAhLoginLog row);

    int insertSelective(EobAhLoginLog row);

    EobAhLoginLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EobAhLoginLog row);

    int updateByPrimaryKey(EobAhLoginLog row);
}