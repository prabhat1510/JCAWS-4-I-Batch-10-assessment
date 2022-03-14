package com.springAssessment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springAssessment.models.College;

public interface CollegeRepository extends JpaRepository<College, Integer> {

	@Query("FROM College c where c.collegeName=:cName")
	College findCollegeByName(@Param("cName") String collegeName);

	@Query("FROM College c where c.address=:cAddress")
	College findCollegeByAddress(@Param("cAddress") String collegeAddress);

}
