package springrestassesment.service;

import java.util.List;

import springrestassesment.entity.Student;
import springrestassesment.exception.StudentNotFoundException;


public interface StudentService {

		public List<Student> retrieveAllStudent();
		
		public Student addStudent(Student student);
		
		public Student retrieveStudentById(Integer studentId) throws StudentNotFoundException;

		public Student retrieveStudentByName(String studentName);

}
