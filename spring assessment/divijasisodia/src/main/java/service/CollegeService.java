package service;

import java.util.List;

import entity.College;
import exception.CollegeNotFoundException;

public interface CollegeService {
public List<College> retrieveAllCollege();
	
	public College createCollegeDetail(College college);
	
	public College retrieveCollegeById(Integer collegeId) throws CollegeNotFoundException;
	
	public void deleteCollegeById(Integer collegeId);
	
	public College updateCollegeDetails(College newCollege,Integer collegeId);
}
