package br.com.app.iva.iva.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {
	
	@Bean
	public OpenAPI customOpenApi() {
		
		return new OpenAPI().info(new Info()
				.title("Cadastrar-Membro API")
				.description("Api responsável por cadastrar e criar Login de Acesso")
				.contact(new Contact().name("Felipe e Kelvin").email("felipetobiasandre.jc@gmail.com ou contato.kelvin@gmail.com"))
				.version("1.0.0")
				);
	}

}
