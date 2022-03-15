package com.springassesment.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CollegeExceptionAdvice {
	
	@ExceptionHandler
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	String collegeNotFoundException(CollegeNotFoundException cnfe) {
		return cnfe.getMessage();
	}
	
	@ExceptionHandler
	@ResponseStatus(code = HttpStatus.NOT_IMPLEMENTED)
	String collegeNotAddedException(CollegeNotAddedException cnae) {
		return cnae.getMessage();
	}

}
