package assessmentspring.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import assessmentspring.entity.Student;
import assessmentspring.exception.StudentNotFoundException;
import assessmentspring.service.CollegeService;
import assessmentspring.service.StudentService;

@RestController
public class StudentController {
	 @Autowired
	 StudentService studentService;
	 
	 @GetMapping("/students")
		public ResponseEntity<List<Student>> getAllStudent() {
			return new ResponseEntity<>(studentService.getAllStudent(), HttpStatus.FOUND);
		}

		@PostMapping("/newstudent")
		public ResponseEntity<Student> addStudent(@RequestBody Student newstudent) {
			return new ResponseEntity<>(studentService.addStudent(newstudent), HttpStatus.CREATED);
		}

		@GetMapping("/{id}")
		public ResponseEntity<Student> getStudentById(@PathVariable(value = "id") Integer studentId)
				throws StudentNotFoundException {
			return new ResponseEntity<>(studentService.getStudentById(studentId), HttpStatus.OK);
		}
	
		@GetMapping("/studentByName")
		public ResponseEntity<Student> getStudentByName(@RequestParam(value = "studentName") String studentName) {
			return new ResponseEntity<Student>(studentService.getStudentByName(studentName), HttpStatus.OK);
	}
		
		
		@DeleteMapping("/deletestudentbyid/{studentId}")
		public void deleteStudentById(@PathVariable Integer studentId) {
			studentService.deleteStudentById(studentId);
		}

		@PutMapping("/update")
		public Student updateStudent(@RequestBody Student newStudent, @PathVariable Integer studentId) 
		{
			return studentService.updateStudent(newStudent, studentId);
		}


}
