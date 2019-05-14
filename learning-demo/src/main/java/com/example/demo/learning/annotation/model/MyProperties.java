package com.example.demo.learning.annotation.model;

import com.example.demo.learning.annotation.factory.MyYmlPropertyFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author xiezhaokun
 */
//@Component
//@PropertySource(value = {"classpath:MyProperties.yml","classpath:MyProperties2.yml"},factory = MyYmlPropertyFactory.class)
//@ConfigurationProperties(prefix = "my.properties")
public class MyProperties {

    private String name;

    private String password;

    private List<String> addresses;

    private Map<String,Object> otherMap;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<String> addresses) {
        this.addresses = addresses;
    }

    public Map<String, Object> getOtherMap() {
        return otherMap;
    }

    public void setOtherMap(Map<String, Object> otherMap) {
        this.otherMap = otherMap;
    }
}
