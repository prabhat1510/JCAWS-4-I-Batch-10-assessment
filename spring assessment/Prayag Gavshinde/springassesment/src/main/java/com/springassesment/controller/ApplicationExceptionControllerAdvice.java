package com.springassesment.controller;



import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.springassesment.exceptions.CollageNotFoundException;
import com.springassesment.exceptions.StudentNotFoundException;


@RestControllerAdvice
public class ApplicationExceptionControllerAdvice {

	@ExceptionHandler(StudentNotFoundException.class)
	public String employeeNotFoundHandler(StudentNotFoundException ex) {
		return ex.getMessage();
	}

	@ExceptionHandler(CollageNotFoundException.class)
	public String studentNotFoundHandler(CollageNotFoundException ex) {
		return ex.getMessage();
	}

}

