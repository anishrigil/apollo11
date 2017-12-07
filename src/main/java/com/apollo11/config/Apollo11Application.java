package com.apollo11.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.apollo11.controller")
public class Apollo11Application {

	public static void main(String[] args) {
		SpringApplication.run(Apollo11Application.class, args);
	}
}
