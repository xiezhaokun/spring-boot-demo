package com.example.demo.config;

import com.example.demo.filter.FilterA;
import com.example.demo.filter.FilterB;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.servlet.Filter;

/**
 * @author xiezhaokun
 */
@Component
public class FilterConfig {

    @Bean
    public FilterA filterA() {
        return new FilterA();
    }

    @Bean
    public FilterB filterB() {
        return new FilterB();
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBeanA() {
        FilterRegistrationBean<Filter> registration = new FilterRegistrationBean<>();
        registration.setFilter(filterA());
        registration.addUrlPatterns("/*");
        registration.setName("filterA");
        registration.setOrder(1);
        return registration;
    }


    @Bean
    public FilterRegistrationBean filterRegistrationBeanB() {
        FilterRegistrationBean<Filter> registration = new FilterRegistrationBean<>();
        registration.setFilter(filterB());
        registration.addUrlPatterns("/*");
        registration.setName("filterB");
        registration.setOrder(2);
        return registration;
    }
}
