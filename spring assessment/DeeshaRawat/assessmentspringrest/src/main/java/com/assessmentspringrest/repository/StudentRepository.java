package com.assessmentspringrest.repository;

import org.springframework.data.repository.CrudRepository;

import com.assessmentspringrest.entity.Student;

public interface StudentRepository extends CrudRepository<Student,Integer> {

}
