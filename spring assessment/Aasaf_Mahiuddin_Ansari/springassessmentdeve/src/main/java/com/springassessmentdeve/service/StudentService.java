package com.springassessmentdeve.service;

import java.util.List;

import com.springassessmentdeve.entity.Student;
import com.springassessmentdeve.exception.StudentNotFoundException;

public interface StudentService {
	public List<Student> getAllStudentByCollageId(Integer collageId);
	public Student getStudentById(Integer studentId) throws StudentNotFoundException ;
	public Student addStudent(Student student);
}
