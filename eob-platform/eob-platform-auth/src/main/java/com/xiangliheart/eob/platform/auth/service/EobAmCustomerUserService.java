package com.xiangliheart.eob.platform.auth.service;

import com.xiangliheart.eob.platform.auth.entity.EobAmCustomerUser;

import java.util.Set;

public interface EobAmCustomerUserService {

    /**
     * 根据用户名查找用户
     *
     * @param username
     * @return
     */
    EobAmCustomerUser findByCustomerUserName(String customerUserName);

    /**
     * 查找用户的菜单权限标识集合
     *
     * @param userName
     * @return
     */
    Set<String> findPermissions(String customerUserName);
}
