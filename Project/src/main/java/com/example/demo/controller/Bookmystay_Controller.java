package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Bookmystay_Entity;
import com.example.demo.service.Bookmystay_Service;

@RestController
public class Bookmystay_Controller 
{
	@Autowired
	Bookmystay_Service sser;
	
	@PostMapping("/post")
	public List<Bookmystay_Entity> add(@RequestBody List<Bookmystay_Entity> ss)
	{
		return sser.saveinfo(ss);
	}
	
	@GetMapping("/show")
	public List<Bookmystay_Entity> show()
	{
		return sser.showinfo();
	}
	
	@GetMapping("showid/{id}")
	public Optional<Bookmystay_Entity> showbyid(@PathVariable int id)
	{
		return sser.showbyid(id);
	}
	
	@PutMapping("/put")
	public Bookmystay_Entity modify(@RequestBody Bookmystay_Entity ss)
	{
		return sser.changeinfo(ss);
	}
	
	@DeleteMapping("/delete")
	public void delete(Bookmystay_Entity ss)
	{
		sser.delete(ss);
	}
	
	@DeleteMapping("deleteid/{id}")
	public void deleteid(@PathVariable int id)
	{
		sser.deleteid(id);
	}
	
	@DeleteMapping("/deleteparm")
	public void deletepram(@RequestParam int id)
	{
		sser.deleteparm(id);
	}
}
