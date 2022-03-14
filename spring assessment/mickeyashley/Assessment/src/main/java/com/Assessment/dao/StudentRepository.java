package com.Assessment.dao;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.Assessment.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	// @Query("FROM Student e where e.studentName=:eName")
	Student findStudentByName( String studentName);
	
	@Modifying
	@Query("update Student e set e.studentName=:studentName where e.studentId=:studentId")
	Integer updateStudent(@Param("studentId") Integer collegeId,@Param("studentName") String studentName);
}
