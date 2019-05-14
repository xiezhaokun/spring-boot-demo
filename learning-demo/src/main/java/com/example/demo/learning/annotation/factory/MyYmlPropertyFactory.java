package com.example.demo.learning.annotation.factory;

import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertySourceFactory;
import org.springframework.lang.Nullable;

import java.io.IOException;
import java.util.List;


/**
 * @author xiezhaokun
 */
public class MyYmlPropertyFactory implements PropertySourceFactory {


    @Override
    public PropertySource<?> createPropertySource(@Nullable String s, EncodedResource encodedResource) throws IOException {

        YamlPropertySourceLoader yamlPropertySourceLoader = new YamlPropertySourceLoader();
        Resource resource = encodedResource.getResource();
        List<PropertySource<?>> load = yamlPropertySourceLoader.load(resource.getFilename(), resource);
        return load.get(0);
    }
}
