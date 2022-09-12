package com.xiangliheart.eob.platform.auth.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * EobAhRoleMenu
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/10
 */
@Data
@Builder
public class EobAhRoleMenu extends BaseEntity implements Serializable {
    private Long roleId;

    private Long menuId;

    private static final long serialVersionUID = 1L;
}