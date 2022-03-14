package com.springAssessment.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springAssessment.exception.StudentNotFoundException;
import com.springAssessment.models.Student;
import com.springAssessment.repository.StudentRepository;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepo;

	@Override
	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}

	@Override
	public List<Student> getAllStudentsByCollegeId(Integer collegeId) {
		return studentRepo.findAllStudentsByCollegeId(collegeId);
	}

	@Override
	public Student addStudent(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public Student getStudentById(Integer studentId) throws StudentNotFoundException {
		Optional<Student> stu = studentRepo.findById(studentId);
		if (stu.isEmpty()) {
			throw new StudentNotFoundException(studentId);
		}
		return stu.get();
	}

	@Override
	public Boolean updateStudent(Student newStudent, Integer studentId) {
		if (studentRepo.existsById(newStudent.getStudentId())) {
			Student student = studentRepo.save(newStudent);
			if (student != null) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Boolean deleteStudentById(Integer studentId) {
		studentRepo.deleteById(studentId);
		if (studentRepo.existsById(studentId)) {
			return false;
		}
		return true;
	}

	@Override
	public Student getStudentByName(String studentName) {
		return studentRepo.findStudentByName(studentName);
	}

	@Override
	public Student getStudentByCollegeId(Integer collegeId) throws StudentNotFoundException {
		Student stu = studentRepo.findStudentByCollegeId(collegeId);
		if (stu != null) {
			return stu;
		} else {
			throw new StudentNotFoundException("No Student found with College Id : " + collegeId);
		}
	}

}
