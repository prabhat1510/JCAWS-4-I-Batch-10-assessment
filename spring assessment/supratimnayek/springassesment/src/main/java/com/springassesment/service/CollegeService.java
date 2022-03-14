package com.springassesment.service;

import java.util.List;

import com.springassesment.entities.College;
import com.springassesment.entities.Student;
import com.springassesment.exceptions.CollegeNotAddedException;
import com.springassesment.exceptions.CollegeNotFoundException;

public interface CollegeService {
	
	public College addCollege(College college) throws CollegeNotAddedException;
	
	public College getCollege(Integer collegeId) throws CollegeNotFoundException;
	
	public List<College> getAllColleges() throws CollegeNotFoundException;
	
	public College updateCollege(College college,Integer id) throws CollegeNotFoundException;
	
	public String deleteCollege(Integer collegeId) throws CollegeNotFoundException;
	
	public College customSeach(String collegeName,String address) throws CollegeNotFoundException;
	
	public List<Student> getStudents(Integer id) throws CollegeNotFoundException;
	
}
