package springassesment.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springassesment.entity.Student;
import springassesment.exception.StudentNotFoundException;
import springassesment.repository.StudentRepository;

@Service("StudentService")
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> retrieveAllStudent() {
		return (List<Student>) studentRepository.findAll();
	}

	@Override
	public Student addStudent(Student newStudent) {
		return studentRepository.save(newStudent);
	}

	@Override
	public Student retrieveStudentById(Integer studentId) throws StudentNotFoundException {
		return studentRepository.findById(studentId).orElseThrow(() -> new StudentNotFoundException(studentId));
	}
//
//	@Override
//	public Student retrieveStudentByName(String studentName){
//		return studentRepository.findStudentByName(studentName);
//	}
	
}