package com.tedu.interceptor.config;

import com.tedu.interceptor.interceptor.MyInterceptor;
import com.tedu.interceptor.interceptor.MyInterceptor1;
import com.tedu.interceptor.interceptor.MyInterceptor2;
import com.tedu.interceptor.interceptor.MyInterceptor3;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class Config implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //registry.addInterceptor(new MyInterceptor()).addPathPatterns("/users/**").excludePathPatterns("/users/login","/users/reg");
        //WebMvcConfigurer.super.addInterceptors(registry);
        registry.addInterceptor(new MyInterceptor1());
        registry.addInterceptor(new MyInterceptor2());
        registry.addInterceptor(new MyInterceptor3());
    }
}
