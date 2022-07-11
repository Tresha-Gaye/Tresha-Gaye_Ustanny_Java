package com.company.M2ChallengeUstannyTreshaGaye;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//this code was originally written in recordStore full stack lesson classes

@Configuration
@EnableWebMvc
public class CorsConfig implements WebMvcConfigurer {
    // cor configuration allows multiple origins to access an API

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedMethods("GET", "PUT", "DELETE", "POST");
    }
}

