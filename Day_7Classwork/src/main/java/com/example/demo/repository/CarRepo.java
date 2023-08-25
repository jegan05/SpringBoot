package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.CarModel;

public interface CarRepo extends JpaRepository<CarModel, Integer>
{
	@Query(value="select * from cardetails where id=:s or car_name=:ss",nativeQuery=true)
	public List<CarModel> getselectorinfo(@Param("s") int id,@Param("ss") String carName);
	
	@Query(value="select * from cardetails where id=:s and car_name=:ss",nativeQuery=true)
	public List<CarModel> getselectandinfo(@Param("s") int id,@Param("ss") String carName);
	
	@Query(value="select * from cardetails where id in(select id from cardetails where car_name=:new)",nativeQuery=true)
	public List<CarModel> getselectininfo(@Param("new") String carName);
	
	@Query(value="select * from cardetails where car_name like :ss%",nativeQuery=true)
	public List<CarModel> getselectstartinfo(@Param("ss") String carName);
	
	@Query(value="select * from cardetails where car_name %:ss",nativeQuery=true)
	public List<CarModel> getselectendinfo(@Param("ss") String carName);
	
	@Modifying
	@Transactional
	@Query(value="delete from cardetails where id=:sss",nativeQuery=true)
	public void getdeleteinfo(@Param("sss") int id);
	
	@Modifying
	@Transactional
	@Query(value="update cardetails set id=:dd where id=:ddd",nativeQuery=true)
	public void getupdateinfo(@Param("dd")int oldid,@Param("ddd")int newid);
}
