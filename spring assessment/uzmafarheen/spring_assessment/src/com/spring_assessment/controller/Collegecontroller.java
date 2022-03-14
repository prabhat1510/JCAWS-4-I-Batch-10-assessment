package com.spring_assessment.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring_assessment.entity.College;
import com.spring_assessment.service.CollegeService;

@RestController
@RequestMapping("/college")
public class Collegecontroller {
	@Autowired
	CollegeService collegeService;
	
	@PostMapping("/newcollege")
	public ResponseEntity<College> addNewCollege(@RequestBody College newcollege) {
		return new ResponseEntity<>(collegeService.addCollege(newcollege), HttpStatus.CREATED);
	}

}
