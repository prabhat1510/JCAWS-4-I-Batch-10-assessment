package springassesment.service;


import org.springframework.stereotype.Service;

import springassesment.entity.College;

@Service
public interface CollegeService {
	
	public College addCollege(College college);

//	public College retriveCollegeByName(String college);
//
//	public College retriveCollegeByAddress(String address);
	
}