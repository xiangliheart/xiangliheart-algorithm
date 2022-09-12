package com.xiangliheart.eob.platform.auth.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * EobCmDict
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/10
 */
@Data
@Builder
public class EobCmDict extends BaseEntity implements Serializable {
    private String value;

    private String label;

    private String type;

    private String description;

    private Long sort;

    private String remarks;

    private static final long serialVersionUID = 1L;
}