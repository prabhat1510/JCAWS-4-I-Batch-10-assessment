package com.collegeinfoapp.service;

import com.collegeinfoapp.entities.College;
import com.collegeinfoapp.exceptions.CollegeNotFoundException;

public interface CollegeService {
	
    
	
	public College addCollegeDetail(College college);
	
	public College retrieveCollegeById(Integer collegeId)throws CollegeNotFoundException ;
	
	public void deleteCollegeById(Integer collegeId);
	
	public College updateCollegeDetails(College newCollege,Integer collegeId);

}
