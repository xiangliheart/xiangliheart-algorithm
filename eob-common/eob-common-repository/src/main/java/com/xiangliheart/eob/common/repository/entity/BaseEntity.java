package com.xiangliheart.eob.common.repository.entity;

import java.util.Date;

import lombok.Data;

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
