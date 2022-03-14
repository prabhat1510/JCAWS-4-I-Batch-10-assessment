package com.example.SpringAssesment.service;

import com.example.SpringAssesment.entity.Student;


public interface StudentService {

	Student addStudent(Student newStudent);
	
	Student getstudentById(Integer studentId); 
}
