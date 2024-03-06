package com.project.manager.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;


@Configuration
public class SwaggerConfig {
    @Value("${dev-info.server-name}")
    private String client;
    @Value("${dev-info.mail}")
    private String devMail;
    @Value("${dev-info.server-name}")
    private String serverName;
    @Value("${dev-info.developer}")
    private String developer;
    @Value("${dev-info.description}")
    private String desc;
/*
    @Bean
    public OpenAPI myOpenAPI(){
        Server server = new Server();
        Contact contact = new Contact();
        contact.setEmail(devMail);
        contact.name(developer);

        server.setDescription(desc);

        Info info = new Info();
        info.setContact(contact);

        return new OpenAPI().info(info).servers(List.of(server));
    }
*/
}
