package com.springassesment.controller;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springassesment.entites.Student;
import com.springassesment.exceptions.StudentNotFoundException;
import com.springassesment.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	

		@Autowired
		StudentService studentService;
		
		@GetMapping("/students")
		public ResponseEntity<List<Student>> retrieveAllStudent(){
			return new ResponseEntity<>(studentService.retrieveAllStudent(),HttpStatus.FOUND);
		}
		
		@PostMapping("/newstudent")
		public ResponseEntity<Student> createStudentDetail(@RequestBody Student student) {
			return  new ResponseEntity<>(studentService.createStudentDetail(student),HttpStatus.CREATED);
		}
		
		@GetMapping("/{id}")
		public ResponseEntity<Student> retrieveStudentById(@PathVariable(value="id") Integer studentId) throws StudentNotFoundException{
			return new ResponseEntity<>(studentService.retrieveStudentById(studentId),HttpStatus.OK);
		}
		
		@DeleteMapping("/student/{studentId}")
		  void deleteEmployee(@PathVariable Integer studentId) {
			studentService.deleteStudentById(studentId);
		}
		
		@PutMapping("/student/{studentId}")
		  Student updateStudent(@RequestBody Student newStudent, @PathVariable Integer studentId) {
			  return studentService.updateStudentDetails(newStudent,studentId);
		 }
		
		@GetMapping("/studentByName")
		public ResponseEntity<Student> getStudentByName(@RequestParam(value = "sName") String studentName) {
			return new ResponseEntity<Student>(studentService.getStudentByName(studentName), HttpStatus.OK);
		}
	}


