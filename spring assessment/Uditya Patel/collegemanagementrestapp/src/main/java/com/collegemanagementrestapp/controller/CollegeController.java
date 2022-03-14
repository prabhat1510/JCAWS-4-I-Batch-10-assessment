package com.collegemanagementrestapp.controller;

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

import com.collegemanagementrestapp.exception.CollegeNotFoundException;
import com.collegemanagementrestapp.model.College;
import com.collegemanagementrestapp.service.CollegeService;


@RestController
@RequestMapping("/college")
public class CollegeController {

	@Autowired
	CollegeService collegeService;
	
	@GetMapping()
	public ResponseEntity<List<College>> showAll()
	{
		return new ResponseEntity<>(collegeService.getAllCollege(),HttpStatus.OK);
	}
	
	@GetMapping("/{name}")
	public ResponseEntity<College> getCollegeByName(@PathVariable(value="name") String collegeName)
	{
		return new ResponseEntity<College>(collegeService.getCollegeByName(collegeName),HttpStatus.OK);
	}
	
	@PostMapping()
	public ResponseEntity<College> addCollege(@RequestBody College college)
	{
		return new ResponseEntity<>(collegeService.addCollege(college),HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteCollege(@PathVariable(value="id") Integer collegeId)
	{
		return new ResponseEntity<String>(collegeService.deleteCollege(collegeId),HttpStatus.ACCEPTED);
	}
	

	@PutMapping("/{id}")
	public ResponseEntity<College> updateCollege(@PathVariable(value="id") Integer collegeId, @RequestBody College college)
	{
		return new ResponseEntity<>(collegeService.updateCollege(collegeId,college),HttpStatus.OK);
	}
	
	
	
	

	
	
	
}
