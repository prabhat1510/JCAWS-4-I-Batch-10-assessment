package com.springBootAssessment.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springBootAssessment.demo.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	@Query("SELECT s FROM Student s where s.collegeId=:collegeId")
	List<Student> findAllStudentsByCollegeId(@Param("collegeId") Integer collegeId);

	@Query("FROM Student s where s.studentName=:studentName")
	Student findStudentByName(@Param("studentName") String studentName);

	@Query("FROM Student s where s.collegeId=:collegeId")
	Student findStudentByCollegeId(@Param("collegeId") Integer collegeId);

}
