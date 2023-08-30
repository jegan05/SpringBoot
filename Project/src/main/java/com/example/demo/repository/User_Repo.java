package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.User_Entity;

public interface User_Repo extends JpaRepository<User_Entity, Integer> 
{
	@Query(value="select * from user where userId=:n or userName=:nn",nativeQuery=true)
	public List<User_Entity> userorinfo(@Param("n") int userId,@Param("nn") String userName);
	
	@Query(value="select * from user where userId=:n and userName=:nn",nativeQuery=true)
	public List<User_Entity> userandinfo(@Param("n") int userId,@Param("nn") String userName);
	
	@Query(value="select * from user where userName like :n%",nativeQuery=true)
	public List<User_Entity> userstartinfo(@Param("n") String userName);
	
	@Query(value="select * from user where userName like %:n",nativeQuery=true)
	public List<User_Entity> userendinfo(@Param("n") String userName);
	
	@Modifying
	@Transactional
	@Query(value="delete from user where userId=:n",nativeQuery=true)
	public String userdeleteinfo(@Param("n") int userId);
	
	@Modifying
	@Transactional
	@Query(value="update from user set userId=:n where userId=:nn",nativeQuery=true)
	public String userupdateinfo(@Param("n") int newid,@Param("nn") int oldid);
}
