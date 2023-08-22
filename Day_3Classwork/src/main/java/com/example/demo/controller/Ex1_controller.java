package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Ex1_model;
import com.example.demo.service.Ex1_service;

@RestController
public class Ex1_controller 
{
	@Autowired
	Ex1_service sser;
	
	@PostMapping("/post")
	public Ex1_model add(@RequestBody Ex1_model ss)
	{
		return sser.saveinfo(ss);
	}
	
	@GetMapping("/employee")
	public List<Ex1_model> show()
	{
		return sser.showinfo();
	}
	
}
