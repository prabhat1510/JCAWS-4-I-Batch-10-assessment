package com.example.SpringAssesment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringAssesment.entity.Student;

import com.example.SpringAssesment.service.StudentService;


@RestController
@RequestMapping("/springAssesment")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
//	springAssesment/addStudent
	  @PostMapping("/addStudent")
	  Student addStudent(@RequestBody Student newStudent) {
	    return studentService.addStudent(newStudent);
	  }
	  
//	  springAssesment/getStudentById/{studentId}
	  @GetMapping("/getStudentById/{studentId}")
	  Student getStudentById(@PathVariable Integer studentId)
	  {
		return studentService.getstudentById(studentId);
		  
	  }
}
