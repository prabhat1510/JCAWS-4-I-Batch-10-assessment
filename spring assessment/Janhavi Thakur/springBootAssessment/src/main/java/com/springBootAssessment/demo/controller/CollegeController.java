package com.springBootAssessment.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

import com.springBootAssessment.demo.exception.CollegeNotFoundException;
import com.springBootAssessment.demo.model.College;
import com.springBootAssessment.demo.services.CollegeService;

@RestController
@RequestMapping("/college")
public class CollegeController {

	@Autowired
	CollegeService collegeService;

	@GetMapping()
	public ResponseEntity<List<College>> fetchAllColleges() {
		return new ResponseEntity<List<College>>(collegeService.getAllColleges(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<College> fetchCollegeById(@PathVariable(value = "id") Integer collegeId)
			throws CollegeNotFoundException {
		return new ResponseEntity<College>(collegeService.getCollegeById(collegeId), HttpStatus.OK);
	}

	@GetMapping("/address/{address}")
	public ResponseEntity<College> fetchCollegeByAddress(@PathVariable(value = "address") String address)
			throws CollegeNotFoundException {
		return new ResponseEntity<College>(collegeService.getCollegeByAddress(address), HttpStatus.OK);
	}

	@GetMapping("/name/{name}")
	public ResponseEntity<College> fetchCollegeByName(@PathVariable(value = "name") String name)
			throws CollegeNotFoundException {
		return new ResponseEntity<College>(collegeService.getCollegeByName(name), HttpStatus.OK);
	}

	@PostMapping()
	public ResponseEntity<College> addCollege(@RequestBody College college) {
		return new ResponseEntity<College>(collegeService.addCollege(college), HttpStatus.CREATED);
	}

	@PutMapping()
	public ResponseEntity<Boolean> updateCollege(@RequestBody College college) {
		return new ResponseEntity<Boolean>(collegeService.updateCollegeDetails(college, college.getCollegeId()),
				HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteCollege(@PathVariable(value = "id") Integer collegeId) {
		return new ResponseEntity<Boolean>(collegeService.deleteCollegeById(collegeId), HttpStatus.OK);
	}

}
