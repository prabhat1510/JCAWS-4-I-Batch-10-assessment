package com.example.spring_restproject.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.spring_restproject.entity.College;

public interface CollegeRepository extends CrudRepository<College, Integer> {

//	@Query("FROM College e where e.name=:eName")
//	College findCollegeByName(@Param("eName") String name);
//	
//	
//	@Query("FROM College a where a.address=:aAddress")
//	College findCollegeByAddress(@Param("aAddress") String address);
//	
}