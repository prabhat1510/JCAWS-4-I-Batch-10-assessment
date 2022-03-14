package springassesment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import springassesment.entity.Student;
import springassesment.exception.StudentNotFoundException;
@Service
public interface StudentService {

		public List<Student> retrieveAllStudent();
		
		public Student addStudent(Student student);
		
		public Student retrieveStudentById(Integer studentId) throws StudentNotFoundException;

		public Student retrieveStudentByName(String studentName);

}
