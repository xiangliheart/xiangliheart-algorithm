package com.xiangliheart.eob.platform.auth.entity;

import com.xiangliheart.eob.common.repository.entity.BaseEntity;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * EobAhRoleDept
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/10
 */
@Data
@Builder
public class EobAhRoleDept extends BaseEntity implements Serializable {
    private Long roleId;

    private Long deptId;

    private static final long serialVersionUID = 1L;
}