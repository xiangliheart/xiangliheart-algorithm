package com.xiangliheart.general.platform.service.admin.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Table;

import com.xiangliheart.general.platform.common.repository.entity.BaseEntity;

import lombok.Data;

@Data
@Table(name = "sys_ah_menu")
public class SysAhMenu extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "name")
    private String name;
    @Column(name = "parent_id")
    private Long parentId;
    @Column(name = "url")
    private String url;
    @Column(name = "perms")
    private String perms;
    @Column(name = "type")
    private Integer type;
    @Column(name = "icon")
    private String icon;
    @Column(name = "order_num")
    private Integer orderNum;
}