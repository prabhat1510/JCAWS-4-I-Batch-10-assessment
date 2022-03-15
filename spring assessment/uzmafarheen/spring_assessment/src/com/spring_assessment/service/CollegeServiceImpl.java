package com.spring_assessment.service;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_assessment.entity.College;
import com.spring_assessment.repository.CollegeRepository;

@Service("CollegeService")
@Transactional
public class CollegeServiceImpl implements CollegeService {

	@Autowired
	CollegeRepository collegeRepository;

	@Override
	public College addCollege(College newcollege) {
		return collegeRepository.save(newcollege);
	}

}

