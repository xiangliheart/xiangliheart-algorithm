/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.modules.service.admin.service;

import java.util.List;

import com.xiangliheart.modules.common.repository.service.CurdService;
import com.xiangliheart.modules.service.admin.entity.SysCmConfig;

/**
 * SysCmConfigService 系统配置管理
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/11/27
 */
public interface SysCmConfigService extends CurdService<SysCmConfig> {

    List<SysCmConfig> findByLable(String lable);
}