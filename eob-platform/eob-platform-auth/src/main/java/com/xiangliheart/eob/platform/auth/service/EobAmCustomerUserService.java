/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.eob.platform.auth.service;

import java.util.Set;

import com.xiangliheart.eob.platform.auth.entity.EobAmCustomerUser;

public interface EobAmCustomerUserService {

    /**
     * findByCustomerUserName 根据用户名查找用户
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/9/16
     */
    EobAmCustomerUser findByCustomerUserName(String customerUserName);

    /**
     * findPermissions 查找用户的菜单权限标识集合
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/9/16
     */
    Set<String> findPermissions(String customerUserName);
}
