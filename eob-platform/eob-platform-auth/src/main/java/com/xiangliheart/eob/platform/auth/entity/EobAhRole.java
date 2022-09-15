package com.xiangliheart.eob.platform.auth.entity;

import com.xiangliheart.eob.common.repository.entity.BaseEntity;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * EobAhRole
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/10
 */
@Data
@Builder
public class EobAhRole extends BaseEntity implements Serializable {
    private String name;

    private String remark;

    private Byte delFlag;

    private static final long serialVersionUID = 1L;
}