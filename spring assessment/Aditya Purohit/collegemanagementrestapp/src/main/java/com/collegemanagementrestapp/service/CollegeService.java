package com.collegemanagementrestapp.service;

import java.util.List;

import com.collegemanagementrestapp.exception.CollegeNotFoundException;
import com.collegemanagementrestapp.model.College;


public interface CollegeService {
	
			//create
			public College addCollege(College college);

			//retrive
			public College getCollegeById(Integer collegeId) throws CollegeNotFoundException;
			
			//delete
			public String deleteCollege(Integer CollegeId);
			
			//update
			public College updateCollege(Integer collegeId,College college);

			public List<College> getAllCollege();
			
			public College getCollegeByName(String collegeName);

//			public Customer addOrder(Long customerId, Long orderId,Order order);

}
