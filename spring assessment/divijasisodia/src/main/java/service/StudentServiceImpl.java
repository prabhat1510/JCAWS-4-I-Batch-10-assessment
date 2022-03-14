package service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Student;
import exception.StudentNotFoundException;
import repository.StudentRepository;
@Service
public abstract class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> retrieveAllStudent() {
		
		return (List<Student>) studentRepository.findAll();
	}

	@Override
	public Student createStudentDetail(Student newStudent) {
		// TODO Auto-generated method stub
		return studentRepository.save(newStudent);
	}

	@Override
	public Student retrieveStudentById(Integer studentId) throws StudentNotFoundException {
		// TODO Auto-generated method stub
		return studentRepository.findById(studentId).orElseThrow(() -> new StudentNotFoundException(studentId));
	}

	@Override
	public void deleteStudentById(Integer studentId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student updateStudentDetails(Student newStudent, Integer studentId) {
		// TODO Auto-generated method stub
		return null;
	}

}
