package com.CollegeManagementSystem.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.CollegeManagementSystem.entity.College;

public interface CollegeRepository extends CrudRepository<College, Integer> {

}
