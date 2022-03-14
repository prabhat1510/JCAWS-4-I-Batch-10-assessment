package com.springassesment.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springassesment.dao.CollegeRepository;
import com.springassesment.dao.StudentRepository;
import com.springassesment.entities.College;
import com.springassesment.entities.Student;
import com.springassesment.exceptions.CollegeNotFoundException;
import com.springassesment.exceptions.StudentNotAddedException;
import com.springassesment.exceptions.StudentNotFoundException;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	CollegeRepository collegeRepository;

	@Override
	public Student add(Student student) throws StudentNotAddedException {
		Student savedStudent = studentRepository.save(student);
		if(savedStudent==null) throw new StudentNotAddedException("Could not add student");
		return savedStudent;
	}

	@Override
	public Student getStudent(Integer id) throws StudentNotFoundException {
		Optional<Student> result = studentRepository.findById(id);
		if(!result.isPresent()) throw new StudentNotFoundException("Student Not Found");
		return result.get();
	}

	@Override
	public List<Student> getAllStudents() throws StudentNotFoundException {
		List<Student> studentList = (List<Student>) studentRepository.findAll();
		if(studentList.isEmpty()) throw new StudentNotFoundException("No Students Found");
		return studentList;
	}

	@Override
	public Student updateStudent(Student student, Integer id) throws StudentNotFoundException {
		Optional<Student> result = studentRepository.findById(id);
		if(!result.isPresent()) throw new StudentNotFoundException("Student Not Found");
		else {
			Student updatedStudent = studentRepository.save(student);
			return updatedStudent;
		}

	}

	@Override
	public String deleteStudent(Integer id) throws StudentNotFoundException {
		Optional<Student> result = studentRepository.findById(id);
		if(!result.isPresent()) throw new StudentNotFoundException("Student Not Found");
		else {
			studentRepository.deleteById(id);
			return "Student Deleted Successfully";
		}
	}

	@Override
	public Student customSearch(String name, Integer collegeId) throws CollegeNotFoundException, StudentNotFoundException {
		Optional<College> college = collegeRepository.findById(collegeId);
		if(!college.isPresent()) throw new CollegeNotFoundException();
		else {
			Student student = studentRepository.customSearch(name, college.get());
			if(student==null) throw new StudentNotFoundException("Student Not Found");
			return student;
		}
	}

}
