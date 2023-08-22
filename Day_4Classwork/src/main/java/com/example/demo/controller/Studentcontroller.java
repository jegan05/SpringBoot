package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentEntity;
import com.example.demo.sevice.StudentService;

@RestController
public class Studentcontroller 
{
	@Autowired
	StudentService sser;
	
	@PostMapping("/post")
	
	public StudentEntity add(@RequestBody StudentEntity ss)
	{
		return sser.saveinfo(ss);
	}
	
	@GetMapping("/show")
	
	public List<StudentEntity > show()
	{
		return sser.showinfo();
	}
	
	@PutMapping("/put")
	
	public StudentEntity modfiy(@RequestBody StudentEntity ss)
	{
		return sser.changeinfo(ss);
	}
	
	@DeleteMapping("/delete")
	
	public String del(@RequestBody StudentEntity ss)
	{
		sser.deleteinfo(ss);
		return "Deleted Successfully";
	}
}
