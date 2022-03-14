package com.springassessment.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springassessment.entity.College;
import com.springassessment.exception.CollegeNotFoundException;
import com.springassessment.repository.CollegeRepository;

@Service
@Transactional
public class CollegeServiceImpl implements CollegeService {
	
	@Autowired
	CollegeRepository collegeRepository;

	@Override
	public List<College> retrieveAllCollege() {
		return (List<College>) collegeRepository.findAll();
	}

	@Override
	public College createCollege(College college) {
		return collegeRepository.save(college);
	}

	@Override
	public College retrieveCollegeById(Integer collegeId)  throws CollegeNotFoundException{
		return collegeRepository.findById(collegeId).orElseThrow(()-> new CollegeNotFoundException(collegeId));
	}

	@Override
	public void deleteCollegeById(Integer collegeId) {
		collegeRepository.deleteById(collegeId);
		
	}

	@Override
	public College updateCollege(College newCollege, Integer collegeId) {
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
