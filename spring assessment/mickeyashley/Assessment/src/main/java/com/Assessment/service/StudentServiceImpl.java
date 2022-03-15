package com.Assessment.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Assessment.dao.StudentRepository;
import com.Assessment.model.Student;


	@Service
	@Transactional
	public class StudentServiceImpl implements StudentService{
		@Autowired
		StudentRepository studentRepository;

		@Override
		public List<Student> getAllStudent() {
			return (List<Student>) studentRepository.findAll();
		}

		@Override
		public Student addStudent(Student student) {
			
			return studentRepository.save(student);
		}

		@Override
		public Student getStudentById(Integer studentId) {
			Optional<Student> student = studentRepository.findById(studentId);
			if(student.isPresent()) {
				return student.get();
			}
			return null;
		}

		@Override
		public Boolean deleteStudentById(Integer studentId) {
			studentRepository.deleteById(studentId);
			if(studentRepository.existsById(studentId)) {
				return false;
			}
			return true;
		}

		@Override
		public Boolean deleteStudent(Student student) {
			studentRepository.delete(student);
			if(studentRepository.existsById(student.getStudentId())) {
				return false;
			}
			return true;
		}

		@Override
		public Boolean updateStudent(Student student) {
			
			if(studentRepository.existsById(student.getStudentId())) {
				Student student1 = studentRepository.save(student);
					if(student1!=null) {
						return true;
					}
			}
			return false;
		}

		@Override
		public Student getStudentByName(String studentName) {
			
			return studentRepository.findStudentByName(studentName);
		}
}
