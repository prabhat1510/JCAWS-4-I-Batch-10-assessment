package com.springassessmentdeve.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springassessmentdeve.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
//	@Query("select s FROM Student s where s.collageId=:collId")
	@Query("FROM Student s where s.collageId=:collId")
	List<Student> getStudentByCollageId(@Param("collId") Integer collId);
}
