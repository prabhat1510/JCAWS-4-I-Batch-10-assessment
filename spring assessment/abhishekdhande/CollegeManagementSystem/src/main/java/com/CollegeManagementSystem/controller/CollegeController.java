package com.CollegeManagementSystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CollegeManagementSystem.entity.CollegeEntity;
import com.CollegeManagementSystem.exeption.CollegeNotFoundException;
import com.CollegeManagementSystem.service.CollegeService;

@RestController
@RequestMapping("api/v7/")
public class CollegeController {

	@Autowired
	CollegeService collegeService;
	
	@PostMapping("/college")
    public ResponseEntity<College> addCollegeDetail(College college) {
    	return new ResponseEntity<> (collegeService.addCollegeDetail(college), HttpStatus.CREATED);
    }
	
	@GetMapping("/colleges/{collegeId}")
	public ResponseEntity<College> retrieveCollegeById(@PathVariable Integer collegeId) throws CollegeNotFoundException{
    	return new ResponseEntity<>(collegeService.retrieveCollegeById(collegeId),HttpStatus.FOUND);
    }
	
	@DeleteMapping("/collegedel/{collegeId}")
	public ResponseEntity<Void> deleteCollegeById(Integer collegeId) {
		collegeService.deleteCollegeById(collegeId);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@PutMapping("/collegeup/{collegeId}")
	public ResponseEntity<College>updateCollegeDetails(College newCollege,Integer collegeId) {
		return new ResponseEntity<>(collegeService.updateCollegeDetails(newCollege, collegeId),HttpStatus.OK);
	}
}
