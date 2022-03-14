package assessmentspring.service;

import java.util.List;

import assessmentspring.entity.College;
import assessmentspring.exception.CollegeNotFoundException;

public interface CollegeService {
	
	//add
		public College addCollege(College college);
		
		//retrieve
		public List<College> getAllCollege();
		public College getByCollegeId(Integer collegeId) throws CollegeNotFoundException;
		public College getByCollegeName(String collegeName);
		public College getByCollegeAddress(String address);
		
		//Delete
		public Boolean deleteCollegeById( Integer collegeId);
		
		//update
		College updateCollege(College college,Integer collegeId);

}
