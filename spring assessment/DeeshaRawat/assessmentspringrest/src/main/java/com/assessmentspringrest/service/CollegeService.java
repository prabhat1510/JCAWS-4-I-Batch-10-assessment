package com.assessmentspringrest.service;

import java.util.List;

import com.assessmentspringrest.entity.College;
import com.assessmentspringrest.exceptions.CollegeNotFoundException;

public interface CollegeService {
	
	public List<College> retrieveAllCollege();
	
	public College createCollegeDetail(College college);
	
	public College retrieveCollegeById(Integer collegeId) throws CollegeNotFoundException; // throws CollegeNotFoundException;
			
	public void deleteCollegeById(Integer id);
			
	public College updateCollegeDetails(College newCollege,Integer collegeId);

	College replaceCollege(College newCollege, Integer id);
	

}
