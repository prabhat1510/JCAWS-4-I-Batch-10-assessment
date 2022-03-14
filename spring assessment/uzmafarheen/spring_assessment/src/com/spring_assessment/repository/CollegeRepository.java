package com.spring_assessment.repository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.spring_assessment.entity.College;

public interface CollegeRepository extends CrudRepository<College ,Integer> {

	

}