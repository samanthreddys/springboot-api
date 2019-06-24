/*
 * package com.myco.div.unit.restwebservices;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration;
 * 
 * import springfox.documentation.service.ApiInfo; import
 * springfox.documentation.service.Contact; import
 * springfox.documentation.spi.DocumentationType; import
 * springfox.documentation.spring.web.plugins.Docket; import
 * springfox.documentation.swagger2.annotations.EnableSwagger2;
 * 
 * 
 * 
 * //configuration //enable swagger
 * 
 * @Configuration //@EnableSwagger2
 * 
 * public class SwaggerConfig { //@Bean private static final Contact
 * DEFAULT_CONTACT = new Contact("", "", "");
 * 
 * @SuppressWarnings("deprecation") private static final ApiInfo
 * DEFAULT_API_INFO= new ApiInfo("Hello", "Api Desc", "1.0", "urn:tos",
 * "DEFAULT_CONTACT", "Apache 2.0", "http://www.google.com");
 * 
 * 
 * public Docket api() {
 * 
 * return new Docket(DocumentationType.SWAGGER_2) .apiInfo(DEFAULT_API_INFO); }
 * 
 * 
 * }
 */