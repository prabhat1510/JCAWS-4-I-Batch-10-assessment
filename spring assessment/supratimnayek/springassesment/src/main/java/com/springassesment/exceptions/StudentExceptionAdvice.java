package com.springassesment.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class StudentExceptionAdvice {

	@ExceptionHandler
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	String studentNotFoundException(StudentNotFoundException snfe) {
		return snfe.getMessage();
	}
	
	@ExceptionHandler
	@ResponseStatus(code = HttpStatus.NOT_IMPLEMENTED)
	String studentNotAddedException(StudentNotAddedException snae) {
		return snae.getMessage();
	}

}
