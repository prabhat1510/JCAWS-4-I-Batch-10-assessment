package com.assessmentspringrest.service;

import java.util.List;

import com.assessmentspringrest.entity.Student;
import com.assessmentspringrest.exceptions.StudentNotFoundException;

public interface StudentService {

		public List<Student> retrieveAllStudent();
		
		public Student createStudentDetail(Student student);
		
		public Student retrieveStudentById(Integer studentId) throws StudentNotFoundException;
		
		public Student updateStudentDetails(Student newStudent,Integer studentId);

		Student replaceStudent(Student newStudent, Integer id);
		
		public void deleteStudentById(Integer id);
}