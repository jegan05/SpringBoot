package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Children_Entity;
import com.example.demo.repository.Children_Repo;

@Service
public class Children_Service 
{
	@Autowired
	Children_Repo sr;
	
	public List<Children_Entity> saveinfo(List<Children_Entity> ss)
	{
		return sr.saveAll(ss);
	}
	
	public List<Children_Entity> showinfo()
	{
		return sr.findAll();
	}
	
	public List<Children_Entity> sortinfo(String s)
	{
		return sr.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
	}
	public List<Children_Entity>pageinfo(int pgno,int pgsize){
		Page<Children_Entity> p=sr.findAll(PageRequest.of(pgno, pgsize));
		return p.getContent();
	}
	public List<Children_Entity> sortdescname(int pgno,int pgsize,String s){
		PageRequest p=PageRequest.of(pgno, pgsize,Sort.by(Sort.Direction.DESC,s));
		Page<Children_Entity> re=sr.findAll(p);
		return re.getContent();
	}

}
