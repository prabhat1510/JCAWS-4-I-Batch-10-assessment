package com.springrestassessment;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.assessmentspringrest.repository.CollegeRepository;
import com.assessmentspringrest.repository.StudentRepository;
import com.assessmentspringrest.service.CollegeService;
import com.assessmentspringrest.service.StudentService;

@SpringBootTest
class SpringrestassessmentApplicationTests {

	@Test
	void contextLoads() {
	}
	
	private StudentService studentService;
	private CollegeService collegeService;
	private StudentRepository studentRepository;
	private CollegeRepository collegeRepository;
	

}
