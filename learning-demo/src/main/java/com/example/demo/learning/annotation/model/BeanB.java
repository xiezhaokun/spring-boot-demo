package com.example.demo.learning.annotation.model;

import org.springframework.context.annotation.Bean;

/**
 * @author xiezhaokun
 */
public class BeanB {

    @Bean
    public BeanC beanC() {
        return new BeanC();
    }
}
