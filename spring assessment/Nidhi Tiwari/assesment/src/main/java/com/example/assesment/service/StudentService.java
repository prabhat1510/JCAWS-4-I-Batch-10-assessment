package com.example.assesment.service;

import java.util.List;

import com.example.assesment.entity.Student;
import com.example.assesment.exception.StudentNotFoundException;


public interface StudentService {

		public List<Student> retrieveAllStudent();
		
		public Student addStudent(Student student);
		
		public Student retrieveStudentById(Integer studentId) throws StudentNotFoundException;
//
//		public Student retrieveStudentByName(String studentName);

}