package com.example.spring_restproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_restproject.entity.College;
import com.example.spring_restproject.service.CollegeService;

@RestController
@RequestMapping("/college")
public class CollegeController {

	@Autowired
	CollegeService collegeService;
	
	@PostMapping("/newcollege")
	public ResponseEntity<College> addNewCollege(@RequestBody College newcollege) {
		return new ResponseEntity<>(collegeService.addCollege(newcollege), HttpStatus.CREATED);
	}
	
//	@GetMapping("/collegeByName")
//	public ResponseEntity<College> getCollegeByName(@RequestParam(value = "eName") String name) {
//		return new ResponseEntity<College>(collegeService.retriveCollegeByName(name), HttpStatus.OK);
//	}
//
//	@GetMapping("/collegeByaddress")
//	public ResponseEntity<College> getCollegeByAddress(@RequestParam(value = "aAddress") String address) {
//		return new ResponseEntity<College>(collegeService.retriveCollegeByAddress(address), HttpStatus.OK);
//	}
	
}