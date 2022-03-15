package com.springassessment.service;

import java.util.List;

import com.springassessment.entity.College;
import com.springassessment.exception.CollegeNotFoundException;

public interface CollegeService {
	
	public List<College> retrieveAllCollege();
	
	public College createCollegeDetail(College college);
	
	public College retrieveCollegeById(Integer collegeId) throws CollegeNotFoundException; 
	public void deleteCollegeById(Integer id);
			
	public College updateCollegeDetails(College newCollege,Integer collegeId);

	College replaceCollege(College newCollege, Integer id);
	

}