package com.example.demo;

import com.example.demo.biz.service.IScoresService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author xiezhaokun
 */
@SpringBootApplication(scanBasePackages = "com.example.demo")
@PropertySource(value = {"classpath:MyProperties.properties"}, encoding = "UTF-8")
@MapperScan("com.example.demo.biz.mapper")
@EnableTransactionManagement(proxyTargetClass = true)
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(DemoApplication.class);
		springApplication.addInitializers(new MyApplicationContextInitializer());
		ConfigurableApplicationContext configurableApplicationContext = springApplication.run(args);

		String[] beanDefinitionNames = configurableApplicationContext.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}

	}

}
