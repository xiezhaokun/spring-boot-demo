package com.example.demo.learning.annotation.configure;

import com.example.demo.learning.annotation.model.Circular;
import com.example.demo.learning.annotation.model.Square;
import com.example.demo.learning.annotation.model.Triangle;
import com.example.demo.learning.annotation.registrar.MyImportBeanDefinitionRegistrar;
import com.example.demo.learning.annotation.selector.MyImportSelector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author xiezhaokun
 */
/*@Import({MyImportBeanDefinitionRegistrar.class,MyImportSelector.class,Circular.class, Square.class, Triangle.class})
@Configuration*/
public class ImportConfig {
}
