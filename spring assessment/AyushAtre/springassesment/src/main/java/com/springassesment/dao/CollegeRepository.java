package com.springassesment.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.springassesment.entities.College;

public interface CollegeRepository extends CrudRepository<College, Integer> {
	
	@Query("select c from College_entity c where c.collegeName=:collegeName and c.address=:address")
	public College customSearch(@Param("collegeName") String collegeName,
								@Param("address") String address);

}
