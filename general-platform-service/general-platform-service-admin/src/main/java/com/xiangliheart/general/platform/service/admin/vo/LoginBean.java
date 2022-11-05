/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.general.platform.service.admin.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * LoginBean
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/10
 */
@Getter
@Setter
public class LoginBean {
    private String account;
    private String password;
    private String captcha;
}
