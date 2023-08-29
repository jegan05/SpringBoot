package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.BikeModel;

public interface BikeRepo extends JpaRepository<BikeModel, Integer>
{
	@Query(value="select * from dogdetails where ownernlike %:ss",nativeQuery=true)
	public List<BikeModel> getselectendinfo(@Param("ss") String name);
	
	@Query(value="select * from dogdetails where ownername like :ss%",nativeQuery=true)
	public List<BikeModel> getselectstartinfo(@Param("ss") String name);
	
}
