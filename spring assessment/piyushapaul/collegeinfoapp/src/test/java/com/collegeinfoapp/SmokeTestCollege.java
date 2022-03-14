package com.collegeinfoapp;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.collegeinfoapp.controller.CollegeController;

@SpringBootTest
public class SmokeTestCollege {
	
	@Autowired
	private CollegeController controllercol;
	
	@Test
	public void contextLoads() throws Exception {
		assertThat(controllercol).isNotNull();
	}

}
