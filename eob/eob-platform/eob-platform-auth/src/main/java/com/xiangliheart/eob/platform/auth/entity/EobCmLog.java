package com.xiangliheart.eob.platform.auth.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * EobCmLog
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/10
 */
@Data
@Builder
public class EobCmLog extends BaseEntity implements Serializable {
    private String userName;

    private String operation;

    private String method;

    private String params;

    private Long time;

    private String ip;

    private static final long serialVersionUID = 1L;
}