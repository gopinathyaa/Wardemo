package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.*"})
public class Wardemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Wardemo1Application.class, args);
	}

}
