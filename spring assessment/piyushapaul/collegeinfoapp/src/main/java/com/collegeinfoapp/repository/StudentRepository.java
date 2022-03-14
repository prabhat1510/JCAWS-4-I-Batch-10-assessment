package com.collegeinfoapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.collegeinfoapp.entities.Student;

public interface StudentRepository extends CrudRepository<Student,Integer> {

}
