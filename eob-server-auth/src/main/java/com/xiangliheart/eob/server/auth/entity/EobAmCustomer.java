/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.eob.server.auth.entity;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@ApiModel(value = "客户信息")
public class EobAmCustomer implements Serializable {
    @ApiModelProperty(value = "客户ID", name = "客户ID")
    private String customerId;

    @ApiModelProperty(value = "创建时间", name = "创建时间")
    private Date customerCreateTime;

    @ApiModelProperty(value = "客户区域代码", name = "客户区域代码")
    private String customerRegionCode;

    @ApiModelProperty(value = "客户名称", name = "客户名称")
    private String customerName;

    @ApiModelProperty(value = "最后更新时间", name = "最后更新时间")
    private Date costomerLastUpdateTime;

    @ApiModelProperty(value = "客户状态", name = "客户状态")
    private Integer customerStatus;
}