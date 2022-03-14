package com.collegeinfoapp.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.collegeinfoapp.exceptions.CollegeNotFoundException;
import com.collegeinfoapp.exceptions.StudentNotFoundException;

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
