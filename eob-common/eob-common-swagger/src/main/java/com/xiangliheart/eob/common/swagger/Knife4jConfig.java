/**
 * Copyright (c) 2022-2022 xiangliheart(湘澧寸心) All rights reserved.
 */

package com.xiangliheart.eob.common.swagger;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;

import lombok.Data;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.RequestParameterBuilder;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.schema.ModelSpecification;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.ParameterType;
import springfox.documentation.service.RequestParameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.ApiSelectorBuilder;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * SwaggerPlusConfig SwaggerPlusConfig 接口API生成配置类
 *
 * @auther: xiangliheart(湘澧寸心)
 * @since: 2022/7/3
 */
@Configuration
@EnableOpenApi
@ConfigurationProperties(prefix = "knife4j-propertys")
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
        RequestParameterBuilder parameterBuilder = new RequestParameterBuilder();
        List<RequestParameter> parameters = new ArrayList<>();
        parameterBuilder.name("Authorization");
        parameterBuilder.description("令牌");
        ModelSpecification modelSpecification = new ModelSpecification("", null, null, null, null, null, null);
        parameterBuilder.contentModel(modelSpecification);
        parameterBuilder.in(ParameterType.HEADER);
        parameterBuilder.required(false);
        parameterBuilder.build();
        parameters.add(parameterBuilder.build());
        Docket docket = new Docket(DocumentationType.OAS_30);
        docket.apiInfo(apiInfo());
        docket.groupName(groupName);
        ApiSelectorBuilder apiSelectorBuilder = docket.select();
        apiSelectorBuilder.apis(RequestHandlerSelectors.basePackage(basePackage));
        apiSelectorBuilder.paths(PathSelectors.any());
        docket = apiSelectorBuilder.build();
        docket.globalRequestParameters(parameters);
        return docket;
    }

    private ApiInfo apiInfo() {
        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
        apiInfoBuilder.description(description);
        apiInfoBuilder.termsOfServiceUrl(termsOfServiceUrl);
        Contact Contact = new Contact(name, url, email);
        apiInfoBuilder.contact(Contact);
        apiInfoBuilder.version(version);
        return apiInfoBuilder.build();
    }

    // 添加资源
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
        registry.addResourceHandler("doc.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}