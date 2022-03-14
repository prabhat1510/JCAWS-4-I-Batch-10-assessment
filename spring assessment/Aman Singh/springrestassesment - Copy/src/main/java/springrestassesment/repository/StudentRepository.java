package springrestassesment.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import springrestassesment.entity.Student;

public interface StudentRepository extends CrudRepository<Student,Integer> {

	@Query("FROM student_info s where s.name=:sName")
	Student findStudentByName(@Param("sName") String name);
	

}