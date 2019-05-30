package com.example.demo.config;

import com.example.demo.filter.FilterC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author xiezhaokun
 */
@Configuration
public class BeanConfig {

    @Bean
    public FilterC filterC() {
        FilterC filterC = new FilterC();
        return filterC;
    }
}
