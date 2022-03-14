package com.CollegeManagementSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CollegeManagementSystem.entity.College;
import com.CollegeManagementSystem.repository.CollegeRepository;
import com.CollegeManagementSystem.exeption.CollegeNotFoundException;

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
