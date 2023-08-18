package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Practice2_model;

@RestController
public class Practice2_controller 
{
	@GetMapping("/address")
	
	public ArrayList<Practice2_model> getAddress()
	{
		ArrayList<Practice2_model> details=new ArrayList<>();
		Practice2_model s=new Practice2_model();
		
		s.setName("JEGAN");
		s.setDoorNo(137);
		s.setStreetName("Gandhi Nagar");
		s.setPincode(638701);
		s.setArea("kangayam");
		s.setDistrict("Tirupur");
		s.setState("Tamil nadu");
		s.setCountry("India");
		
		details.add(s);
		return details;
	}
}
