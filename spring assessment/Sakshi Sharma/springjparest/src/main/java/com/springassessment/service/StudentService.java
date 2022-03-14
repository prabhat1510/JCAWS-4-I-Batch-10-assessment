package com.springassessment.service;

import java.util.List;

import com.springassessment.entity.Student;
import com.springassessment.exception.StudentNotFoundException;


public interface StudentService {
	
    public List<Student> retrieveAllStudent();
	
	public Student createStudent(Student student);
	
	public Student retrieveStudentById(Integer studentId)throws StudentNotFoundException;
	
	public void deleteStudentById(Integer studentId);
	
	public Student updateStudent(Student newStudent,Integer studentId);

}
