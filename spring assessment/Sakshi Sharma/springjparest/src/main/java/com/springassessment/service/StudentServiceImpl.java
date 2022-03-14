package com.springassessment.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.springassessment.entity.Student;
import com.springassessment.exception.StudentNotFoundException;
import com.springassessment.repository.StudentRepository;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> retrieveAllStudent() {
		return (List<Student>) studentRepository.findAll();
	}

	@Override
	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student retrieveStudentById(Integer studentId) throws StudentNotFoundException{
		return studentRepository.findById(studentId).orElseThrow(() -> new StudentNotFoundException(studentId));
	}

	@Override
	public void deleteStudentById(Integer studentId) {
		studentRepository.deleteById(studentId);
		
	}

	@Override
	public Student updateStudent(Student newStudent, Integer studentId) {
		return studentRepository.findById(studentId)
			      .map(student -> {
			       student.setStudentName(newStudent.getStudentName());
			       student.setCollegeId(newStudent.getCollegeId());
			       return studentRepository.save(student);
			      })
			      .orElseGet(() -> {
			        newStudent.setStudentId(studentId);
			        return studentRepository.save(newStudent);
			      });
	}
}
