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

import com.springassesment.entities.College;
import com.springassesment.entities.Student;
import com.springassesment.exceptions.CollegeNotFoundException;
import com.springassesment.exceptions.StudentNotAddedException;
import com.springassesment.exceptions.StudentNotFoundException;
import com.springassesment.service.CollegeService;
import com.springassesment.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@Autowired
	CollegeService collegeService;
	
	@PostMapping("/add/{collegeId}")
	public ResponseEntity<Student> add(@RequestBody Student student,@PathVariable Integer collegeId) throws StudentNotAddedException, CollegeNotFoundException {
		College college = collegeService.getCollege(collegeId);
		student.setCollege(college);
		return new ResponseEntity<>(studentService.add(student),HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Student>> all() throws StudentNotFoundException{
		return new ResponseEntity<>(studentService.getAllStudents(),HttpStatus.FOUND);
	}
	
	@GetMapping("")
	public ResponseEntity<Student> findById(@RequestParam("id") Integer id) throws StudentNotFoundException{
		return new ResponseEntity<>(studentService.getStudent(id),HttpStatus.FOUND);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Student> updateStudent(@RequestParam("id") Integer collegeId,@RequestBody Student student) throws StudentNotFoundException, CollegeNotFoundException, StudentNotAddedException {
		Student resultStudent = studentService.getStudent(student.getStudentId());
		if(resultStudent.getCollege().getCollegeId()!=collegeId) {
			College resultCollege = collegeService.getCollege(collegeId);
			resultStudent.setCollege(resultCollege);
		}
		resultStudent.setStudentName(student.getStudentName());
		return new ResponseEntity<>(studentService.add(resultStudent),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteStudent(@RequestParam("id") Integer studentId) throws StudentNotFoundException {
		return new ResponseEntity<>(studentService.deleteStudent(studentId),HttpStatus.OK);
	}
	
	@GetMapping("/byName")
	public ResponseEntity<Student> getStudentyByNameAndCollege(@RequestParam("name") String studentName,@RequestParam("id") Integer collegeId) throws CollegeNotFoundException, StudentNotFoundException {
		return new ResponseEntity<Student>(studentService.customSearch(studentName, collegeId),HttpStatus.FOUND);
	}
	
}
