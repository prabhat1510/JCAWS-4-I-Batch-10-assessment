package com.Assessment.service;

import java.util.List;

import com.Assessment.model.College;

public interface CollegeService {
	public List<College> getAllCollege();
	//Create
	public College addCollege(College college);
	//Retrieve
	public College getCollegeById(Integer collegeId);
	
	//Delete
	public Boolean deleteCollegeById(Integer collegeId);
	public Boolean deleteCollege(College college);
	
	//Update
	public Boolean updateCollege(College college);
	public College getCollegeByName(String collegeName);
}
