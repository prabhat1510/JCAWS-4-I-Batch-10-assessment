package com.springBootAssessment.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.springBootAssessment.demo.exception.CollegeNotFoundException;
import com.springBootAssessment.demo.exception.StudentNotFoundException;

@RestControllerAdvice
public class AppExceptionControllerAdvice {

	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<String> employeeNotFoundHandler(StudentNotFoundException ex) {

		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(CollegeNotFoundException.class)
	public ResponseEntity<String> collegeNotFoundHandler(CollegeNotFoundException ex) {

		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}

}
