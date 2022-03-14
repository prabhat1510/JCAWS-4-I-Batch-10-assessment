package springassesment.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springassesment.entity.College;
import springassesment.repository.CollegeRepository;

@Service("CollegeService")
@Transactional
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