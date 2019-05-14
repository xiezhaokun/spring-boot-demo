package com.example.demo.learning.annotation;

import com.example.demo.learning.annotation.configure.ImportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xiezhaokun
 */
public class ImportAnnotation {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ImportConfig.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
