package com.springrestassesment.repository;

import org.springframework.data.repository.CrudRepository;

import com.springrestassesment.entity.College;

public interface CollegeRepository extends CrudRepository<College,Integer> {

}