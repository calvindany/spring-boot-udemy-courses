package com.demo.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Example of customization of component scanning across package
// @SpringBootApplication(
//		scanBasePackages = {
//				"com.demo.util",
//				"com.demo.springcore"
//		}
// )

@SpringBootApplication
public class SpringcoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoreApplication.class, args);
	}

}
