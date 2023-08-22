package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BookEntity;
import com.example.demo.repository.BookRepo;

@Service
public class BookService 
{
	@Autowired
	BookRepo sr;
	
	
	public List<BookEntity> saveinfo(List<BookEntity> ss)
	{
		return sr.saveAll(ss);
	}
	
	public List<BookEntity> showinfo()
	{
		return sr.findAll();
	}
	
	public Optional<BookEntity> showbyid(int id)
	{
		return sr.findById(id);
	}
	
	public BookEntity changeinfo(BookEntity ss)
	{
		return sr.saveAndFlush(ss);
	}
	
	public String updateinfobyid(int id,BookEntity ss)
	{
		sr.saveAndFlush(ss);
		if(sr.existsById(id))
		{
			return "Updated";
		}
		else
		{
			return "Enter valid id";
		}
	}
	public void delete(BookEntity ss)
	{
		sr.delete(ss);
	}
	
	public void deleteid(int id)
	{
		sr.deleteById(id);
	}
	
	public void deleteparm(int id)
	{
		sr.deleteById(id);
	}
}
