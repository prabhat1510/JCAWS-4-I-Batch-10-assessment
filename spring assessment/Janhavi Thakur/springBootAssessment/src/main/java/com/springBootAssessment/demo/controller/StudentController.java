package com.springBootAssessment.demo.controller;

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

import com.springBootAssessment.demo.exception.StudentNotFoundException;
import com.springBootAssessment.demo.model.Student;
import com.springBootAssessment.demo.services.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;

	@GetMapping()
	public ResponseEntity<List<Student>> fetchAllStudents() {
		return new ResponseEntity<List<Student>>(studentService.getAllStudents(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Student> fetchStudentById(@PathVariable(value = "id") Integer studentId)
			throws StudentNotFoundException {

		return new ResponseEntity<Student>(studentService.getStudentById(studentId), HttpStatus.OK);
	}

	@GetMapping("/allByCollegeId/{id}")
	public ResponseEntity<List<Student>> fetchAllStudentsByCollegeId(@PathVariable(value = "id") Integer collegeId) {
		return new ResponseEntity<List<Student>>(studentService.getAllStudentsByCollegeId(collegeId), HttpStatus.OK);
	}

	@GetMapping("/collegeId/{id}")
	public ResponseEntity<Student> fetchStudentByCollegeId(@PathVariable(value = "id") Integer collegeId)
			throws StudentNotFoundException {
		return new ResponseEntity<Student>(studentService.getStudentByCollegeId(collegeId), HttpStatus.OK);
	}

	@PostMapping()
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		return new ResponseEntity<Student>(studentService.addStudent(student), HttpStatus.CREATED);
	}

	@PutMapping()
	public ResponseEntity<Boolean> updateStudent(@RequestBody Student student) {
		return new ResponseEntity<Boolean>(studentService.updateStudent(student, student.getStudentId()),
				HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteStudent(@PathVariable(value = "id") Integer studentId) {
		return new ResponseEntity<Boolean>(studentService.deleteStudentById(studentId), HttpStatus.OK);
	}

}
