package com.Assessment.service;

import java.util.List;

import com.Assessment.model.Student;

public interface StudentService {
	public List<Student> getAllStudent();
	//Create
	public Student addStudent(Student student);
	//Retrieve
	public Student getStudentById(Integer studentId);
	
	//Delete
	public Boolean deleteStudentById(Integer studentId);
	public Boolean deleteStudent(Student student);
	
	//Update
	public Boolean updateStudent(Student student);
	public Student getStudentByName(String studentName);
}
