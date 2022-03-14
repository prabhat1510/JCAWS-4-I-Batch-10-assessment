package com.spring_assessment.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_assessment.entity.Student;
import com.spring_assessment.exception.StudentNotFoundException;
import com.spring_assessment.repository.StudentRepository;

 @Service("StudentService")
 @Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> retrieveAllStudent() {
		return (List<Student>) studentRepository.findAll();
	}

	@Override
	public Student addStudent(Student newStudent) {
		return studentRepository.save(newStudent);
	}

	@Override
	public Student retrieveStudentById(Integer studentId) throws StudentNotFoundException {
		return studentRepository.findById(studentId).orElseThrow(() -> new StudentNotFoundException(studentId));
	}
}