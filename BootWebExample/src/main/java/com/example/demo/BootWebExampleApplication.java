package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BootWebExampleApplication {

	public static void main(String[] args) {
	
		
		ConfigurableApplicationContext context=SpringApplication.run(BootWebExampleApplication.class, args);
	
	
	}

}

