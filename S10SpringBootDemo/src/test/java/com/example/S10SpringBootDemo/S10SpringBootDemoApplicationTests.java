package com.example.S10SpringBootDemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.example.S10SpringBootDemo.service.SomeService;

@SpringBootTest
class S10SpringBootDemoApplicationTests {
	
	@Autowired
	ApplicationContext context;
	
	@Test
	void contextLoads() {
		SomeService someservice = context.getBean(SomeService.class);
		someservice.create();
	}

}
