package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CarModel;
import com.example.demo.service.CarService;

@RestController
public class CarController 
{
	@Autowired
	CarService sser;
	
	@PostMapping("/post")
	public List<CarModel> add(@RequestBody List<CarModel> ss)
	{
		return sser.saveinfo(ss);
	}
	
	@GetMapping("/show")
	public List<CarModel> show()
	{
		return sser.showinfo();
	}
	
	@GetMapping("selectand/{id}/{carName}")
	public List<CarModel> selectand(@PathVariable int id,@PathVariable String carName)
	{
		return sser.selectandinfo(id, carName);
	}
	
	@GetMapping("selector/{id}/{carName}")
	public List<CarModel> selector(@PathVariable int id,@PathVariable String carName)
	{
		return sser.selectorinfo(id, carName);
	}
	
	@GetMapping("selectin/{carName}")
	public List<CarModel> selectin(@PathVariable String carName)
	{
		return sser.selectininfo(carName);
	}
	
	@GetMapping("selectstart/{carName}")
	public List<CarModel> selectstart(@PathVariable String carName)
	{
		return sser.selectstartinfo(carName);
	}
	
	@GetMapping("selectend/{carName}")
	public List<CarModel> selectend(@PathVariable String carName)
	{
		return sser.selectendinfo(carName);
	}
	
	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable int id)
	{
		sser.deleteinfo(id);
	}
	
	@PutMapping("update/{id}/{newid}")
	public void update(@PathVariable int id,@PathVariable int newid)
	{
		sser.updateinfo(id, newid);
	}
}
