package com.kuang.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import springfox.documentation.builders.ParameterBuilder;

import java.util.ArrayList;
import java.util.List;


/**
 * @program: userCenter
 * @description: Swagger信息配置
 * @author: zhangyingbin
 * @create: 2020-03-25 23:43
 */
@Configuration
@EnableSwagger2
//@ConditionalOnProperty(prefix = "swagger2",value = {"enable"},havingValue = "true")
public class Swagger2Config {
    @Bean
    public Docket createRestApi() {

//        List<Parameter> list = new ArrayList<>();
//        list.add(new ParameterBuilder().name("token").description("登录令牌").modelRef(new ModelRef
//                ("string")).parameterType("header").required(false).build());

        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
                // 扫描所有有注解的api，用这种方式更灵活
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                // 为扫描包路径
                // .apis(RequestHandlerSelectors.basePackage("com.projectName.moduleName.controller")).paths(
                //        PathSelectors.any())
                .build();
               // .globalOperationParameters(list);
    }
    /**
     * api文档的详细信息函数,注意这里的注解引用的是哪个
     *
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                // //大标题
                .title("用户权限管理系统 RESTful API")
                // 版本号
                .version("1.0.0")
//                .termsOfServiceUrl("NO terms of service")
                // 描述
                .description("API 描述")
                //作者
                .contact(new Contact("钱育成","",""))
//                .license("The Apache License, Version 2.0")
//                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .build();
    }
}