package com.bjsxt.springboot02.config;

import com.bjsxt.springboot02.filter.MyFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterRegister {

    @Autowired
    private MyFilter myFilter;

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){

        FilterRegistrationBean f=new FilterRegistrationBean(myFilter);
        f.addUrlPatterns("/*");
        return f;

    }
}
