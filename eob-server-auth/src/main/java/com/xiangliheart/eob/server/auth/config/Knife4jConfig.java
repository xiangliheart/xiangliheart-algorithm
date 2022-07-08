/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.eob.server.auth.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * SwaggerPlusConfig
 * SwaggerPlusConfig 接口API生成配置类
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/3
 */
@Configuration
@EnableOpenApi
@ConfigurationProperties(prefix = "swagger-plus-property")
@Data
public class Knife4jConfig {
    private String title;

    private String version;

    private String description;

    private String basePackage;

    private String termsOfServiceUrl;

    private String groupName;

    private String url;

    private String name;

    private String email;

    @Bean
    public Docket createRestApi() {
        Docket docket = new Docket(DocumentationType.OAS_30).apiInfo(new ApiInfoBuilder().description(description).termsOfServiceUrl(termsOfServiceUrl).contact(new Contact(name, url, email)).version(version).build()).groupName(groupName).select().apis(RequestHandlerSelectors.basePackage(basePackage)).paths(PathSelectors.any()).build();
        return docket;
    }
}