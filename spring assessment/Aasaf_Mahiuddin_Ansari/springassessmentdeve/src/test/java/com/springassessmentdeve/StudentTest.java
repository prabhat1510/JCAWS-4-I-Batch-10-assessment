package com.springassessmentdeve;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springassessmentdeve.controller.StudentController;

@SpringBootTest
class StudentTest {

	@Autowired
	StudentController studentController;
	
	@Test
	public void testforNotNullInStudentData() {
		assertThat(studentController).isNotNull();
	}

}
