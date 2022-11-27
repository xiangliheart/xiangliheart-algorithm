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
@Table(name = "sys_cm_log")
public class SysCmLog extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "operation")
    private String operation;
    @Column(name = "method")
    private String method;
    @Column(name = "params")
    private String params;
    @Column(name = "time")
    private Long time;
    @Column(name = "ip")
    private String ip;
}