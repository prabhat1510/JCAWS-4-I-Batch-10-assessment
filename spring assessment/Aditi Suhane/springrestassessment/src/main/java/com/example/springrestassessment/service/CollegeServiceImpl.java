package com.example.springrestassessment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springrestassessment.entity.College;
import com.example.springrestassessment.repository.CollegeRepository;

@Service
public class CollegeServiceImpl implements CollegeService {

	@Autowired
	CollegeRepository collegeRepository;

	@Override
	public College addCollege(College newcollege) {
		return collegeRepository.save(newcollege);
	}

//	@Override
//	public College retriveCollegeByName(String college) {
//		return collegeRepository.findCollegeByName(college);
//	}
//
//	@Override
//	public College retriveCollegeByAddress(String address) {
//		return collegeRepository.findCollegeByAddress(address);
//	}
	
}