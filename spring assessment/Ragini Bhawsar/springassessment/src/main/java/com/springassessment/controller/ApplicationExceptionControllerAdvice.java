package com.springassessment.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.springassessment.exception.CollegeNotFoundException;
import com.springassessment.exception.StudentNotFoundException;

@RestControllerAdvice
public class ApplicationExceptionControllerAdvice {

	@ExceptionHandler(StudentNotFoundException.class)
	public String employeeNotFoundHandler(StudentNotFoundException ex) {
		return ex.getMessage();
	}
	
	@ExceptionHandler(CollegeNotFoundException.class)
	public String studentNotFoundHandler(CollegeNotFoundException ex) {
		return ex.getMessage();
	}
	
}