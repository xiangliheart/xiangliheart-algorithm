package com.xiangliheart.general.platform.service.admin.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Table;

import com.xiangliheart.general.platform.common.repository.entity.BaseEntity;

import lombok.Data;

@Data
@Table(name = "sys_am_customer")
public class SysAmCustomer extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "region_code")
    private String regionCode;
    @Column(name = "name")
    private String name;
    @Column(name = "status")
    private Integer status;
}