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
	
	@PutMapping("/put")  //update the value 
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
	
	@GetMapping("showand/{id}/{name}")
	public List<Bookmystay_Entity> andshow(@PathVariable int id,@PathVariable String name)
	{
		return sser.andinfo(id, name);
	}
	
	@GetMapping("showor/{id}/{name}")
	public List<Bookmystay_Entity> orshow(@PathVariable int id,@PathVariable String name)
	{
		return sser.orinfo(id, name);
	}
	
	@GetMapping("showstart/{name}")
	public List<Bookmystay_Entity> startshow(@PathVariable String name)
	{
		return sser.startinfo(name);
	}
	
	@GetMapping("showend/{name}")
	public List<Bookmystay_Entity> endshow(@PathVariable String name)
	{
		return sser.endinfo(name);
	}
	
	@DeleteMapping("deletequery/{members}")
	public void delqer(@PathVariable int members)
	{
		sser.deletequery(members);
	}
	
	@PutMapping("updatequery/{newid}/{id}")
	public void updqer(@PathVariable int newid,@PathVariable int id)
	{
		sser.updatequery(newid, id);
	}
	
	@GetMapping("sorts/{s}")
	public List<Bookmystay_Entity>sorted(@PathVariable String s)
	{
		 return sser.sortinfo(s);
	}
	
	@GetMapping("sortpage/{pgno}/{pgsize}")
	public List<Bookmystay_Entity> sortedpage(@PathVariable int pgno,@PathVariable int pgsize)
	{
		 return sser.pageinfo(pgno, pgsize);
	}
	
	@GetMapping("sortdesc/{pgno}/{pgsize}/{s}")
	public List<Bookmystay_Entity>sortdescpage(@PathVariable int pgno,@PathVariable int pgsize,@PathVariable String s)
	{
		 return sser.sortdescname(pgno, pgsize, s);
	}
}
