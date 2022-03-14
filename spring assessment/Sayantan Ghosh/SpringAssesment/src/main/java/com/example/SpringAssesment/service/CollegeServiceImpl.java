package com.example.SpringAssesment.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringAssesment.entity.College;
import com.example.SpringAssesment.repository.CollegeRepository;

@Service
@Transactional
public class CollegeServiceImpl implements CollegeService {

	@Autowired
	CollegeRepository repository;
	
	
	@Override
	public College addCollege(College newCollege) {
		
		return repository.save(newCollege);
	}


	@Override
	public College getCollegeById(Integer collageId) {
		// TODO Auto-generated method stub
		return repository.findById(collageId).orElse(null);
	}

}
