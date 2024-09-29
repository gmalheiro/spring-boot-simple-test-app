package com.gmalheiro.spring.boot.test;

//import org.springframework.boot.SpringApplication;
import com.gmalheiro.spring.boot.test.car.Corolla;
import com.gmalheiro.spring.boot.test.car.Driver;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		//SpringApplication.run(TestApplication.class, args);
		Corolla car = new Corolla();
		Driver driver = new Driver(car);
		driver.drive();
	}

}
