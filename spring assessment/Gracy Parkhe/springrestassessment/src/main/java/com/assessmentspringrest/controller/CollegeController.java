package com.assessmentspringrest.controller;

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

import com.assessmentspringrest.entity.College;
import com.assessmentspringrest.entity.Student;
import com.assessmentspringrest.exceptions.CollegeNotFoundException;
import com.assessmentspringrest.service.CollegeService;

//localhost:8081/college/allcollege
@RestController
@RequestMapping("/college")
public class CollegeController {
	@Autowired
	CollegeService collegeService;
	
	
	//localhost:8081/college/allcollege
	@GetMapping("/allcollege")
	public ResponseEntity<List<College>> retrieveAllCollege(){
		return new ResponseEntity<>(collegeService.retrieveAllCollege(),HttpStatus.FOUND);
	}
	
	//localhost:8081/college/newcollege
	@PostMapping("/newcollege")
	public ResponseEntity<College> createCollegeDetail(@RequestBody College college) {
		return  new ResponseEntity<>(collegeService.createCollegeDetail(college),HttpStatus.CREATED);
	}
	
	//localhost:8081/college/{id}
	@GetMapping("/{id}")
	public ResponseEntity<College> retrieveCollegeById(@PathVariable(value="id") Integer collegeId) throws CollegeNotFoundException{
		return new ResponseEntity<>(collegeService.retrieveCollegeById(collegeId),HttpStatus.OK);
	}
	
	//localhost:8081/college/{id}
	@PutMapping("/{id}")
	  College replaceCollege(@RequestBody College newCollege, @PathVariable Integer id) {
		  return collegeService.replaceCollege(newCollege,id);
	  }
	
	//localhost:8081/delete/{id}
	@DeleteMapping("/delete/{id}")
	  void deleteCollegebyId(@PathVariable Integer id) {
		collegeService.deleteCollegeById(id);
	  }
}
