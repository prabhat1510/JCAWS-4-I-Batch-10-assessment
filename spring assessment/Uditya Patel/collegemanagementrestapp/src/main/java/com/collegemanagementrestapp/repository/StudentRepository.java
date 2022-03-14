package com.collegemanagementrestapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.collegemanagementrestapp.model.College;
import com.collegemanagementrestapp.model.Student;


public interface StudentRepository extends CrudRepository<Student, Integer> {

//	@Query("FROM Student s inner join s.collegeId     where s.college_id=:collegeId")
//	List<Student> findStudentByCollegeId(@Param("collegeId") Integer collegeId);
	
//	select u.userName from User u inner join u.area ar where ar.idArea = :idArea"
	
}
