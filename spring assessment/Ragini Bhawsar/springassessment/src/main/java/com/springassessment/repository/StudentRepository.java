package com.springassessment.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.springassessment.entity.Student;

public interface StudentRepository extends CrudRepository<Student,Integer> {

}
