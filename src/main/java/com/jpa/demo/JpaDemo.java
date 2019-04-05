package com.jpa.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JpaDemo {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext=SpringApplication.run(JpaDemo.class, args);
	}

}
