/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.general.platform.service.admin.service;

import java.util.Set;

import com.xiangliheart.general.platform.common.repository.service.CurdService;
import com.xiangliheart.general.platform.service.admin.entity.SysAmCustomerUser;

public interface SysAmCustomerUserService extends CurdService<SysAmCustomerUser> {
    /**
     * findByCustomerUserName 根据用户名查找用户
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/9/16
     */
    SysAmCustomerUser findByCustomerUserName(String customerUserName);

    /**
     * findPermissions 查找用户的菜单权限标识集合
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/9/16
     */
    Set<String> findPermissions(String customerUserName);

}
