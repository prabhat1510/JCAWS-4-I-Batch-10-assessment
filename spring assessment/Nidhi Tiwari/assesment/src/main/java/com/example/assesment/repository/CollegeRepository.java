package com.example.assesment.repository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.assesment.entity.College;


public interface CollegeRepository extends CrudRepository<College ,Integer> {

//	@Query("FROM College e where e.name=:eName")
//	College findCollegeByName(@Param("eName") String name);
//	
//	
//	@Query("FROM College a where a.address=:aAddress")
//	College findCollegeByAddress(@Param("aAddress") String address);
//	
}


