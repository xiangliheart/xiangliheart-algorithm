/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.general.platform.service.admin.service;

import java.util.List;

import com.xiangliheart.general.platform.common.repository.service.CurdService;
import com.xiangliheart.general.platform.service.admin.entity.SysStDept;

/**
 * SysStDeptService 机构管理
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/11/27
 */
public interface SysStDeptService extends CurdService<SysStDept> {

    List<SysStDept> findTree();
}
