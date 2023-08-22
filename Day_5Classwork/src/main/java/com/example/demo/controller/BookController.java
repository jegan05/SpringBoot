package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BookEntity;
import com.example.demo.service.BookService;

@RestController
public class BookController 
{
	@Autowired
	BookService sser;
	
	@PostMapping("/post")
	public List<BookEntity> add(@RequestBody List<BookEntity> ss)
	{
		return sser.saveinfo(ss);
	}
	
	@GetMapping("/show")
	public List<BookEntity> show()
	{
		return sser.showinfo();
	}
	
	@GetMapping("showid/{id}")
	public Optional<BookEntity> showbyid(int id)
	{
		return sser.showbyid(id);
	}
	
	@PutMapping("/put")
	public BookEntity modify(@RequestBody BookEntity ss)
	{
		return sser.changeinfo(ss);
	}
	
	@PutMapping("putid/{id}")
	public String Updatebyid(@RequestBody int id,BookEntity ss)
	{
		return sser.updateinfobyid(id, ss);
	}
	
	@DeleteMapping("/delete")
	public void delete(@RequestBody BookEntity ss)
	{
		sser.delete(ss);
	}
	
	@DeleteMapping("/deleteid")
	public void deleteid(int id)
	{
		sser.deleteid(id);
	}
	
	@DeleteMapping("/deleteparm")
	public void deleteparm(int id)
	{
		sser.deleteid(id);
	}
	
	
}
