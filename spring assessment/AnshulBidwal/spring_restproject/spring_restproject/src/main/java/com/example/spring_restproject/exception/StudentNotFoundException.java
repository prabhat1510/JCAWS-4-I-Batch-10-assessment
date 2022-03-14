package com.example.spring_restproject.exception;

public class StudentNotFoundException extends Exception {
	String message;
	Integer studentId;

	public StudentNotFoundException() {
	}

	public StudentNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public StudentNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public StudentNotFoundException(String message) {
		super(message);
	}

	public StudentNotFoundException(Throwable cause) {
		super(cause);
	}

	public StudentNotFoundException(Integer studentId) {
		super("Student not found with id ---" + studentId);
	}

//	public StudentNotFoundException(String studentName) {
//		super("Student not found with name ---"+studentName);
//	}
}
