package com.assignment.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.assignment.entity.Student;

public interface StudentRepository extends CrudRepository<Student,Integer> {

	@Query("FROM Student s where s.studentName=:sName")
	Student findStudentByName(@Param("sName") String studentName);
	
	@Query("FROM Student s where s.collegeId=:sCollegeId")
	Student findStudentByCollegeId(@Param("sCollegeId") Integer collegeId);
	
	
	@Modifying
	@Query("update Student s set s.studentName=:studentName, s.collegeId=:collegeId where s.studentId=:studentId")
	Integer updateStudent(@Param("studentId") Integer studentId,@Param("studentName") String studentName, @Param("collegeId") String collegeId);
	

}