package com.br.estudo.generics.repository.api.app.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API SISTEMA BACKEND CATEGORIA")
                        .version("1.0.0")
                        .description("Para gerenciamento backend.")
                        .termsOfService("https://nofrereis.com/termos")
                        .contact(new Contact()
                                .name("Equipe de Suporte")
                                .email("suporte@xpto.com"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://www.apache.org/licenses/LICENSE-2.0")));
    }
}
