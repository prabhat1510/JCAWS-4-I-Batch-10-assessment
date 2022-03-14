package com.collegemanagementrestapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collegemanagementrestapp.exception.StudentNotFoundException;
import com.collegemanagementrestapp.model.College;
import com.collegemanagementrestapp.model.Student;
import com.collegemanagementrestapp.repository.CollegeRepository;
import com.collegemanagementrestapp.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentrepo;
	@Autowired
	CollegeRepository collegerepo;

	@Override
	public Student addStudent(Student student) {

		return studentrepo.save(student);
	}
	
	@Override
	public List<Student> getAllStudent() {
		return (List<Student>) studentrepo.findAll();
	}


	@Override
	public Student getStudentById(Integer studentId) throws StudentNotFoundException {
		Optional<Student> student = studentrepo.findById(studentId);
		if(student.isPresent())
		{
			return student.get();
		}
		else
		{
			throw new StudentNotFoundException(studentId);
			//return null;
		}
	
	}

	
	@Override
	public Student updateStudent(Integer studentId ,Student student) {
		
			Student ustudent = studentrepo.findById(studentId).get();
			ustudent.setStudentName(student.getStudentName());
			ustudent.setCollege(student.getCollege());
			return studentrepo.save(ustudent);
		
	}

	@Override
	public String deleteStudent(Integer studentId) {
	
		studentrepo.deleteById(studentId);
		return "Student Deleted";
	
	}

	@Override
	public List<Student> getStudentByCollegeId(Integer collegeId) {
		
		return collegerepo.findStudentByCollegeId(collegeId);
	}
	
}
