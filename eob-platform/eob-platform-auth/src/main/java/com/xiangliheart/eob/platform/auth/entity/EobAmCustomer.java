package com.xiangliheart.eob.platform.auth.entity;

import java.io.Serializable;

import com.xiangliheart.eob.common.repository.entity.BaseEntity;

import lombok.Builder;
import lombok.Data;

/**
 * EobAmCustomer
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/10
 */
@Data
@Builder
public class EobAmCustomer extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    private String regionCode;
    private String name;
    private Integer status;
}