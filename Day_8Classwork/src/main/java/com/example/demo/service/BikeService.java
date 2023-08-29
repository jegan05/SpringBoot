package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BikeModel;
import com.example.demo.repository.BikeRepo;

@Service
public class BikeService 
{
	@Autowired
	BikeRepo sr;
	
	public List<BikeModel> saveinfo(List<BikeModel> ss)
	{
		return sr.saveAll(ss);
	}
	
	public List<BikeModel> showinfo()
	{
		return sr.findAll();
	}
	
	public List<BikeModel> selectendinfo(String ownername)
	{
		return sr.getselectendinfo(ownername);
	}
	
	public List<BikeModel> selectstartinfo(String ownername)
	{
		return sr.getselectstartinfo(ownername);
	}
}
