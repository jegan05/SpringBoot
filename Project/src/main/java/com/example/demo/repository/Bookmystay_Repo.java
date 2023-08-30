package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Bookmystay_Entity;

public interface Bookmystay_Repo extends JpaRepository<Bookmystay_Entity, Integer>
{
	@Query(value="select * from Bookmustay where id=:n or name=:nn",nativeQuery=true)
	public List<Bookmystay_Entity> getorinfo(@Param("n") int id,@Param("nn") String name);
	
	@Query(value="select * from Bookmystay where id=:n and name=:nn",nativeQuery=true)
	public List<Bookmystay_Entity> getandinfo(@Param("n") int id,@Param("nn") String name);
	
	@Query(value="select * from Bookmystay where name like :n%",nativeQuery=true)
	public List<Bookmystay_Entity> getstartinfo(@Param("n") String name);
	
	@Query(value="select * from Bookmystay where name like %:n",nativeQuery=true)
	public List<Bookmystay_Entity> getendinfo(@Param("n") String name);
	
	@Modifying
	@Transactional
	@Query(value="delete from Bookmystay where id=:n",nativeQuery=true)
	public String getdeleteinfo(@Param("n") int id);
	
	@Modifying
	@Transactional
	@Query(value="update from Bookmystay set id=:n where id=:nn",nativeQuery=true)
	public String getupdateinfo(@Param("n") int newid,@Param("nn") int id);
}
