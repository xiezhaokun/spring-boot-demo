package com.example.demo;

import com.example.demo.learning.annotation.model.MyProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class DemoApplicationTests {

	@Value("${my.properties.name}")
	private String name;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testMyProperties() {
		System.out.println(name);
	}

}
