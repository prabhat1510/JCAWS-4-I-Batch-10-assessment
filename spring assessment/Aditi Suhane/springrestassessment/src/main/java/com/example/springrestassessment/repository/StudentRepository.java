package com.example.springrestassessment.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.springrestassessment.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

	@Query("FROM Student s where s.name=:sName")
	Student findStudentByName(@Param("sName") String name);

//	
//	
//	@Query("FROM College c where c.collegeName=:collegeName")
//	College getByCollegeName(@Param("collegeName") String collegeName);
//	
//	@Query("FROM College c where c.address=:address")
//	College getByCollegeAddress(@Param("address") String address);
}