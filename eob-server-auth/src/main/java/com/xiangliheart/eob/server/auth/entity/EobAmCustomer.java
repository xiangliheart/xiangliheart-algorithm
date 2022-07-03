/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.eob.server.auth.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
 * EobAmCustomer
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/3
 */
@Data
@Builder
public class EobAmCustomer implements Serializable {
    private String customerId;

    private Date customerCreateTime;

    private String customerRegionCode;

    private String customerName;

    private Date costomerLastUpdateTime;

    private Integer customerStatus;

    private static final long serialVersionUID = 1L;

    public EobAmCustomer(String customerId, Date customerCreateTime, String customerRegionCode, String customerName, Date costomerLastUpdateTime, Integer customerStatus) {
        this.customerId = customerId;
        this.customerCreateTime = customerCreateTime;
        this.customerRegionCode = customerRegionCode;
        this.customerName = customerName;
        this.costomerLastUpdateTime = costomerLastUpdateTime;
        this.customerStatus = customerStatus;
    }

    public EobAmCustomer() {
        super();
    }
}