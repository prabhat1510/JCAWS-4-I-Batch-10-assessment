package com.example.SpringAssesment.service;

import com.example.SpringAssesment.entity.College;

public interface CollegeService {
	
	College addCollege(College newCollege);
	
	College getCollegeById(Integer collageId );

}
