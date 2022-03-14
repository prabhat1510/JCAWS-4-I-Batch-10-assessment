package com.assignment.service;

import java.util.List;

import com.assignment.entity.College;
import com.assignment.exception.CollegeNotFoundException;

public interface CollegeService {
	
	void deleteCollege(Integer collegeId);

	College replaceCollege(College newCollege, Integer collegeId);
	
	College one(Integer collegeId) throws CollegeNotFoundException;

	List<College> all();
	
	College newCollege(College newCollege);
	
		//retrievebyname
		public College getCollegeByName(String collegeName);
		
		//retrievebyaddress
		public College getCollegeByAddress(String address);
	

}
