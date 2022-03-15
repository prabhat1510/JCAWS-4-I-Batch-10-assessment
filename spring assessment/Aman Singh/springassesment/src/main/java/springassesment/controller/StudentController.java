package springassesment.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import springassesment.entity.Student;
import springassesment.exception.StudentNotFoundException;
import springassesment.service.StudentService;

// http://localhost:8080/student/students
@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService studentService;

	@GetMapping("/students")
	public ResponseEntity<List<Student>> retrieveAllStudent() {
		return new ResponseEntity<>(studentService.retrieveAllStudent(), HttpStatus.FOUND);
	}

	@PostMapping("/newstudent")
	public ResponseEntity<Student> addNewStudent(@RequestBody Student newstudent) {
		return new ResponseEntity<>(studentService.addStudent(newstudent), HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Student> retrieveStudentById(@PathVariable(value = "id") Integer studentId)
			throws StudentNotFoundException {
		return new ResponseEntity<>(studentService.retrieveStudentById(studentId), HttpStatus.OK);
	}

//	@GetMapping("/studentByName")
//	public ResponseEntity<Student> getStudentByName(@RequestParam(value = "sName") String studentName) {
//		return new ResponseEntity<Student>(studentService.retrieveStudentByName(studentName), HttpStatus.OK);
//	}


}