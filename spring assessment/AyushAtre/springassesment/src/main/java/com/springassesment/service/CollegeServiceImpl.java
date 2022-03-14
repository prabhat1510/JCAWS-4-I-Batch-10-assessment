package com.springassesment.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springassesment.dao.CollegeRepository;
import com.springassesment.entities.College;
import com.springassesment.entities.Student;
import com.springassesment.exceptions.CollegeNotAddedException;
import com.springassesment.exceptions.CollegeNotFoundException;

@Service
@Transactional
public class CollegeServiceImpl implements CollegeService {
	
	@Autowired
	CollegeRepository collegeRepository;

	@Override
	public College addCollege(College college)  {
		College savedCollege = collegeRepository.save(college);
		if(savedCollege!=null) {
			return savedCollege;
		}
		throw new CollegeNotAddedException("Could not add college");
	}

	@Override
	public College getCollege(Integer collegeId) throws CollegeNotFoundException {
		Optional<College> result = collegeRepository.findById(collegeId);
		if(!result.isPresent()) throw new CollegeNotFoundException("College Not Found");
		return result.get();
	}
	
	@Override
	public List<College> getAllColleges() throws CollegeNotFoundException {
		List<College> collegeList =  (List<College>) collegeRepository.findAll();
		if(collegeList.isEmpty()) throw new CollegeNotFoundException("No Colleges Found");
		return collegeList;
	}

	@Override
	public College updateCollege(College college, Integer id) throws CollegeNotFoundException {
		Optional<College> result = collegeRepository.findById(id);
		if(!result.isPresent()) throw new CollegeNotFoundException("College Not Found");
		else {
			college.setCollegeId(id);
			return collegeRepository.save(college);
		}
	}

	@Override
	public String deleteCollege(Integer collegeId) throws CollegeNotFoundException {
		Optional<College> result = collegeRepository.findById(collegeId);
		if(!result.isPresent()) throw new CollegeNotFoundException("College Not Found");
		else {
			collegeRepository.deleteById(collegeId);
			return "College Deleted Successfully";
		}
	}
	
	@Override
	public College customSeach(String collegeName, String address) throws CollegeNotFoundException {
		College college = collegeRepository.customSearch(collegeName, address);
		if(college==null) throw new CollegeNotFoundException("College Not Found");
		return college;
	}

	@Override
	public List<Student> getStudents(Integer id) throws CollegeNotFoundException {
		Optional<College> result = collegeRepository.findById(id);
		if(!result.isPresent()) throw new CollegeNotFoundException("College Not Found");
		return result.get().getStudents();
	}

	

}
