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

import com.example.demo.model.Hotal_Entity;
import com.example.demo.service.Hotal_Service;


@RestController
public class Hotal_Controller 
{
	@Autowired
	Hotal_Service sser;
	
	@PostMapping("/hotalpost")
	public List<Hotal_Entity> add(@RequestBody List<Hotal_Entity> ss)
	{
		return sser.saveinfo(ss);
	}
	
	@GetMapping("/hotalshow")
	public List<Hotal_Entity> show()
	{
		return sser.showinfo();
	}
	
	@GetMapping("hotalshowid/{hotalId}")
	public Optional<Hotal_Entity> showbyid(@PathVariable int hotalId)
	{
		return sser.showbyid(hotalId);
	}
	
	@PutMapping("/hotalput") 
	public Hotal_Entity modify(@RequestBody Hotal_Entity ss)
	{
		return sser.changeinfo(ss);
	}
	
	@DeleteMapping("/hotaldelete")
	public void delete(Hotal_Entity ss)
	{
		sser.delete(ss);
	}
	
	@DeleteMapping("hotaldeleteid/{hotalId}")
	public void deleteid(@PathVariable int hotalId)
	{
		sser.deleteid(hotalId);
	}
	
	@DeleteMapping("/hotaldeleteparm")
	public void deletepram(@RequestParam int hotalId)
	{
		sser.deleteparm(hotalId);
	}
	
	@GetMapping("hotalshowand/{hotalId}/{hotalName}")
	public List<Hotal_Entity> andshow(@PathVariable int hotalId,@PathVariable String hotalName)
	{
		return sser.andinfo(hotalId, hotalName);
	}
	
	@GetMapping("hotalshowor/{hotalId}/{hotalName}")
	public List<Hotal_Entity> orshow(@PathVariable int hotalId,@PathVariable String hotalName)
	{
		return sser.orinfo(hotalId, hotalName);
	}
	
	@GetMapping("hotalshowstart/{hotalName}")
	public List<Hotal_Entity> startshow(@PathVariable String hotalName)
	{
		return sser.startinfo(hotalName);
	}
	
	@GetMapping("hotalshowend/{hotalName}")
	public List<Hotal_Entity> endshow(@PathVariable String hotalName)
	{
		return sser.endinfo(hotalName);
	}
	
	@DeleteMapping("hotaldeletequery/{hotalQuality}")
	public void delqer(@PathVariable String hotalQuality)
	{
		sser.deletequery(hotalQuality);
	}
	
	@PutMapping("hotalupdatequery/{newid}/{oldid}")
	public void updqer(@PathVariable int newid,@PathVariable int oldid)
	{
		sser.updatequery(newid, oldid);
	}
	
	@GetMapping("hotalsorts/{s}")
	public List<Hotal_Entity>sorted(@PathVariable String s)
	{
		 return sser.sortinfo(s);
	}
	
	@GetMapping("hotalsortpage/{pgno}/{pgsize}")
	public List<Hotal_Entity> sortedpage(@PathVariable int pgno,@PathVariable int pgsize)
	{
		 return sser.pageinfo(pgno, pgsize);
	}
	
	@GetMapping("hotalsortdesc/{pgno}/{pgsize}/{s}")
	public List<Hotal_Entity>sortdescpage(@PathVariable int pgno,@PathVariable int pgsize,@PathVariable String s)
	{
		 return sser.sortdescname(pgno, pgsize, s);
	}
}
