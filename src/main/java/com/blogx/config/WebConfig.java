package com.blogx.config;

import com.blogx.interceptor.SessionInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
// web配置文件（web.xml）添加一个拦截器
public class WebConfig implements WebMvcConfigurer {
    @Autowired
    private SessionInterceptor sessionInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry ){
        registry.addInterceptor(new SessionInterceptor()).addPathPatterns("/*.html");
    }
}
