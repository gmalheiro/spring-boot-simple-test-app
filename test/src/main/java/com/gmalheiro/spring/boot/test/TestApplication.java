package com.gmalheiro.spring.boot.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.gmalheiro.spring.boot.test.car.Driver;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context
			= SpringApplication.run(TestApplication.class, args);
		Driver driver = context.getBean(Driver.class);
		driver.drive();
	}

}
