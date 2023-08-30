package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
	
	public List<Bookmystay_Entity> andinfo(int id,String name)
	{
		return sr.getandinfo(id, name);
	}
	
	public List<Bookmystay_Entity> orinfo(int id,String name)
	{
		return sr.getorinfo(id, name);
	}
	
	public List<Bookmystay_Entity> startinfo(String name)
	{
		return sr.getstartinfo(name);
	}
	
	public List<Bookmystay_Entity> endinfo(String name)
	{
		return sr.getendinfo(name);
	}
	
	public String deletequery(int id)
	{
		sr.getdeleteinfo(id);
		return "Id Deleted Successfully";
	}
	
	public String updatequery(int newid,int id)
	{
		sr.getupdateinfo(newid, id);
		return "New Id Updated Successfully";
	}
	
	public List<Bookmystay_Entity> sortinfo(String s)
	{
		return sr.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
	}
	
	public List<Bookmystay_Entity>pageinfo(int pgno,int pgsize){
		Page<Bookmystay_Entity> p=sr.findAll(PageRequest.of(pgno, pgsize));
		return p.getContent();
	}
	
	public List<Bookmystay_Entity> sortdescname(int pgno,int pgsize,String s){
		PageRequest p=PageRequest.of(pgno, pgsize,Sort.by(Sort.Direction.DESC,s));
		Page<Bookmystay_Entity> re=sr.findAll(p);
		return re.getContent();
	}
	
}
