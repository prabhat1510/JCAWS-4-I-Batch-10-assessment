package com.CollegeManagementSystem.service;

import java.util.List;
import java.util.Optional;

import com.CollegeManagementSystem.entity.Student;
import com.CollegeManagementSystem.exeption.StudentNotFoundException;

public interface StudentService {

List<Student> retrieveAllStudentByCollegeId(Iterable<Integer> collegeId);
	
	public Student createStudentDetail(Student student);
	
	public Student retrieveStudentById(Integer studentId)throws StudentNotFoundException;
	
	public void deleteStudentById(Integer studentId);
	
	public Student updateStudentDetails(Student newStudent,Integer studentId);
}
