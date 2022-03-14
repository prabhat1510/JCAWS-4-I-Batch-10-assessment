package com.springassessment.service;

import java.util.List;

import com.springassessment.entity.College;
import com.springassessment.exception.CollegeNotFoundException;

public interface CollegeService {

    public List<College> retrieveAllCollege();
	
	public College createCollege(College college);
	
	public College retrieveCollegeById(Integer collegeId) throws CollegeNotFoundException;
	
	public void deleteCollegeById(Integer collegeId);
	
	public College updateCollege(College newCollege,Integer collegeId);
}
