package com.xiangliheart.eob.platform.auth.entity;

import java.io.Serializable;

import com.xiangliheart.eob.common.repository.entity.BaseEntity;

import lombok.Builder;
import lombok.Data;

/**
 * EobAhMenu
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/10
 */
@Data
@Builder
public class EobAhMenu extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private Long parentId;
    private String url;
    private String perms;
    private Integer type;
    private String icon;
    private Integer orderNum;
    private Byte delFlag;
}