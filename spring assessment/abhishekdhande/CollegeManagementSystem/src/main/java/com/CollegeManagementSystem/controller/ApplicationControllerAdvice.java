package com.CollegeManagementSystem.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.CollegeManagementSystem.exeption.CollegeNotFoundException;
import com.CollegeManagementSystem.exeption.StudentNotFoundException;

@RestControllerAdvice
public class ApplicationControllerAdvice {
	
	@ExceptionHandler(StudentNotFoundException.class)
	public String studentNotFoundHandler(StudentNotFoundException ex) {
		return ex.getMessage();
	}
	
	@ExceptionHandler(CollegeNotFoundException.class)
	public String collegeNotFoundHandler(CollegeNotFoundException exe) {
		return exe.getMessage();
	}

}
