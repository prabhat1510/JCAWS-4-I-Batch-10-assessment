package com.spring_assessment.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.spring_assessment.exception.StudentNotFoundException;
@Service
public interface StudentService {

		public List<Student> retrieveAllStudent();
		
		public Student addStudent(Student student);
		
		public Student retrieveStudentById(Integer studentId) throws StudentNotFoundException;


}