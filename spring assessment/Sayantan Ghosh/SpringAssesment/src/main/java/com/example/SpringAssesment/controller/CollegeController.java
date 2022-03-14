package com.example.SpringAssesment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringAssesment.entity.College;
import com.example.SpringAssesment.service.CollegeService;

@RestController
@RequestMapping("/springAssesment")
public class CollegeController {

	@Autowired
	private CollegeService collegeService;
	
	  @PostMapping("/addCollege")
	  College addCollege(@RequestBody College newCollege) {
	    return collegeService.addCollege(newCollege);
	  }
	  
	  @GetMapping("/getCollegeById/{collegeId}")
	  College getCollegeById(@PathVariable Integer collegeId)
	  {
		return collegeService.getCollegeById(collegeId);
		  
	  }
}
