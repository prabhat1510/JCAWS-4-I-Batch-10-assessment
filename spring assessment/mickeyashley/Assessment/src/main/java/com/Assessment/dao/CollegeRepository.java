package com.Assessment.dao;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.Assessment.model.College;

public interface CollegeRepository extends JpaRepository<College, Integer>{
	@Query("FROM College e where e.collegeName=:eName")
	College findCollegeByName(@Param("eName") String collegeName);
	
	@Modifying
	@Query("update College e set e.collegeName=:collegeName where e.collegeId=:collegeId")
	Integer updateCollege(@Param("collegeId") Integer collegeId,@Param("collegeName") String collegeName);
}
