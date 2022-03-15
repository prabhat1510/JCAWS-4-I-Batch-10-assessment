package com.springBootAssessment.demo.services;

import java.util.List;

import com.springBootAssessment.demo.exception.CollegeNotFoundException;
import com.springBootAssessment.demo.model.College;

public interface CollegeService {

	public List<College> getAllColleges();

	public College addCollege(College college);

	public College getCollegeById(Integer collegeId) throws CollegeNotFoundException;

	public Boolean updateCollegeDetails(College newCollege, Integer collegeId);

	public Boolean deleteCollegeById(Integer collegeId);

	public College getCollegeByName(String collegeName) throws CollegeNotFoundException;

	public College getCollegeByAddress(String address) throws CollegeNotFoundException;

}
