package com.springrestassesment.repository;

import org.springframework.data.repository.CrudRepository;

import com.springrestassesment.entity.Student;

public interface StudentRepository extends CrudRepository<Student,Integer> {

}