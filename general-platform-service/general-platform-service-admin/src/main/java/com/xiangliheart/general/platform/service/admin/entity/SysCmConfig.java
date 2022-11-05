package com.xiangliheart.general.platform.service.admin.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Table;

import com.xiangliheart.general.platform.common.repository.entity.BaseEntity;

import lombok.Data;

@Data
@Table(name = "sys_cm_config")
public class SysCmConfig extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "value")
    private String value;
    @Column(name = "label")
    private String label;
    @Column(name = "type")
    private String type;
    @Column(name = "description")
    private String description;
    @Column(name = "sort")
    private Long sort;
    @Column(name = "remarks")
    private String remarks;
}