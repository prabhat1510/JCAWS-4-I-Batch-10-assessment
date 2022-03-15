package com.Assessment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Assesment.exception.CollegeNotFoundException;
import com.Assessment.model.College;
import com.Assessment.service.CollegeService;

//http://localhost:8080/student/students
@RestController
@RequestMapping("/college")
public class CollegeController {
	@Autowired
	CollegeService collegeService;
	
	@GetMapping("/all")
	public ResponseEntity<List<College>> retrieveAllColleget(){
		return new ResponseEntity<>(collegeService.getAllCollege(),HttpStatus.FOUND);
	}
	@PostMapping("/newCollege")
	public ResponseEntity<College> createStudentDetail(@RequestBody College college) {
		return  new ResponseEntity<>(collegeService.addCollege(college),HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<College> retrieveCollegeById(@PathVariable(value="id") Integer collegeId) throws CollegeNotFoundException{
		return new ResponseEntity<>(collegeService.getCollegeById(collegeId),HttpStatus.OK);
	}
}
