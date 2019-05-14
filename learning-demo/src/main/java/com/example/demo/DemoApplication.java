package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * @author xiezhaokun
 */
@SpringBootApplication(scanBasePackages = "com.example.demo")
@PropertySource(value = {"classpath:MyProperties.properties"},encoding = "UTF-8")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
