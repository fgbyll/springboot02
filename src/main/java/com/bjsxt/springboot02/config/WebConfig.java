package com.bjsxt.springboot02.config;

import com.bjsxt.springboot02.intercept.MyIntercept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private MyIntercept myIntercept;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myIntercept).addPathPatterns("/**");

    }
}
