package com.example.demo.learning.annotation.model;

import org.springframework.context.annotation.Bean;

/**
 * @author xiezhaokun
 */
public class Circular {

    @Bean
    public BeanA beanA() {
        return new BeanA();
    }
}
