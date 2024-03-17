package com.project.manager.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class CorsConfig implements WebMvcConfigurer {


    public void addCorsMapping(CorsRegistry registry){
        registry.addMapping("/**") // Apply to all endpoints
                .allowedOrigins("http://localhost:50578") // Allow requests from this origin
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Specify supported HTTP methods
                .maxAge(3600); // Cache duration for pre-flight response
    }
}
