package com.collegemanagementrestapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.collegemanagementrestapp.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
