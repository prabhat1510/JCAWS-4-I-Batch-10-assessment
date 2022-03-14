package com.assessmentspringrest.repository;

import org.springframework.data.repository.CrudRepository;

import com.assessmentspringrest.entity.College;

public interface CollegeRepository  extends CrudRepository<College,Integer> {

}