package com.springassessment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springassessment.entity.College;
import com.springassessment.exception.CollegeNotFoundException;
import com.springassessment.service.CollegeService;

@RestController
@RequestMapping("/college")
public class CollegeController {

	@Autowired
	CollegeService collegeService;
	
	@GetMapping("/colleges")
	public ResponseEntity<List<College>> retrieveAllCollege(){
		return new ResponseEntity<>(collegeService.retrieveAllCollege(),HttpStatus.FOUND);
	}
	
	@PostMapping("/newcollege")
	public ResponseEntity<College> createCollegeDetail(@RequestBody College college) {
		return  new ResponseEntity<>(collegeService.createCollege(college),HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<College> retrieveCollegeById(@PathVariable(value="id") Integer collegeId) throws CollegeNotFoundException{
		return new ResponseEntity<>(collegeService.retrieveCollegeById(collegeId),HttpStatus.OK);
	}
	
	@DeleteMapping("/College/{collegeId}")
	  void deleteEmployee(@PathVariable Integer collegeId) {
		collegeService.deleteCollegeById(collegeId);
	}
	
	@PutMapping("/College/{collegeId}")
	  College updateCollege(@RequestBody College newCollege, @PathVariable Integer collegeId) {
		  return collegeService.updateCollege(newCollege,collegeId);
	 }

}
