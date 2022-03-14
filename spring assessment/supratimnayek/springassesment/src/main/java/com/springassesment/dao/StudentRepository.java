package com.springassesment.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.springassesment.entities.College;
import com.springassesment.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {
	
	@Query("select s from Student s where s.studentName=:studentName and s.college=:college")
	public Student customSearch(@Param("studentName") String studentName,@Param("college") College college);

}
