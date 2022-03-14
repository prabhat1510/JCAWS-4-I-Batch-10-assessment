package com.assignment.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.entity.College;
import com.assignment.exception.CollegeNotFoundException;
import com.assignment.repository.CollegeRepository;

@Service
@Transactional
public class CollegeServiceImpl implements CollegeService{
	
	@Autowired
	CollegeRepository collegerepository;
	
	
	@Override
	public void deleteCollege(Integer collegeId) {
		collegerepository.deleteById(collegeId);

	}

	@Override
	public College replaceCollege(College newCollege, Integer collegeId) {
		return collegerepository.findById(collegeId)
			      .map(college -> {
			    	  college.setCollegeName(newCollege.getCollegeName());
			    	  college.setAddress(newCollege.getAddress());
			        return collegerepository.save(college);
			      })
			      .orElseGet(() -> {
			        newCollege.setCollegeId(collegeId);
			        return collegerepository.save(newCollege);
			      });
	}

	@Override
	public College one(Integer collegeId) throws CollegeNotFoundException {
		return collegerepository.findById(collegeId)
			      .orElseThrow(() -> new CollegeNotFoundException(collegeId));
	}

	@Override
	public College newCollege(College newCollege) {
		return collegerepository.save(newCollege);
	}

	@Override
	public List<College> all() {
		return (List<College>) collegerepository.findAll();
	}

	@Override
	public College getCollegeByName(String collegeName) {
		return collegerepository.findCollegeByName(collegeName);
	}

	@Override
	public College getCollegeByAddress(String address) {
		return collegerepository.findCollegeByAddress(address);
	}

	
	
}