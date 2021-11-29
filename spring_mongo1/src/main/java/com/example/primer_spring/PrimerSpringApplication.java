package com.example.primer_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.spring.web.plugins.Docket;
import org.springframework.context.annotation.*;
import springfox.documentation.builders.*;
import springfox.documentation.spi.DocumentationType;

@SpringBootApplication
@EnableSwagger2
public class PrimerSpringApplication {
	public static void main(String[] args) {
		SpringApplication.run(PrimerSpringApplication.class, args);
	}

@Bean  
public Docket namuApi() {
    return new Docket(DocumentationType.SWAGGER_2)
        .select() 
        .apis(RequestHandlerSelectors.any()) 
        .paths(PathSelectors.any()) 
        .build();
}

}
