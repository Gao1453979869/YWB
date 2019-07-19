package com.zhulang.ywb_appapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
    private ApiInfo createA(){
        return new ApiInfoBuilder().title("易物宝App数据接口平台").description("基于SpringBoot和SprinfCloud实现的微服务架构，提供易物宝App的所有接口").version("1.0")
                .contact(new Contact("we", "http://1453979869", "")).build();
    }

    @Bean
    public Docket createD(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(createA()).select().apis
                (RequestHandlerSelectors.basePackage("com.pockectstate.api.pockectstateapi_appapi.api")).build();
    }
}
