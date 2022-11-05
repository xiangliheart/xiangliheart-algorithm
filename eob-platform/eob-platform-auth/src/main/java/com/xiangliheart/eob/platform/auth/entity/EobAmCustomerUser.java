package com.xiangliheart.eob.platform.auth.entity;

import java.io.Serializable;

import com.xiangliheart.eob.common.repository.entity.BaseEntity;

import lombok.Data;

/**
 * EobAmCustomerUser
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/10
 */
@Data
public class EobAmCustomerUser extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String nickName;
    private String avatar;
    private String password;
    private String salt;
    private String email;
    private String mobile;
    private Byte status;
    private Long deptId;
}