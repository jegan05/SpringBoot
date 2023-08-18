package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Project1 
{
	@GetMapping("/")
	public String display()
	{
		return "Welcome to Spring Boot!";
	}

}
