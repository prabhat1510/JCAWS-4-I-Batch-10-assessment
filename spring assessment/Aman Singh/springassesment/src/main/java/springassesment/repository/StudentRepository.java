package springassesment.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import springassesment.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer> {

	@Query("FROM Student s where s.name=:sName")
	Student findStudentByName(@Param("sName") String name);
	

}