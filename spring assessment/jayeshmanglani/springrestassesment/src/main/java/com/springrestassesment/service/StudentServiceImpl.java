package com.springrestassesment.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrestassesment.entity.Student;
import com.springrestassesment.exceptions.StudentNotFoundException;
import com.springrestassesment.repository.StudentRepository;

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
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public Student retrieveStudentById(Integer studentId) throws StudentNotFoundException {
		// TODO Auto-generated method stub
		return studentRepository.findById(studentId).orElseThrow(() -> new StudentNotFoundException(studentId));
	}

	@Override
	public void deleteStudentById(Integer id) {
		studentRepository.deleteById(id);	
	}

	@Override
	public Student updateStudentDetails(Student newStudent, Integer studentId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Student replaceStudent(Student newStudent, Integer id) {
		return studentRepository.findById(id)
			      .map(student -> {
			        student.setStudentName(newStudent.getStudentName());
			        return studentRepository.save(student);
			      })
			      .orElseGet(() -> {
			        newStudent.setStudentId(id);
			        return studentRepository.save(newStudent);
			      });
	}
	
}