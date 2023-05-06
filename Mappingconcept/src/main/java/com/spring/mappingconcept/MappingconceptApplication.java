package com.spring.mappingconcept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "PHOTOGRAPHY",
				version = "1.2.3",
				description = "WILD LIFE PHOTOGRAPHY",
				contact = @Contact(
						name = "ROHITH",
						email = "ro123@gmail.com"
						)
				)
		)

public class MappingconceptApplication {

	public static void main(String[] args) {
		SpringApplication.run(MappingconceptApplication.class, args);
	}

}
