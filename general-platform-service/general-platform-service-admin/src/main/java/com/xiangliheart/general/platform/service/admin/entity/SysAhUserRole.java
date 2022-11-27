/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.general.platform.service.admin.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Table;

import com.xiangliheart.general.platform.common.repository.entity.BaseEntity;

import lombok.Data;

@Data
@Table(name = "sys_ah_user_role")
public class SysAhUserRole extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "role_id")
    private Long roleId;
}