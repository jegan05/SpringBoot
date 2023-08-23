package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Bookmystay_Entity;
import com.example.demo.repository.Bookmystay_Repo;

@Service
public class Bookmystay_Service 
{
	@Autowired
	Bookmystay_Repo sr;
	
	public List<Bookmystay_Entity> saveinfo(List<Bookmystay_Entity> ss)
	{
		return sr.saveAll(ss);
	}
	
	public List<Bookmystay_Entity> showinfo()
	{
		return sr.findAll();
	}
	
	public Optional<Bookmystay_Entity> showbyid(int id)
	{
		return sr.findById(id);
	}
	
	public Bookmystay_Entity changeinfo(Bookmystay_Entity ss)
	{
		return sr.saveAndFlush(ss);
	}
	
	public String updateinfobyid(int id,Bookmystay_Entity ss)
	{
		sr.saveAndFlush(ss);
		if(sr.existsById(id))
		{
			return "Updated Successfully";
		}
		else
		{
			return "Enter Valid details ...";
		}
	}
	
	public void delete(Bookmystay_Entity ss)
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
