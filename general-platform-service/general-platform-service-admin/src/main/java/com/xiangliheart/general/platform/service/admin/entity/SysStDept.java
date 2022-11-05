package com.xiangliheart.general.platform.service.admin.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Table;

import com.xiangliheart.general.platform.common.repository.entity.BaseEntity;

import lombok.Data;

@Data
@Table(name = "sys_st_dept")
public class SysStDept extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "name")
    private String name;
    @Column(name = "parent_id")
    private Long parentId;
    @Column(name = "order_num")
    private Integer orderNum;
}