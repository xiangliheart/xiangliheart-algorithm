/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.eob.platform.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * EobServerAuthApplication
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/2
 */
@SpringBootApplication
@MapperScan("com.xiangliheart.eob.platform.auth.dao")
public class EobServerAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(EobServerAuthApplication.class, args);
    }
}