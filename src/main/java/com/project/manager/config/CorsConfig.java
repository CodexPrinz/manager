package com.project.manager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**") // Apply to all endpoints
                        .allowedOrigins("http://localhost:63342") // Allow requests from this origin
                        .allowedMethods("GET", "POST", "PUT", "DELETE") // Specify supported HTTP methods
 //                       .allowCredentials(true)
                        .maxAge(3600); // Cache duration for pre-flight response

            }
        };
    }
}
