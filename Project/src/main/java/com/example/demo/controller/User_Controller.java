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

import com.example.demo.model.User_Entity;
import com.example.demo.service.User_Service;

@RestController
public class User_Controller 
{
	@Autowired
	User_Service sser;
	
	@PostMapping("/userpost")
	public List<User_Entity> add(@RequestBody List<User_Entity> ss)
	{
		return sser.saveinfo(ss);
	}
	
	@GetMapping("/usershow")
	public List<User_Entity> show()
	{
		return sser.showinfo();
	}
	
	@GetMapping("usershowid/{userId}")
	public Optional<User_Entity> showbyid(@PathVariable int userId)
	{
		return sser.showbyid(userId);
	}
	
	@PutMapping("/userput")
	public User_Entity modify(@RequestBody User_Entity ss)
	{
		return sser.changeinfo(ss);
	}
	
	@DeleteMapping("/userdelete")
	public void delete(User_Entity ss)
	{
		sser.delete(ss);
	}
	
	@DeleteMapping("userdeleteid/{userId}")
	public void deleteid(@PathVariable int userId)
	{
		sser.deleteid(userId);
	}
	
	@DeleteMapping("/userdeleteparm")
	public void deletepram(@RequestParam int userId)
	{
		sser.deleteparm(userId);
	}
	
	@GetMapping("usershowand/{userId}/{userName}")
	public List<User_Entity> andshow(@PathVariable int userId,@PathVariable String userName)
	{
		return sser.andinfo(userId, userName);
	}
	
	@GetMapping("usershowor/{userId}/{userName}")
	public List<User_Entity> orshow(@PathVariable int userId,@PathVariable String userName)
	{
		return sser.orinfo(userId, userName);
	}
	
	@GetMapping("usershowstart/{userName}")
	public List<User_Entity> startshow(@PathVariable String userName)
	{
		return sser.startinfo(userName);
	}
	
	@GetMapping("usershowend/{userName}")
	public List<User_Entity> endshow(@PathVariable String userName)
	{
		return sser.endinfo(userName);
	}
	
	@DeleteMapping("userdeletequery/{userId}")
	public void delqer(@PathVariable int userId)
	{
		sser.deletequery(userId);
	}
	
	@PutMapping("userupdatequery/{newid}/{oldid}")
	public void updqer(@PathVariable int newid,@PathVariable int oldid)
	{
		sser.updatequery(newid, oldid);
	}
	
	@GetMapping("usersorts/{s}")
	public List<User_Entity>sorted(@PathVariable String s)
	{
		 return sser.sortinfo(s);
	}
	
	@GetMapping("usersortpage/{pgno}/{pgsize}")
	public List<User_Entity> sortedpage(@PathVariable int pgno,@PathVariable int pgsize)
	{
		 return sser.pageinfo(pgno, pgsize);
	}
	
	@GetMapping("usersortdesc/{pgno}/{pgsize}/{s}")
	public List<User_Entity>sortdescpage(@PathVariable int pgno,@PathVariable int pgsize,@PathVariable String s)
	{
		 return sser.sortdescname(pgno, pgsize, s);
	}
}
