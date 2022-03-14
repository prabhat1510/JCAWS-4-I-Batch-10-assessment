package com.collegeinfoapp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collegeinfoapp.entities.Student;
import com.collegeinfoapp.repository.StudentRepository;
import com.collegeinfoapp.exceptions.StudentNotFoundException;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> retrieveAllStudentByCollegeId(Iterable<Integer> collegeId) {
		return (List<Student>) studentRepository.findAllById(collegeId);
				}

	@Override
	public Student createStudentDetail(Student student) {
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
	public Student updateStudentDetails(Student newStudent, Integer studentId) {
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
