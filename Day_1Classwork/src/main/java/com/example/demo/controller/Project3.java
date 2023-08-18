package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Project3 
{
	private String color;
	
	@GetMapping("/color")
	
	public String display()
	{
		color="Green";
		return "My Favourite color is "+color;
	}
}
