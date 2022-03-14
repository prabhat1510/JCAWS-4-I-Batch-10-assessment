package com.assignment.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.assignment.entity.College;

public interface CollegeRepository extends CrudRepository<College,Integer> {

	@Query("FROM College c where c.collegeName=:cName")
	College findCollegeByName(@Param("cName") String collegeName);
	
	@Query("FROM College c where c.address=:cAddress")
	College findCollegeByAddress(@Param("cAddress") String address);
	
	@Modifying
	@Query("update College c set c.collegeName=:collegeName, c.address=:address where c.collegeId=:collegeId")
	Integer updateCollege(@Param("collegeId") Integer collegeId,@Param("collegeName") String collegeName, @Param("address") String address);
	
	
	

}