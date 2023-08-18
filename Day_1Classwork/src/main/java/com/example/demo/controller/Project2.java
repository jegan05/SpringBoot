package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Project2 
{	
	private String name;
	
	@GetMapping("/name")
	
	public String display()
	{
		name="Jegan";
		return "Welcome "+name;
	}
}
