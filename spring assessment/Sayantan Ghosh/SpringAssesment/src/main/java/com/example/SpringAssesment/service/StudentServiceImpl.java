package com.example.SpringAssesment.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringAssesment.entity.Student;
import com.example.SpringAssesment.repository.StudentRepository;


@Service
@Transactional
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	 StudentRepository repository;

	@Override
	public Student addStudent(Student newStudent) {
		
		return repository.save(newStudent);
	}

	@Override
	public Student getstudentById(Integer studentId) {
		
		return repository.findById(studentId).orElse(null);
	}

}
