package com.xiangliheart.eob.platform.auth.service.impl;

import com.xiangliheart.eob.common.security.security.GrantedAuthorityImpl;
import com.xiangliheart.eob.common.security.security.JwtUserDetails;
import com.xiangliheart.eob.platform.auth.entity.EobAmCustomerUser;
import com.xiangliheart.eob.platform.auth.service.EobAmCustomerUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * UserDetailsServiceImpl 用户登录认证信息查询
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/10
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private EobAmCustomerUserService customerUserService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        EobAmCustomerUser customerUser = customerUserService.findByCustomerUserName(username);
        if (customerUser == null) {
            throw new UsernameNotFoundException("该用户不存在");
        }
        // 用户权限列表，根据用户拥有的权限标识与如 @PreAuthorize("hasAuthority('sys:menu:view')") 标注的接口对比，决定是否可以调用接口
        Set<String> permissions = customerUserService.findPermissions(customerUser.getName());
        List<GrantedAuthority> grantedAuthorities = permissions.stream().map(GrantedAuthorityImpl::new).collect(Collectors.toList());
        return new JwtUserDetails(customerUser.getName(), customerUser.getPassword(), customerUser.getSalt(), grantedAuthorities);
    }
}