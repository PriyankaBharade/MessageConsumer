package com.order;

import java.util.ArrayList;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2
public class MacyOrderMessageConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MacyOrderMessageConsumerApplication.class, args);
	}
	
	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}
	
	private ApiInfo getAPiInfo() {
		return new ApiInfo("Macy Consumer REST API Documentation",
				"Macy Consumer API's released by Zensar Ltd.","2.5","http://zensar.com/termofservice",
				new Contact("Priyanka","http://priyanka.com","priyanka.bharade@zensar.com"),"GPL","http://gpl.com"
				,new ArrayList<VendorExtension>());
	}
	
	@Bean
	public Docket getCustomizedDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(getAPiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.order"))
				.paths(PathSelectors.any())
				.build();
	}

}
