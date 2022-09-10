package com.xiangliheart.eob.platform.auth.service.impl;

import com.xiangliheart.eob.platform.auth.entity.EobAmCustomerUser;
import com.xiangliheart.eob.platform.auth.service.EobAmCustomerUserService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * EobAmCustomerUserServiceImpl
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/10
 */
@Service("customerUserService")
public class EobAmCustomerUserServiceImpl implements EobAmCustomerUserService {
    @Override
    public EobAmCustomerUser findByCustomerUserName(String name) {
        EobAmCustomerUser customerUser = new EobAmCustomerUser();
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
