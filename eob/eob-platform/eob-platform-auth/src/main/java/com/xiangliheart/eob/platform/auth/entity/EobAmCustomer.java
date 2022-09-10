package com.xiangliheart.eob.platform.auth.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * EobAmCustomer
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/10
 */
@Data
@Builder
public class EobAmCustomer extends BaseEntity implements Serializable {
    private String regionCode;

    private String name;

    private Integer status;

    private static final long serialVersionUID = 1L;
}