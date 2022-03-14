package com.springassessmentdeve.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springassessmentdeve.entity.Student;
import com.springassessmentdeve.exception.StudentNotFoundException;
import com.springassessmentdeve.repository.StudentRepository;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudentByCollageId(Integer collageId) {
		List<Student> listofStudent = studentRepository.getStudentByCollageId(collageId);
		return listofStudent;
	}

	@Override
	public Student getStudentById(Integer studentId) throws StudentNotFoundException {
		return studentRepository.findById(studentId).orElseThrow(()-> new StudentNotFoundException(studentId));
	}

	@Override
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}

}
