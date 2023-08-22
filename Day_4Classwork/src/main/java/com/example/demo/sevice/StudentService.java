package com.example.demo.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.StudentEntity;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentService 
{
	@Autowired
	StudentRepo sr;
	
	public StudentEntity saveinfo(StudentEntity ss)
	{
		return sr.save(ss);
	}
	
	public List<StudentEntity> showinfo()
	{
		return sr.findAll();
	}
	
	public StudentEntity changeinfo(StudentEntity ss)
	{
		return sr.saveAndFlush(ss);
	}
	
	public void deleteinfo(StudentEntity ss)
	{
		sr.delete(ss);
	}
}
