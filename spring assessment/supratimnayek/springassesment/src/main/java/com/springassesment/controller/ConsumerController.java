package com.springassesment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springassesment.entities.College;
import com.springassesment.entities.Consumer;
import com.springassesment.exceptions.CollegeNotFoundException;
import com.springassesment.service.CollegeService;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {
	
	@Autowired
	CollegeService collegeService;
	
	@GetMapping("/")
	public ResponseEntity<Consumer> getByCollege(@RequestParam("id") Integer collegeId) throws CollegeNotFoundException {
		
		College college = collegeService.getCollege(collegeId);
		Consumer consumer = new Consumer();
		consumer.setCollegeId(college.getCollegeId());
		consumer.setCollegeName(college.getCollegeName());
		consumer.setAddress(college.getAddress());
		consumer.setStudentList(college.getStudents());
		
		return new ResponseEntity<Consumer>(consumer,HttpStatus.OK);
	}
	
}
