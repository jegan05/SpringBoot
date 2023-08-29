package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BikeModel;
import com.example.demo.service.BikeService;

@RestController
public class BikeController 
{
	@Autowired
	BikeService sser;
	
	public List<BikeModel> save(@RequestBody List<BikeModel> ss)
	{
		return sser.saveinfo(ss);
	}
	
	public List<BikeModel> show()
	{
		return sser.showinfo();
	}
	
	public List<BikeModel> end(@PathVariable String ownername)
	{
		return sser.selectendinfo(ownername);
	}
	
	public List<BikeModel> start(@PathVariable String ownername)
	{
		return sser.selectstartinfo(ownername);
	}
}
