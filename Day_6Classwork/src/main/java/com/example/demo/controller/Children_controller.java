package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Children_Entity;
import com.example.demo.service.Children_Service;

@RestController
public class Children_controller {
	 @Autowired 
	 Children_Service sser;
	 @PostMapping("/post")
	 public List<Children_Entity>savedetails( @RequestBody List<Children_Entity> ss){
		 return sser.saveinfo(ss);
	 }
	 @GetMapping("/showdetails")
	 public List<Children_Entity> showdetail(){
		 return sser.showinfo();
	 }
	 @GetMapping("sorts/{babyFirstName}")
	 public List<Children_Entity>sorted(@PathVariable String s){
		 return sser.sortinfo(s);
	 }
	 @GetMapping("sortpage/{pgno}/{pgsize}")
	 public List<Children_Entity> sortedpage(@PathVariable int pgno,@PathVariable int pgsize){
		 return sser.pageinfo(pgno, pgsize);
	 }
	 @GetMapping("sortdesc/{pgno}/{pgsize}/{babyfirstName}")
	 public List<Children_Entity>sortdescpage(@PathVariable int pgno,@PathVariable int pgsize,@PathVariable String s){
		 return sser.sortdescname(pgno, pgsize, s);
	 }
	 
}
