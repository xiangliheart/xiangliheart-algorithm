/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.general.platform.service.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.spring.annotation.MapperScan;

/**
 * EobServerAuthApplication
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/2
 */
@SpringBootApplication(scanBasePackages = {"com.xiangliheart.eob"})
@MapperScan("com.xiangliheart.eob.platform.auth.dao")
public class PlatformAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlatformAuthApplication.class, args);
    }
}