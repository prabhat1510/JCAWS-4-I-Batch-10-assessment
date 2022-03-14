package repository;

import org.springframework.data.repository.CrudRepository;

import entity.Student;

public interface StudentRepository extends CrudRepository<Student,Integer> {

}
