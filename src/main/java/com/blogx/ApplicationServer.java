package com.blogx;

import com.blogx.constant.ConstantSetting;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource({"classpath:config/resource.properties"})
@MapperScan("com.blogx.mapper")
public class ApplicationServer {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ApplicationServer.class);
        application.setBannerMode(Banner.Mode.OFF);//关闭启动时的Banner展示
        application.run(args);
    }
}
