package com.example.SpringAssesment.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.SpringAssesment.entity.College;
import com.example.SpringAssesment.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
