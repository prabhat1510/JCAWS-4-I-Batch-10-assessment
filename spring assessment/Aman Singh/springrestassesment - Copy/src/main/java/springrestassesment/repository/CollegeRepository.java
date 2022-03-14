package springrestassesment.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import springrestassesment.entity.College;

public interface CollegeRepository extends CrudRepository<College ,Integer> {

//	@Query("FROM College s where s.name=:sName")
//	College findCollegeByName(@Param("sName") String studentName);
//	
//	
//	@Query("FROM College a where a.address=:aAddress")
//	College findCollegeByAddress(@Param("aAddress") String address);
//	

}
