package com.springBootAssessment.demo.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBootAssessment.demo.exception.CollegeNotFoundException;
import com.springBootAssessment.demo.model.College;
import com.springBootAssessment.demo.repository.CollegeRepository;

@Service
@Transactional
public class CollegeServiceImpl implements CollegeService {

	@Autowired
	private CollegeRepository collegeRepo;

	@Override
	public List<College> getAllColleges() {
		return collegeRepo.findAll();
	}

	@Override
	public College addCollege(College college) {
		return collegeRepo.save(college);
	}

	@Override
	public College getCollegeById(Integer collegeId) throws CollegeNotFoundException {
		Optional<College> clg = collegeRepo.findById(collegeId);
		if (clg.isEmpty()) {
			throw new CollegeNotFoundException(collegeId);
		}
		return clg.get();
	}

	@Override
	public Boolean updateCollegeDetails(College newCollege, Integer collegeId) {
		if (collegeRepo.existsById(newCollege.getCollegeId())) {
			College college = collegeRepo.save(newCollege);
			if (college != null) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Boolean deleteCollegeById(Integer collegeId) {
		collegeRepo.deleteById(collegeId);
		if (collegeRepo.existsById(collegeId)) {
			return false;
		}
		return true;
	}

	@Override
	public College getCollegeByName(String collegeName) throws CollegeNotFoundException {
		College college = collegeRepo.findCollegeByName(collegeName);
		if (college != null) {
			return college;
		} else {
			throw new CollegeNotFoundException("No college exists with name : " + collegeName);
		}
	}

	@Override
	public College getCollegeByAddress(String address) throws CollegeNotFoundException {
		College college = collegeRepo.findCollegeByAddress(address);
		if (college != null) {
			return college;
		} else {
			throw new CollegeNotFoundException("No college found with address : " + address);
		}
	}

}
