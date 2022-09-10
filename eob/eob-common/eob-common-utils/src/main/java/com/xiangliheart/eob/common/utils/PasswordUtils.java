/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.eob.common.utils;

import java.util.UUID;

/**
 * PasswordUtils 密码工具类
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/20
 */
public class PasswordUtils {

    /**
     * matches 匹配密码
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/7/20
     * @return:
     * @params:
     */
    public static boolean matches(String salt, String rawPass, String encPass) {
        return new PasswordEncoder(salt).matches(encPass, rawPass);
    }

    /**
     * encode 明文密码加密
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/7/20
     */
    public static String encode(String rawPass, String salt) {
        return new PasswordEncoder(salt).encode(rawPass);
    }

    /**
     * getSalt 获取加密盐
     *
     * @auther: xiangliheart(湘澧寸心)
     * @since: 2022/7/20
     */
    public static String getSalt() {
        return UUID.randomUUID().toString().replaceAll("-", "").substring(0, 20);
    }
}
