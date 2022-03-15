package com.springrestassesment.service;

import java.util.List;

import com.springrestassesment.entity.Student;
import com.springrestassesment.exceptions.StudentNotFoundException;

public interface StudentService {

		public List<Student> retrieveAllStudent();
		
		public Student createStudentDetail(Student student);
		
		public Student retrieveStudentById(Integer studentId) throws StudentNotFoundException;
		
		public void deleteStudentById(Integer id);
		
		public Student updateStudentDetails(Student newStudent,Integer studentId);

		public Student replaceStudent(Student newStudent, Integer id);

}