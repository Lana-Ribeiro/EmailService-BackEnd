package com.ribeiro.emailservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ribeiro.emailservice")


public class EmailServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(EmailServiceApplication.class, args);
	}

}