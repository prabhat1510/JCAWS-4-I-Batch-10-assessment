package com.collegeinfoapp.service;

import java.util.List;
import com.collegeinfoapp.entities.Student;
import com.collegeinfoapp.exceptions.StudentNotFoundException;

public interface StudentService {


	List<Student> retrieveAllStudentByCollegeId(Iterable<Integer> collegeId);
	
	public Student createStudentDetail(Student student);
	
	public Student retrieveStudentById(Integer studentId)throws StudentNotFoundException;
	
	public void deleteStudentById(Integer studentId);
	
	public Student updateStudentDetails(Student newStudent,Integer studentId);
}
