package com.example.demo.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.User_Entity;
import com.example.demo.repository.User_Repo;



@Service
public class User_Service 
{
	@Autowired
	User_Repo sr;
	
	public List<User_Entity> saveinfo(List<User_Entity> ss)
	{
		return sr.saveAll(ss);
	}
	
	public List<User_Entity> showinfo()
	{
		return sr.findAll();
	}
	
	public Optional<User_Entity> showbyid(int userId)
	{
		return sr.findById(userId);
	}
	
	public User_Entity changeinfo(User_Entity ss)
	{
		return sr.saveAndFlush(ss);
	}
	
	public String updateinfobyid(int userId,User_Entity ss)
	{
		sr.saveAndFlush(ss);
		if(sr.existsById(userId))
		{
			return "User detail Updated Successfully";
		}
		else
		{
			return "Enter Valid User details ...";
		}
	}
	
	public void delete(User_Entity ss)
	{
		sr.delete(ss);
	}
	
	public void deleteid(int userId)
	{
		sr.deleteById(userId);
	}
	
	public void deleteparm(int userId)
	{
		sr.deleteById(userId);
	}
	
	public List<User_Entity> andinfo(int userId,String userName)
	{
		return sr.userandinfo(userId, userName);
	}
	
	public List<User_Entity> orinfo(int userId,String userName)
	{
		return sr.userorinfo(userId, userName);
	}
	
	public List<User_Entity> startinfo(String userName)
	{
		return sr.userstartinfo(userName);
	}
	
	public List<User_Entity> endinfo(String userName)
	{
		return sr.userendinfo(userName);
	}
	
	public String deletequery(int userId)
	{
		sr.userdeleteinfo(userId);
		return "UserId Deleted Successfully";
	}
	
	public String updatequery(int newid,int oldid)
	{
		sr.userupdateinfo(newid, oldid);
		return "New UserId Updated Successfully";
	}
	
	public List<User_Entity> sortinfo(String s)
	{
		return sr.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
	}
	
	public List<User_Entity>pageinfo(int pgno,int pgsize){
		Page<User_Entity> p=sr.findAll(PageRequest.of(pgno, pgsize));
		return p.getContent();
	}
	
	public List<User_Entity> sortdescname(int pgno,int pgsize,String s){
		PageRequest p=PageRequest.of(pgno, pgsize,Sort.by(Sort.Direction.DESC,s));
		Page<User_Entity> re=sr.findAll(p);
		return re.getContent();
	}
}
