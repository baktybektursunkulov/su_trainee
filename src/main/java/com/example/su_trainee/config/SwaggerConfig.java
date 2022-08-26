package com.example.su_trainee.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;
import static com.google.common.base.Predicates.or;

// Access at: http://localhost:7071/core/swagger-ui.html
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//
//	@Bean
//	public Docket postsApi() {
//		return new Docket(DocumentationType.SWAGGER_2)//.groupName("public-api")
//				.select()
////				.apis(RequestHandlerSelectors.basePackage("com.example.su_trainee.controller"))
////				.paths(PathSelectors.any())
//				.build();
//	}
//	private ApiInfo metaData() {
//		return new ApiInfoBuilder()
//				.title("Tech Interface - Spring Boot Swagger Configuration")
//				.description("\"Swagger configuration for application \"")
//				.version("1.1.0")
//				.license("Apache 2.0")
//				.licenseUrl("https://www.apache.org/licenses/LICENSE-2.0\"")
//				.contact(new Contact("Tech Interface", "https://www.youtube.com/channel/UCMpJ8m1w9t7EFcF9x8rs02A", "info@techinterface.com"))
//				.build();
//	}

//}