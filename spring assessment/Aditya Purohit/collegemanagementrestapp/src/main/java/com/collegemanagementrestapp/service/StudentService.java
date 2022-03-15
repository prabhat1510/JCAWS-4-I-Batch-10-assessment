package com.collegemanagementrestapp.service;

import java.util.List;

import com.collegemanagementrestapp.exception.StudentNotFoundException;
import com.collegemanagementrestapp.model.College;
import com.collegemanagementrestapp.model.Student;

public interface StudentService {
	
	//create
	public Student addStudent(Student student);

	//retrive
	public Student getStudentById(Integer studentId) throws StudentNotFoundException;
	
	//delete
	public String deleteStudent(Integer StudentId);
	
	//update
	public Student updateStudent(Integer studentId,Student student);

	public List<Student> getAllStudent();

	public List<Student> getStudentByCollegeId(Integer collegeId );
	
}
