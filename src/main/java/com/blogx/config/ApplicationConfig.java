package com.blogx.config;

import com.blogx.constant.ConstantSetting;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ApplicationConfig {
    public ApplicationConfig() {
        System.out.println("ApplicationConfig inited ...");
    }

    @Bean
    public ConstantSetting constantSetting() {
        return new ConstantSetting();
    }
}