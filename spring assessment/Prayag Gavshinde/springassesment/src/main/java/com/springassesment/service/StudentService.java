package com.springassesment.service;

import java.util.List;

import com.springassesment.entites.Student;
import com.springassesment.exceptions.StudentNotFoundException;

public interface StudentService {

	public List<Student> retrieveAllStudent();
	
	public Student createStudentDetail(Student student);
	
	public Student retrieveStudentById(Integer studentId) throws StudentNotFoundException;
	
	public void deleteStudentById(Integer studentId);
	
	public Student updateStudentDetails(Student newStudent,Integer studentId);
//	
//	public Student getStudentByName(String studentName);
}
