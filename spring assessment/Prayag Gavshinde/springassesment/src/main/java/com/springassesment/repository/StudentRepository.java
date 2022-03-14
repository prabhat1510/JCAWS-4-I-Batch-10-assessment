package com.springassesment.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springassesment.entites.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student , Integer>{
//	@Query("FROM student s where s.student_name=:sName")
//	Student findStudentByName(@Param("sName") String studentName);
}
