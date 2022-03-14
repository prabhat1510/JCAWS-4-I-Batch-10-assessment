package com.collegemanagementrestapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionAdvice {
	
	@ExceptionHandler(StudentNotFoundException.class)
	  @ResponseStatus(HttpStatus.NOT_FOUND)
	  String studentNotFound(StudentNotFoundException ex) {
	    return    ex.getMessage();
	  }

	@ExceptionHandler(CollegeNotFoundException.class)
	  @ResponseStatus(HttpStatus.NOT_FOUND)
	  String collegeNotFound(CollegeNotFoundException ex) {
	    return ex.getMessage();
	  }

	
}
