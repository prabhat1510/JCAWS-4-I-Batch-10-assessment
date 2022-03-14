package com.CollegeManagementSystem.service;

import java.util.List;
import java.util.Optional;

import com.CollegeManagementSystem.entity.College;
import com.CollegeManagementSystem.exeption.CollegeNotFoundException;

public interface CollegeService {

	public College addCollegeDetail(College college);
	
	public College retrieveCollegeById(Integer collegeId)throws CollegeNotFoundException ;
	
	public void deleteCollegeById(Integer collegeId);
	
	public College updateCollegeDetails(College newCollege,Integer collegeId);	
}
