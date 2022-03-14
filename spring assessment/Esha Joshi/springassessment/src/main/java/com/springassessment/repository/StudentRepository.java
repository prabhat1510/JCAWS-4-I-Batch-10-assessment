package com.springassessment.repository;

import org.springframework.data.repository.CrudRepository;

import com.springassessment.entity.Student;


public interface StudentRepository extends CrudRepository<Student,Integer> {

}