package com.springBootAssessment.demo.services;

import java.util.List;

import com.springBootAssessment.demo.exception.StudentNotFoundException;
import com.springBootAssessment.demo.model.Student;

public interface StudentService {

	public List<Student> getAllStudents();

	public List<Student> getAllStudentsByCollegeId(Integer collegeId);

	public Student addStudent(Student student);

	public Student getStudentById(Integer studentId) throws StudentNotFoundException;

	public Boolean updateStudent(Student newStudent, Integer studentId);

	public Boolean deleteStudentById(Integer studentId);

	public Student getStudentByName(String studentName);

	public Student getStudentByCollegeId(Integer collegeId) throws StudentNotFoundException;

}
