package com.collegemanagementrestapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collegemanagementrestapp.exception.CollegeNotFoundException;
import com.collegemanagementrestapp.model.College;
import com.collegemanagementrestapp.repository.CollegeRepository;


@Service
public class CollegeServiceImpl implements CollegeService {

	@Autowired
	CollegeRepository collegerepo;

	@Override
	public College addCollege(College college) {

		return collegerepo.save(college);
	}
	
	@Override
	public List<College> getAllCollege() {
		return (List<College>) collegerepo.findAll();
	}


	@Override
	public College getCollegeById(Integer collegeId) throws CollegeNotFoundException {
		Optional<College> college = collegerepo.findById(collegeId);
		if(college.isPresent())
		{
			return college.get();
		}
		else
		{
			throw new CollegeNotFoundException(collegeId);
			//return null;
		}
	
	}

	
	@Override
	public College updateCollege(Integer collegeId ,College college) {
		
			College ucollege = collegerepo.findById(collegeId).get();
			ucollege.setCollegeName(college.getCollegeName());
			ucollege.setAddress(college.getAddress());
			return collegerepo.save(ucollege);
		
	}

	@Override
	public String deleteCollege(Integer collegeId) {
	
		collegerepo.deleteById(collegeId);
		return "College Deleted";
	
	}

	@Override
	public College getCollegeByName(String collegeName) {
		return collegerepo.findCollegeByName(collegeName);
	}
	
}
