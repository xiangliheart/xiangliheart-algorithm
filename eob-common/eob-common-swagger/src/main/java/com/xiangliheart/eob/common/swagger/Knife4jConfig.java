/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.eob.common.swagger;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;
import java.util.List;

/**
 * SwaggerPlusConfig
 * SwaggerPlusConfig 接口API生成配置类
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/3
 */
@Configuration
@EnableOpenApi
@ConfigurationProperties(prefix = "knife4j-property")
@EnableKnife4j
@Data
public class Knife4jConfig extends WebMvcConfigurationSupport {
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
        ParameterBuilder parameterBuilder = new ParameterBuilder();
        List<Parameter> parameters = new ArrayList<Parameter>();
        parameterBuilder.name("Authorization").description("令牌").modelRef(new ModelRef("string")).parameterType("header")
                .required(false).build();
        parameters.add(parameterBuilder.build());
        Docket docket = new Docket(DocumentationType.OAS_30).apiInfo(apiInfo()).groupName(groupName).select().apis(RequestHandlerSelectors.basePackage(basePackage)).paths(PathSelectors.any()).build().globalOperationParameters(parameters);
        return docket;
    }

    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfoBuilder().description(description).termsOfServiceUrl(termsOfServiceUrl).contact(new Contact(name,
                url, email)).version(version).build();
        return apiInfo;
    }

    // 添加资源
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
        registry.addResourceHandler("doc.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}