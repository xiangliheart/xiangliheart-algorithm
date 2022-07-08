/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.eob.server.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * EobServerAuthApplication
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/2
 */
@SpringBootApplication
@MapperScan(value = "com.xiangliheart.eob.server.auth.dao")
@EnableOpenApi
public class EobServerAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(EobServerAuthApplication.class, args);
    }
}
