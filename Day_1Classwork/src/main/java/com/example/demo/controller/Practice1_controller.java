package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Practice1_model;

@RestController
public class Practice1_controller 
{	
	@GetMapping("/pro1")
	public List<Practice1_model> display()
	{
		return Arrays.asList(new Practice1_model("Jegan","Hello Friends"),new Practice1_model("Athi","The Bot..."));
	}
}
