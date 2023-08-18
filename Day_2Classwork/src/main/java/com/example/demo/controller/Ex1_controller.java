package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ex1_controller 
{
	@Value("${var}")
	private String text;
	
	@GetMapping("/day2")
	
	public String display()
	{
		return "Welcome to "+text;
	}
}
