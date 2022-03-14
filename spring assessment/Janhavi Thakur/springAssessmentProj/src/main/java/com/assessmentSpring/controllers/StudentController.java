package com.assessmentSpring.controllers;

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

import com.springAssessment.exception.StudentNotFoundException;
import com.springAssessment.models.Student;
import com.springAssessment.services.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;

	@GetMapping()
	public ResponseEntity<Map<String, Object>> fetchAllStudents() {

		Map<String, Object> res = new HashMap<String, Object>();
		res.put("status", true);
		res.put("data", studentService.getAllStudents());

		return new ResponseEntity<Map<String, Object>>(res, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Map<String, Object>> fetchStudentById(@PathVariable(value = "id") Integer studentId)
			throws StudentNotFoundException {
		Map<String, Object> res = new HashMap<String, Object>();
		res.put("status", true);
		res.put("data", studentService.getStudentById(studentId));

		return new ResponseEntity<Map<String, Object>>(res, HttpStatus.OK);
	}

	@GetMapping("/allByCollegeId/{id}")
	public ResponseEntity<Map<String, Object>> fetchAllStudentsByCollegeId(
			@PathVariable(value = "id") Integer collegeId) {
		Map<String, Object> res = new HashMap<String, Object>();
		res.put("status", true);
		res.put("data", studentService.getAllStudentsByCollegeId(collegeId));

		return new ResponseEntity<Map<String, Object>>(res, HttpStatus.OK);
	}

	@GetMapping("/collegeId/{id}")
	public ResponseEntity<Map<String, Object>> fetchStudentByCollegeId(@PathVariable(value = "id") Integer collegeId)
			throws StudentNotFoundException {
		Map<String, Object> res = new HashMap<String, Object>();
		res.put("status", true);
		res.put("data", studentService.getStudentByCollegeId(collegeId));

		return new ResponseEntity<Map<String, Object>>(res, HttpStatus.OK);
	}

	@PostMapping()
	public ResponseEntity<Map<String, Object>> addStudent(@RequestBody Student student) {
		Map<String, Object> res = new HashMap<String, Object>();
		res.put("status", true);
		res.put("message", "data inserted successfully!");
		res.put("data", studentService.addStudent(student));

		return new ResponseEntity<Map<String, Object>>(res, HttpStatus.CREATED);
	}

	@PutMapping()
	public ResponseEntity<Map<String, Object>> updateStudent(@RequestBody Student student) {
		Map<String, Object> res = new HashMap<String, Object>();
		res.put("status", true);
		res.put("message", "data updated successfully!");
		res.put("data", studentService.updateStudent(student, student.getStudentId()));

		return new ResponseEntity<Map<String, Object>>(res, HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Map<String, Object>> deleteStudent(@PathVariable(value = "id") Integer studentId) {
		Map<String, Object> res = new HashMap<String, Object>();
		res.put("status", studentService.deleteStudentById(studentId));
		res.put("message", "data deleted successfully!");

		return new ResponseEntity<Map<String, Object>>(res, HttpStatus.OK);
	}

}
