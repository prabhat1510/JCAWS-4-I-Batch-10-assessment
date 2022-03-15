package com.assignment.service;

import java.util.List;

import com.assignment.entity.Student;
import com.assignment.exception.StudentNotFoundException;

public interface StudentService {
	
	void deleteStudent(Integer studentId);

	Student replaceStudent(Student newStudent, Integer studentId);

	Student one(Integer studentId) throws StudentNotFoundException;

	Student newStudent(Student newStudent);

	List<Student> all();

		
		//retrieve by student name
		public Student getStudentByName(String studentName);
		
		//retrieve by college id
		public Student getStudentByCollegeId(Integer collegeId);

}
