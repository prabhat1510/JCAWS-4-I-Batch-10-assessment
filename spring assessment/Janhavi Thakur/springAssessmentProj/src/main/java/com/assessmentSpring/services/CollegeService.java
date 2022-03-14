package com.assessmentSpring.services;

import java.util.List;

import com.springAssessment.exception.CollegeNotFoundException;
import com.springAssessment.models.College;

public interface CollegeService {

	public List<College> getAllColleges();

	// CRUD
	public College addCollege(College college);

	public College getCollegeById(Integer collegeId) throws CollegeNotFoundException;

	public Boolean updateCollegeDetails(College newCollege, Integer collegeId);

	public Boolean deleteCollegeById(Integer collegeId);

	// user should be able to search college by Name and address separately
	public College getCollegeByName(String collegeName) throws CollegeNotFoundException;

	public College getCollegeByAddress(String address) throws CollegeNotFoundException;

}
