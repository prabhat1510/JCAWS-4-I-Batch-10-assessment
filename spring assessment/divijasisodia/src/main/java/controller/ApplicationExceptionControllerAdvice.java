package controller;
import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.RestControllerAdvice;

import exception.StudentNotFoundException;


@RestControllerAdvice
public class ApplicationExceptionControllerAdvice {

	@ExceptionHandler(StudentNotFoundException.class)
	public String employeeNotFoundHandler(StudentNotFoundException ex) {
		return ex.getMessage();
	}
}