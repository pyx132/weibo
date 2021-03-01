package com.blogx.constant;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "constant")
public class ConstantSetting {
    private String company;
    private String address;
}