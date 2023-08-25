package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.CarModel;
import com.example.demo.repository.CarRepo;

@Service
public class CarService 
{
	@Autowired
	CarRepo sr;
	
	public List<CarModel> saveinfo(List<CarModel> ss)
	{
		return sr.saveAll(ss);
	}
	
	public List<CarModel> showinfo()
	{
		return sr.findAll();
	}
	
	public List<CarModel> selectandinfo(int id,String carName)
	{
		return sr.getselectandinfo(id, carName);
	}
	
	public List<CarModel> selectorinfo(int id,String carName)
	{
		return sr.getselectorinfo(id, carName);
	}
	
	public List<CarModel> selectininfo(String carName)
	{
		return sr.getselectininfo(carName);
	}
	
	public List<CarModel> selectstartinfo(String carName)
	{
		return sr.getselectstartinfo(carName);
	}
	
	public List<CarModel> selectendinfo(String carName)
	{
		return sr.getselectendinfo(carName);
	}
	
	public void deleteinfo(int id)
	{
		sr.getdeleteinfo(id);
	}
	
	public void updateinfo(int id,int newid)
	{
		sr.getupdateinfo(id, newid);
	}
}
