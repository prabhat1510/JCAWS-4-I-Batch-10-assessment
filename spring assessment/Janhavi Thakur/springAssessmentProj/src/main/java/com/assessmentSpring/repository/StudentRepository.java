package com.assessmentSpring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springAssessment.models.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	@Query("SELECT s FROM Student s where s.collegeId=:cId")
	List<Student> findAllStudentsByCollegeId(@Param("cId") Integer collegeId);

	@Query("FROM Student s where s.studentName=:sName")
	Student findStudentByName(@Param("sName") String studentName);

	@Query("FROM Student s where s.collegeId=:cId")
	Student findStudentByCollegeId(@Param("cId") Integer collegeId);

}
