package com.springassessmentdeve.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.springassessmentdeve.exception.CollageNotFoundException;
import com.springassessmentdeve.exception.StudentNotFoundException;

@RestControllerAdvice
public class ApplicationExceptionControllerAdvice {
	@ExceptionHandler(StudentNotFoundException.class)
	public String StudentNotFoundHandler(StudentNotFoundException studex) {
		return studex.getMessage();
	}
	
	@ExceptionHandler(CollageNotFoundException.class)
	public String CollageNotFoundHandler(CollageNotFoundException collex) {
		return collex.getMessage();
	}
}
