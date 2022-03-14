package assessmentspring.service;

import java.util.List;

import assessmentspring.entity.Student;
import assessmentspring.exception.StudentNotFoundException;

public interface StudentService {
	        //add
			public Student addStudent(Student newStudent);
			//retrieve
			public List<Student> getAllStudent();
			public List<Student> getStudentByCollegeId(Integer collegeId);
			public Student getStudentById(Integer studentId) throws StudentNotFoundException;
			
			public Student getStudentByName(String studentName);
			
			
			//Delete
			public void deleteStudentById(Integer studentId);
			//update
			Student updateStudent(Student newStudent,Integer studentId);

}
