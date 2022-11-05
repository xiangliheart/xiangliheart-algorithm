package com.xiangliheart.general.platform.common.repository.entity;

import java.util.Date;

import javax.persistence.Column;

import lombok.Data;

/**
 * BaseEntity 基础模型
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/10
 */
@Data
public class BaseEntity {
    @Column(name = "id")
    private Long id;
    @Column(name = "create_by")
    private String createBy;
    @Column(name = "create_time")
    private Date createTime;
    @Column(name = "last_update_by")
    private String lastUpdateBy;
    @Column(name = "last_update_time")
    private Date lastUpdateTime;
    @Column(name = "del_flag")
    private Byte delFlag;
}
