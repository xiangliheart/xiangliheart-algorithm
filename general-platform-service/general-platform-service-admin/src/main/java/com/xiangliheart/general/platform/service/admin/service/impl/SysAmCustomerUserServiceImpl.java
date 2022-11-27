package com.xiangliheart.general.platform.service.admin.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.xiangliheart.general.platform.common.repository.pagehelper.PageRequest;
import com.xiangliheart.general.platform.service.admin.dao.SysAmCustomerUserMapper;
import com.xiangliheart.general.platform.service.admin.entity.SysAmCustomerUser;
import com.xiangliheart.general.platform.service.admin.service.SysAmCustomerUserService;

import tk.mybatis.mapper.entity.Example;

/**
 * SysAmCustomerUserServiceImpl
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/10
 */
@Service
public class SysAmCustomerUserServiceImpl implements SysAmCustomerUserService {
    @Autowired
    SysAmCustomerUserMapper sysAmCustomerUserMapper;

    @Override
    public int save(SysAmCustomerUser record) {
        return sysAmCustomerUserMapper.insert(record);
    }

    @Override
    public int saveList(List<SysAmCustomerUser> records) {
        return sysAmCustomerUserMapper.insertList(records);
    }

    @Override
    public int delete(SysAmCustomerUser record) {
        return sysAmCustomerUserMapper.delete(record);
    }

    @Override
    public int delete(List<SysAmCustomerUser> records) {
        return 0;
    }

    @Override
    public int update(SysAmCustomerUser record) {
        return sysAmCustomerUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public SysAmCustomerUser findById(Long id) {
        return sysAmCustomerUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageInfo findPage(PageRequest pageRequest) {
        RowBounds rowBounds = new RowBounds(pageRequest.getPageNum(), pageRequest.getPageSize());
        Example example = new Example(SysAmCustomerUser.class);
        List<SysAmCustomerUser> sysAmCustomerUsers =
            sysAmCustomerUserMapper.selectByExampleAndRowBounds(example, rowBounds);
        return new PageInfo(sysAmCustomerUsers);
    }

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
