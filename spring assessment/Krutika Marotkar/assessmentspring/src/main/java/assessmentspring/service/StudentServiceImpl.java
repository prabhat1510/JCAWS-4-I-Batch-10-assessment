package assessmentspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import assessmentspring.entity.College;
import assessmentspring.entity.Student;
import assessmentspring.exception.StudentNotFoundException;
import assessmentspring.repository.StudentRepository;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student addStudent(Student newStudent) {
		// TODO Auto-generated method stub
		return studentRepository.save(newStudent);
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	

	@Override
	public void deleteStudentById(Integer studentId) {
		// TODO Auto-generated method stub
		 studentRepository.deleteById(studentId);
	}

	@Override
	public Student updateStudent(Student newStudent, Integer studentId) {
		// TODO Auto-generated method stub
		 return studentRepository.findById(studentId).map
				 (student -> {student.setStudentName(newStudent.getStudentName());
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
	public List<Student> getStudentByCollegeId(Integer collegeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentById(Integer studentId) throws StudentNotFoundException{
		// TODO Auto-generated method stub
		return studentRepository.getById(studentId); //.orElseThrow(()-> new StudentNotFoundException(studentId));
	}

	@Override
	public Student getStudentByName(String studentName) {
		// TODO Auto-generated method stub
		return studentRepository.getStudentByName(studentName);
	}
}
