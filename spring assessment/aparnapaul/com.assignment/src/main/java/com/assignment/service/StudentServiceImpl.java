package com.assignment.service;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.entity.College;
import com.assignment.entity.Student;
import com.assignment.exception.CollegeNotFoundException;
import com.assignment.exception.StudentNotFoundException;
import com.assignment.repository.StudentRepository;
@Service
@Transactional
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentRepository studentRepository;

	@Override
	public void deleteStudent(Integer studentId) {
		studentRepository.deleteById(studentId);

		
	}

	@Override
	public Student replaceStudent(Student newStudent, Integer studentId) {
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

	@Override
	public Student one(Integer studentId) throws StudentNotFoundException {
		return studentRepository.findById(studentId)
			      .orElseThrow(() -> new StudentNotFoundException(studentId));
	}

	@Override
	public Student newStudent(Student newStudent) {
		return studentRepository.save(newStudent);
	}

	@Override
	public List<Student> all() {
		return (List<Student>) studentRepository.findAll();
	}

	@Override
	public Student getStudentByName(String studentName) {
		return studentRepository.findStudentByName(studentName);
	}

	@Override
	public Student getStudentByCollegeId(Integer collegeId) {
		return studentRepository.findStudentByCollegeId(collegeId);
	}

	
	

}
