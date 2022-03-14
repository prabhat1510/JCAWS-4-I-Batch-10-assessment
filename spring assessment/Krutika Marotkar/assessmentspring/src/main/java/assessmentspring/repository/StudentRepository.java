package assessmentspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import assessmentspring.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

	@Query("FROM Student s where s.studentName=:studentName")
	Student getStudentByName(@Param("studentName") String studentName);
	
	/*@Query("FROM  c where c.address=:address")
	College getByCollegeAddress(@Param("address") String address);*/
}
