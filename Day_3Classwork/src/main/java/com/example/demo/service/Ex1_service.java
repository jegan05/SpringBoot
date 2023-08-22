package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Ex1_model;
import com.example.demo.repository.Ex1_Repo;

@Service
public class Ex1_service 
{
	@Autowired
	Ex1_Repo sr;
	
	public Ex1_model saveinfo(Ex1_model ss)
	{
		return sr.save(ss);
	}
	
	public List<Ex1_model>showinfo()
	{
		return sr.findAll();
	}
}
