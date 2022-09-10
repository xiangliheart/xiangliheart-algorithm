package com.xiangliheart.eob.platform.auth.entity;

import lombok.Data;

import java.util.Date;

/**
 * BaseEntity 基础模型
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/10
 */
@Data
public class BaseEntity {

    private Long id;

    private String createBy;

    private Date createTime;

    private String lastUpdateBy;

    private Date lastUpdateTime;

    private Byte delFlag;
}
