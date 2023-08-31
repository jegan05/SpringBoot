package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Hotal_Entity;

public interface Hotal_Repo extends JpaRepository<Hotal_Entity, Integer>
{
	@Query(value="select * from hotal where hotalId=:n or hotalName=:nn",nativeQuery=true)
	public List<Hotal_Entity> hotalorinfo(@Param("n") int hotalId,@Param("nn") String hotalName);
	
	@Query(value="select * from hotal where hotalId=:n and hotalName=:nn",nativeQuery=true)
	public List<Hotal_Entity> hotalandinfo(@Param("n") int hotalId,@Param("nn") String hotalName);
	
	@Query(value="select * from hotal where hotalName like :n%",nativeQuery=true)
	public List<Hotal_Entity> hotalstartinfo(@Param("n") String hotalName);
	
	@Query(value="select * from hotal where hotalName like %:n",nativeQuery=true)
	public List<Hotal_Entity> hotalendinfo(@Param("n") String hotalName);
	
	@Modifying
	@Transactional
	@Query(value="delete from hotal where hotalQuality=:n",nativeQuery=true)
	public void hotaldeleteinfo(@Param("n") String hotalQuality);
	
	@Modifying
	@Transactional
	@Query(value="update hotal set hotalId=:n where hotalId=:nn",nativeQuery=true)
	public void hotalupdateinfo(@Param("n") int newid,@Param("nn") int oldid);
}
