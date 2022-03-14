package com.example.spring_restproject.service;

import java.util.List;

import com.example.spring_restproject.entity.Student;
import com.example.spring_restproject.exception.StudentNotFoundException;

public interface StudentService {

	public List<Student> retrieveAllStudent();

	public Student addStudent(Student student);

	public Student retrieveStudentById(Integer studentId) throws StudentNotFoundException;
//
//		public Student retrieveStudentByName(String studentName);

}