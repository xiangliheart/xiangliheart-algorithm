package com.xiangliheart.eob.platform.auth.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * EobStDept
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/10
 */
@Data
@Builder
public class EobStDept extends BaseEntity implements Serializable {
    private String name;

    private Long parentId;

    private Integer orderNum;

    private static final long serialVersionUID = 1L;
}