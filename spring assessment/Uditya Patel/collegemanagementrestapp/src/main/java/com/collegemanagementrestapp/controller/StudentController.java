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
import com.collegemanagementrestapp.exception.StudentNotFoundException;
import com.collegemanagementrestapp.model.Student;
import com.collegemanagementrestapp.service.CollegeService;
import com.collegemanagementrestapp.service.StudentService;


@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@Autowired
	CollegeService collegeService;
	
	@GetMapping()
	public ResponseEntity<List<Student>> showAll()
	{
		return new ResponseEntity<>(studentService.getAllStudent(),HttpStatus.OK);
	}
	
	@GetMapping("/studentbyid/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable(value="id") Integer studentId ) throws StudentNotFoundException
	{
		return new ResponseEntity<>(studentService.getStudentById(studentId),HttpStatus.OK);
	}
	
	@PostMapping()
	public ResponseEntity<Student> addstudent(@RequestBody Student student)
	{
		return new ResponseEntity<Student>(studentService.addStudent(student),HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deletestudent(@PathVariable(value="id") Integer studentId)
	{
		return new ResponseEntity<String>(studentService.deleteStudent(studentId),HttpStatus.ACCEPTED);
	}
	

	@PutMapping("/{id}")
	public ResponseEntity<Student> updatestudent(@PathVariable(value="id") Integer studentId, @RequestBody Student student)
	{
		return new ResponseEntity<Student>(studentService.updateStudent(studentId,student),HttpStatus.OK);
	}
	
	
	@GetMapping("/{collegeId}")
	public ResponseEntity<List<Student>> getStudentByCollegeId(@PathVariable(value=("collegeId") ) Integer collegeId ) throws CollegeNotFoundException
	{
		
		List<Student> students = collegeService.getCollegeById(collegeId).getStudents();
		return new ResponseEntity<List<Student>>(students,HttpStatus.OK); 
	}
	
	
}
