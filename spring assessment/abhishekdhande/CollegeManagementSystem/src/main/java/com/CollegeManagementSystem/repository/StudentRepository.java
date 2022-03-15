package com.CollegeManagementSystem.repository;

import org.springframework.data.repository.CrudRepository;

import com.CollegeManagementSystem.entity.StudentEntity;

public interface StudentRepository extends CrudRepository<StudentEntity, Integer> {

}
