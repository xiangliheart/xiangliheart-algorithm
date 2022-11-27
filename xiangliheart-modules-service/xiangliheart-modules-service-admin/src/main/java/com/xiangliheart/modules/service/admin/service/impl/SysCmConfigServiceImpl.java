/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.modules.service.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.xiangliheart.modules.common.repository.pagehelper.PageRequest;
import com.xiangliheart.modules.service.admin.entity.SysCmConfig;
import com.xiangliheart.modules.service.admin.service.SysCmConfigService;

@Service
public class SysCmConfigServiceImpl implements SysCmConfigService {

    @Autowired
    private com.xiangliheart.modules.service.admin.dao.SysCmConfigMapper SysCmConfigMapper;

    @Override
    public int save(SysCmConfig record) {
        if (record.getId() == null || record.getId() == 0) {
            return SysCmConfigMapper.insertSelective(record);
        }
        return SysCmConfigMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int saveList(List<SysCmConfig> records) {
        return 0;
    }

    @Override
    public int delete(SysCmConfig record) {
        return SysCmConfigMapper.deleteByPrimaryKey(record.getId());
    }

    @Override
    public int delete(List<SysCmConfig> records) {
        return 0;
    }

    @Override
    public int update(SysCmConfig record) {
        return 0;
    }

    @Override
    public SysCmConfig findById(Long id) {
        return null;
    }

    @Override
    public PageInfo findPage(PageRequest pageRequest) {
        return null;
    }

    @Override
    public List<SysCmConfig> findByLable(String lable) {
        return null;
    }
}
