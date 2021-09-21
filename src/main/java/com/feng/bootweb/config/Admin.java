package com.feng.bootweb.config;

import com.feng.bootweb.interceptor.Login;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Admin implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor((new Login())).addPathPatterns("/**").excludePathPatterns("/","/login","/css/**","/fonts/**","/images/**",
                "/js/**","/aa/**");
    }
}
