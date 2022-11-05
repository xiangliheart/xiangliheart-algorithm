package com.xiangliheart.eob.platform.auth.entity;

import java.io.Serializable;

import com.xiangliheart.eob.common.repository.entity.BaseEntity;

import lombok.Builder;
import lombok.Data;

/**
 * EobCmConfig
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/10
 */
@Data
@Builder
public class EobCmConfig extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    private String value;
    private String label;
    private String type;
    private String description;
    private Long sort;
    private String remarks;
}