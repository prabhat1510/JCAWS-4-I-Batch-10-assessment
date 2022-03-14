package com.springassesment.service;

import java.util.List;

import com.springassesment.entities.Student;
import com.springassesment.exceptions.CollegeNotFoundException;
import com.springassesment.exceptions.StudentNotAddedException;
import com.springassesment.exceptions.StudentNotFoundException;

public interface StudentService {
	
	public Student add(Student student) throws StudentNotAddedException;
	
	public Student getStudent(Integer id) throws StudentNotFoundException;
	
	public List<Student> getAllStudents() throws StudentNotFoundException;
	
	public Student updateStudent(Student student,Integer id) throws StudentNotFoundException;
	
	public String deleteStudent(Integer id) throws StudentNotFoundException;
	
	public Student customSearch(String name,Integer collegeId) throws CollegeNotFoundException, StudentNotFoundException;
	
}
