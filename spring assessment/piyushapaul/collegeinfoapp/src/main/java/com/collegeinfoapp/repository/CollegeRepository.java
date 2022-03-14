package com.collegeinfoapp.repository;
import org.springframework.data.repository.CrudRepository;

import com.collegeinfoapp.entities.College;
public interface CollegeRepository extends CrudRepository<College, Integer> {

}
