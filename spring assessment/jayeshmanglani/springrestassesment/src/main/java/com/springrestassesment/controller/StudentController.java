package com.springrestassesment.controller;

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

import com.springrestassesment.entity.Student;
import com.springrestassesment.exceptions.StudentNotFoundException;
import com.springrestassesment.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService studentService;
	
	//http://localhost:8081/student/allstudents
	@GetMapping("/allstudents")
	public ResponseEntity<List<Student>> retrieveAllStudent(){
		return new ResponseEntity<>(studentService.retrieveAllStudent(),HttpStatus.FOUND);
	}
	
	// http://localhost:8081/student/newstudent
	@PostMapping("/newstudent")
	public ResponseEntity<Student> createStudentDetail(@RequestBody Student student) {
		return  new ResponseEntity<>(studentService.createStudentDetail(student),HttpStatus.CREATED);
	}
	
	// http://localhost:8081/student/{id}
	@GetMapping("/{id}")
	public ResponseEntity<Student> retrieveStudentById(@PathVariable(value="id") Integer studentId) throws StudentNotFoundException{
		return new ResponseEntity<>(studentService.retrieveStudentById(studentId),HttpStatus.OK);
	}
	
	// http://localhost:8081/student/student/{id}
	@PutMapping("/student/{id}")
	  Student replaceStudent(@RequestBody Student newStudent, @PathVariable Integer id) {
		  return studentService.replaceStudent(newStudent,id);
	  }
	  
	// http://localhost:8081/student/delete/{id}
	@DeleteMapping("/delete/{id}")
	  void deleteStudentbyId(@PathVariable Integer id) {
		studentService.deleteStudentById(id);
	  }
}