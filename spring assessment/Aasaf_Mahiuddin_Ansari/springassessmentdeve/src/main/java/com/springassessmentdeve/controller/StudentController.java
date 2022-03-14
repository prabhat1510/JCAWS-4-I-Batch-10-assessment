package com.springassessmentdeve.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springassessmentdeve.entity.Student;
import com.springassessmentdeve.exception.StudentNotFoundException;
import com.springassessmentdeve.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/studentById/{id}")
	public ResponseEntity<Student> getStudentByID(@PathVariable(value = "id") Integer studentId) throws StudentNotFoundException{
		return new ResponseEntity<>(studentService.getStudentById(studentId),HttpStatus.OK);
	}
	
	@GetMapping("/studentsByCollageId/{id}")
	public ResponseEntity<List<Student>> getStudentByCollageId(@PathVariable Integer collageId){
		return new ResponseEntity<>(studentService.getAllStudentByCollageId(collageId),HttpStatus.FOUND);
	}
	
	@PostMapping("/addStudent")
	public ResponseEntity<Student> addStudent(@RequestBody Student student){
		return new ResponseEntity<>(studentService.addStudent(student), HttpStatus.CREATED);
	}
}
