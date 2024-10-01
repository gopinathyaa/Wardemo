package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {

	
	@GetMapping("/hai")
	public String hello() {
		return "welcome";
	}
}
