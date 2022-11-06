package com.xiangliheart.general.platform.service.admin.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Table;

import com.xiangliheart.general.platform.common.repository.entity.BaseEntity;

import lombok.Data;

@Data
@Table(name = "sys_ah_role_dept")
public class SysAhRoleDept extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "role_id")
    private Long roleId;
    @Column(name = "dept_id")
    private Long deptId;
}