package com.springassesment.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springassesment.entites.Student;
import com.springassesment.exceptions.StudentNotFoundException;
import com.springassesment.repository.StudentRepository;

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
	public Student createStudentDetail(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student retrieveStudentById(Integer studentId) throws StudentNotFoundException {
		return studentRepository.findById(studentId).orElseThrow(()->new StudentNotFoundException(studentId));
	}

	@Override
	public void deleteStudentById(Integer studentId) {
		studentRepository.deleteById(studentId);
		
	}

	@Override
	public Student updateStudentDetails(Student newStudent, Integer studentId) {
		return studentRepository.findById(studentId)
			      .map(student -> {
			       student.setStudentName(newStudent.getStudentName());
			       student.setCollageId(newStudent.getCollageId());
			       return studentRepository.save(student);
			      })
			      .orElseGet(() -> {
			        newStudent.setStudentId(studentId);
			        return studentRepository.save(newStudent);
			      });
	}

//	@Override
//	public Student getStudentByName(String studentName) {
//		// TODO Auto-generated method stub
//		return studentRepository.findStudentByName(studentName);
//	}

	}

