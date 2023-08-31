package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Hotal_Entity;
import com.example.demo.repository.Hotal_Repo;



@Service
public class Hotal_Service 
{
	@Autowired
	Hotal_Repo sr;
	
	public List<Hotal_Entity> saveinfo(List<Hotal_Entity> ss)
	{
		return sr.saveAll(ss);
	}
	
	public List<Hotal_Entity> showinfo()
	{
		return sr.findAll();
	}
	
	public Optional<Hotal_Entity> showbyid(int id)
	{
		return sr.findById(id);
	}
	
	public Hotal_Entity changeinfo(Hotal_Entity ss)
	{
		return sr.saveAndFlush(ss);
	}
	
	public String updateinfobyid(int id,Hotal_Entity ss)
	{
		sr.saveAndFlush(ss);
		if(sr.existsById(id))
		{
			return "Hotal detail Updated Successfully";
		}
		else
		{
			return "Enter Valid Hotal details ...";
		}
	}
	
	public void delete(Hotal_Entity ss)
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
	
	public List<Hotal_Entity> andinfo(int hotalId,String hotalName)
	{
		return sr.hotalandinfo(hotalId, hotalName);
	}
	
	public List<Hotal_Entity> orinfo(int hotalId,String hotalName)
	{
		return sr.hotalorinfo(hotalId, hotalName);
	}
	
	public List<Hotal_Entity> startinfo(String hotalName)
	{
		return sr.hotalstartinfo(hotalName);
	}
	
	public List<Hotal_Entity> endinfo(String hotalName)
	{
		return sr.hotalendinfo(hotalName);
	}
	
	public String deletequery(String hotalQuality)
	{
		sr.hotaldeleteinfo(hotalQuality);
		return "Hotal Id Deleted Successfully";
	}
	
	public String updatequery(int newid,int oldid)
	{
		sr.hotalupdateinfo(newid, oldid);
		return "New Hotal Id Updated Successfully";
	}
	
	public List<Hotal_Entity> sortinfo(String s)
	{
		return sr.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
	}
	
	public List<Hotal_Entity>pageinfo(int pgno,int pgsize){
		Page<Hotal_Entity> p=sr.findAll(PageRequest.of(pgno, pgsize));
		return p.getContent();
	}
	
	public List<Hotal_Entity> sortdescname(int pgno,int pgsize,String s){
		PageRequest p=PageRequest.of(pgno, pgsize,Sort.by(Sort.Direction.DESC,s));
		Page<Hotal_Entity> re=sr.findAll(p);
		return re.getContent();
	}
}
