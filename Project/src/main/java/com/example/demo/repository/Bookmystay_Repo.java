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
	@Query(value="select * from bookmystay where id=:n or name=:nn",nativeQuery=true)
	public List<Bookmystay_Entity> getorinfo(@Param("n") int id,@Param("nn") String name);
	
	@Query(value="select * from bookmystay where id=:n and name=:nn",nativeQuery=true)
	public List<Bookmystay_Entity> getandinfo(@Param("n") int id,@Param("nn") String name);
	
	@Query(value="select * from bookmystay where name like :n%",nativeQuery=true)
	public List<Bookmystay_Entity> getstartinfo(@Param("n") String name);
	
	@Query(value="select * from bookmystay where name like %:n",nativeQuery=true)
	public List<Bookmystay_Entity> getendinfo(@Param("n") String name);
	
	@Modifying
	@Transactional
	@Query(value="delete from bookmystay where members=:n",nativeQuery=true)
	public void getdeleteinfo(@Param("n") int members);
	
	@Modifying
	@Transactional
	@Query(value="update bookmystay set id=:n where id=:nn",nativeQuery=true)
	public void getupdateinfo(@Param("n") int newid,@Param("nn") int id);
}
