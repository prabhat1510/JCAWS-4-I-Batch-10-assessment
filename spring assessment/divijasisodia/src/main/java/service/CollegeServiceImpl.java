package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import entity.College;
import exception.CollegeNotFoundException;
import repository.CollegeRepository;


public class CollegeServiceImpl implements CollegeService{
	@Autowired
	CollegeRepository collegeRepository;

	@Override
	public List<College> retrieveAllCollege() {
		// TODO Auto-generated method stub
		return (List<College>) collegeRepository.findAll();
	}

	@Override
	public College createCollegeDetail(College newCollege) {
		// TODO Auto-generated method stub
		return collegeRepository.save(newCollege);
	}

	@Override
	public College retrieveCollegeById(Integer collegeId) throws CollegeNotFoundException {
		// TODO Auto-generated method stub
		return collegeRepository.findById(collegeId).orElseThrow(() -> new CollegeNotFoundException(collegeId));
	}

	@Override
	public void deleteCollegeById(Integer collegeId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public College updateCollegeDetails(College newCollege, Integer collegeId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
