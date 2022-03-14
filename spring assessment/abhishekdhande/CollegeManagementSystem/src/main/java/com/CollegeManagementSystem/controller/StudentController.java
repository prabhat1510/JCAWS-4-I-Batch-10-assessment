package com.CollegeManagementSystem.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CollegeManagementSystem.entity.StudentEntity;
import com.CollegeManagementSystem.exeption.StudentNotFoundException;
import com.CollegeManagementSystem.service.StudentService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/student/{collegeId}")
	public ResponseEntity<List<Student>> retrieveAllStudentByCollegeId(@PathVariable Iterable<Integer> collegeId){
		return new ResponseEntity<> (studentService.retrieveAllStudentByCollegeId(collegeId),HttpStatus.FOUND);
		
	}
	
	@PostMapping("/student")
	public ResponseEntity<Student> createStudentDetail(Student student) {
		return new ResponseEntity<> (studentService.createStudentDetail(student),HttpStatus.CREATED);
	}
	
	@GetMapping("/students/{studentId}")
	public ResponseEntity<Student> retrieveStudentById(@PathVariable Integer studentId) throws StudentNotFoundException {
		return new ResponseEntity<> (studentService.retrieveStudentById(studentId),HttpStatus.OK);
	}
	
	@DeleteMapping("/studentsdel/{studentId}")
	public ResponseEntity<Void> deleteStudentById(@PathVariable Integer studentId) {
		studentService.deleteStudentById(studentId);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	
	@PutMapping("/studentup/{studentId}")
	public ResponseEntity<Student> updateStudentDetails(@RequestBody Student newStudent, @PathVariable Integer studentId) {
		return new ResponseEntity<>(studentService.updateStudentDetails(newStudent, studentId),HttpStatus.OK);
	}

}
