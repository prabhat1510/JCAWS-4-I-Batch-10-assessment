package assessmentspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



import assessmentspring.entity.College;

public interface CollegeRepository extends JpaRepository<College,Integer> {
	
	@Query("FROM College c where c.collegeName=:collegeName")
	College getByCollegeName(@Param("collegeName") String collegeName);
	
	@Query("FROM College c where c.address=:address")
	College getByCollegeAddress(@Param("address") String address);
	

}
