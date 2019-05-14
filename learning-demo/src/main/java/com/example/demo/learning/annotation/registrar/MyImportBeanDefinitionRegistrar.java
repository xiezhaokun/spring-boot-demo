package com.example.demo.learning.annotation.registrar;

import com.example.demo.learning.annotation.model.BeanD;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author xiezhaokun
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar{
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(BeanD.class);
        registry.registerBeanDefinition(rootBeanDefinition.getBeanClassName(),rootBeanDefinition);
    }
}
