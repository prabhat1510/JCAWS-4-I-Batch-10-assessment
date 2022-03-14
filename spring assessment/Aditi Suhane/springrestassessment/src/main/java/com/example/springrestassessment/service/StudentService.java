package com.example.springrestassessment.service;

import java.util.List;

import com.example.springrestassessment.entity.Student;
import com.example.springrestassessment.exception.StudentNotFoundException;

public interface StudentService {

	public List<Student> retrieveAllStudent();

	public Student addStudent(Student student);

	public Student retrieveStudentById(Integer studentId) throws StudentNotFoundException;
//
//	public Student retrieveStudentByName(String studentName);

}
