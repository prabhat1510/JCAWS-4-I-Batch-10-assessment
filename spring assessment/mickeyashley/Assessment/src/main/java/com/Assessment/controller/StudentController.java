package com.Assessment.controller;

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

import com.Assesment.exception.StudentNotFoundException;
import com.Assessment.model.Student;
import com.Assessment.service.StudentService;

//http://localhost:8080/student/students
@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Student>> retrieveAllStudents(){
		return new ResponseEntity<>(studentService.getAllStudent(),HttpStatus.FOUND);
	}
	@PostMapping("/newStudent")
	public ResponseEntity<Student> createStudentDetail(@RequestBody Student student) {
		return  new ResponseEntity<>(studentService.addStudent(student),HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Student> retrieveStudentById(@PathVariable(value="id") Integer studentId) throws StudentNotFoundException{
		return new ResponseEntity<>(studentService.getStudentById(studentId),HttpStatus.OK);
	}
}
