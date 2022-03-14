package com.assessmentSpring.services;

import java.util.List;

import com.springAssessment.exception.StudentNotFoundException;
import com.springAssessment.models.Student;

public interface StudentService {

	public List<Student> getAllStudents();

	// . return List of Students in the given collegeId
	public List<Student> getAllStudentsByCollegeId(Integer collegeId);

	// CRUD
	public Student addStudent(Student student);

	public Student getStudentById(Integer studentId) throws StudentNotFoundException;

	public Boolean updateStudent(Student newStudent, Integer studentId);

	public Boolean deleteStudentById(Integer studentId);

	// user should be able to search student by Name and by college Id separately
	public Student getStudentByName(String studentName);

	public Student getStudentByCollegeId(Integer collegeId) throws StudentNotFoundException;

}
