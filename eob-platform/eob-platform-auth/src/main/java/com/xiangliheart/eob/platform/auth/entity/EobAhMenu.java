package com.xiangliheart.eob.platform.auth.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * EobAhMenu
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/10
 */
@Data
@Builder
public class EobAhMenu extends BaseEntity implements Serializable {
    private String name;

    private Long parentId;

    private String url;

    private String perms;

    private Integer type;

    private String icon;

    private Integer orderNum;

    private Byte delFlag;

    private static final long serialVersionUID = 1L;
}