package com.springassesment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springassesment.entities.College;
import com.springassesment.entities.Student;
import com.springassesment.exceptions.CollegeNotAddedException;
import com.springassesment.exceptions.CollegeNotFoundException;
import com.springassesment.service.CollegeService;

@RestController
@RequestMapping("/college")
public class CollegeController {

	@Autowired
	CollegeService collegeService;
	
	@PostMapping("/add")
	public ResponseEntity<College> add(@RequestBody College college) throws CollegeNotAddedException {
		return new ResponseEntity<College>(collegeService.addCollege(college),HttpStatus.OK);
	}
	
	@GetMapping("")
	public ResponseEntity<College> getCollege(@RequestParam("id") Integer collegeId) throws CollegeNotFoundException {
		return new ResponseEntity<College>(collegeService.getCollege(collegeId),HttpStatus.FOUND);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<College>> getAllColleges() throws CollegeNotFoundException{
		return new ResponseEntity<List<College>>(collegeService.getAllColleges(),HttpStatus.FOUND);
	}
	
	@PutMapping("/update")
	public ResponseEntity<College> updateCollege(@RequestBody College college,
							     @RequestParam("id") Integer collegeId) 
							    		 throws CollegeNotFoundException {
		
		return new ResponseEntity<College>(collegeService.updateCollege(college, collegeId),HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteCollege(@RequestParam("id") Integer collegeId) throws CollegeNotFoundException {
		return new ResponseEntity<String>(collegeService.deleteCollege(collegeId),HttpStatus.OK);
	}
	
	@GetMapping("/")
	public ResponseEntity<College> getCollegeByNameAndAddress(@RequestParam("name") String collegeName,
											  @RequestParam("address") String address) 
													  throws CollegeNotFoundException {
		
		return new ResponseEntity<College>(collegeService.customSeach(collegeName, address),HttpStatus.FOUND);
		
	}
	
	@GetMapping("/getStudents")
	public ResponseEntity<List<Student>> getStudents(@RequestParam("id") Integer collegeId) throws CollegeNotFoundException{
		return new ResponseEntity<List<Student>>(collegeService.getStudents(collegeId),HttpStatus.OK);
	}
		
}
