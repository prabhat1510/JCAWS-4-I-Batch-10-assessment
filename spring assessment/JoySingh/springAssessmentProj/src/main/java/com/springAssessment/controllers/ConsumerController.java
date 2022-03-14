package com.springAssessment.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springAssessment.exception.CollegeNotFoundException;
import com.springAssessment.exception.StudentNotFoundException;
import com.springAssessment.models.College;
import com.springAssessment.services.CollegeService;
import com.springAssessment.services.StudentService;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

	@Autowired
	StudentService studentService;

	@Autowired
	CollegeService collegeService;

	@GetMapping("/{collegeId}")
	public ResponseEntity<Map<String, Object>> fetchCollegeDetailsWithStudents(
			@PathVariable(value = "collegeId") Integer collegeId) throws CollegeNotFoundException {

		College college = collegeService.getCollegeById(collegeId);

		Map<String, Object> res = new HashMap<String, Object>();
		res.put("status", true);
		res.put("collegeId", college.getCollegeId());
		res.put("collegeName", college.getCollegeName());
		res.put("CollegeAddress", college.getAddress());
		res.put("studentsList", studentService.getAllStudentsByCollegeId(collegeId));

		return new ResponseEntity<Map<String, Object>>(res, HttpStatus.OK);
	}

}
