package com.Assessment.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Assessment.dao.CollegeRepository;
import com.Assessment.model.College;

@Service
@Transactional
public class CollegeServiceImpl implements CollegeService{
	@Autowired
	CollegeRepository collegeRepository;

	@Override
	public List<College> getAllCollege() {
		return (List<College>) collegeRepository.findAll();
	}

	@Override
	public College addCollege(College college) {
		
		return collegeRepository.save(college);
	}

	@Override
	public College getCollegeById(Integer collegeId) {
		Optional<College> college = collegeRepository.findById(collegeId);
		if(college.isPresent()) {
			return college.get();
		}
		return null;
	}

	@Override
	public Boolean deleteCollegeById(Integer collegeId) {
		collegeRepository.deleteById(collegeId);
		if(collegeRepository.existsById(collegeId)) {
			return false;
		}
		return true;
	}


	@Override
	public Boolean updateCollege(College college) {
		
		if(collegeRepository.existsById(college.getCollegeId())) {
			College college1= collegeRepository.save(college);
				if(college1!=null) {
					return true;
				}
		}
		return false;
	}

	@Override
	public College getCollegeByName(String collegeName) {
		
		return collegeRepository.findCollegeByName(collegeName);
	}

	@Override
	public Boolean deleteCollege(College college) {
		// TODO Auto-generated method stub
		return null;
	}


}
