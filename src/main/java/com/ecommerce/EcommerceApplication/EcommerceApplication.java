package com.ecommerce.EcommerceApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "E-COMMERCE OPEN API",
				version = "2.0.3",
				description = "E-COMMERCE OPEN API documentation"
				),
		servers = @Server(
                url = "http://localhost:9092",
				description = "E-COMMERCE OPEN API url"
				)


)
public class EcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}

}
