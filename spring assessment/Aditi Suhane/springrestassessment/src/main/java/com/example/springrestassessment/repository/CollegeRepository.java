package com.example.springrestassessment.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springrestassessment.entity.College;

public interface CollegeRepository extends CrudRepository<College, Integer> {

//	@Query("FROM College e where e.name=:eName")
//	College findCollegeByName(@Param("eName") String name);
//	
//	
//	@Query("FROM College a where a.address=:aAddress")
//	College findCollegeByAddress(@Param("aAddress") String address);
//	
}