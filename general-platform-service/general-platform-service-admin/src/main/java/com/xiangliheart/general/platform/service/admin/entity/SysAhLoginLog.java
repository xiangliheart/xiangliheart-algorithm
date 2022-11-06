package com.xiangliheart.general.platform.service.admin.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Table;

import com.xiangliheart.general.platform.common.repository.entity.BaseEntity;

import lombok.Data;

@Data
@Table(name = "sys_ah_login_log")
public class SysAhLoginLog extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "status")
    private String status;
    @Column(name = "ip")
    private String ip;
}