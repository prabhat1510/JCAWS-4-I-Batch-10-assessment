package com.collegeinfoapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collegeinfoapp.entities.College;
import com.collegeinfoapp.exceptions.CollegeNotFoundException;
import com.collegeinfoapp.repository.CollegeRepository;
@Service
public class CollegeServiceImpl implements CollegeService {
	
	@Autowired
	CollegeRepository collegeRepository;

	@Override
	public College addCollegeDetail(College college) {
		return collegeRepository.save(college);
	}

	@Override
	public College retrieveCollegeById(Integer collegeId) throws CollegeNotFoundException {
		return collegeRepository.findById(collegeId).orElseThrow(() -> new CollegeNotFoundException(collegeId));
	}

	@Override
	public void deleteCollegeById(Integer collegeId) {
		collegeRepository.deleteById(collegeId);
		
	}

	@Override
	public College updateCollegeDetails(College newCollege, Integer collegeId) {
		return collegeRepository.findById(collegeId)
			      .map(college -> {
			        college.setCollegeName(newCollege.getCollegeName());
			        college.setAddress(newCollege.getAddress());
			        return collegeRepository.save(college);
			      })
			      .orElseGet(() -> {
			        newCollege.setCollegeId(collegeId);
			        return collegeRepository.save(newCollege);
			      });
	}
	
	

}
