package com.xiangliheart.general.platform.service.admin.service.impl;

import java.util.HashSet;
import java.util.Set;

import com.xiangliheart.general.platform.service.admin.entity.SysAmCustomerUser;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.xiangliheart.general.platform.service.admin.service.SysAmCustomerUserService;

/**
 * SysAmCustomerUserServiceImpl
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/10
 */
@Service
public class SysAmCustomerUserServiceImpl implements SysAmCustomerUserService {
    @Override
    public SysAmCustomerUser findByCustomerUserName(String name) {
        SysAmCustomerUser customerUser = new SysAmCustomerUser();
        customerUser.setId(1L);
        customerUser.setName(name);
        String password = new BCryptPasswordEncoder().encode("123");
        customerUser.setPassword(password);
        return customerUser;
    }

    @Override
    public Set<String> findPermissions(String customerUserName) {
        Set<String> permissions = new HashSet<>();
        permissions.add("sys:user:view");
        permissions.add("sys:user:add");
        permissions.add("sys:user:edit");
        permissions.add("sys:user:delete");
        return permissions;
    }
}
