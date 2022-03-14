package com.assessmentSpring.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.springAssessment.exception.CollegeNotFoundException;
import com.springAssessment.exception.StudentNotFoundException;

@RestControllerAdvice
public class AppExceptionControllerAdvice {

	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<Map<String, Object>> employeeNotFoundHandler(StudentNotFoundException ex) {

		Map<String, Object> errObj = new HashMap<String, Object>();
		errObj.put("status", false);
		errObj.put("message", ex.getMessage());

		return new ResponseEntity<Map<String, Object>>(errObj, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(CollegeNotFoundException.class)
	public ResponseEntity<Map<String, Object>> collegeNotFoundHandler(CollegeNotFoundException ex) {

		Map<String, Object> errObj = new HashMap<String, Object>();
		errObj.put("status", false);
		errObj.put("message", ex.getMessage());

		return new ResponseEntity<Map<String, Object>>(errObj, HttpStatus.NOT_FOUND);
	}

}
