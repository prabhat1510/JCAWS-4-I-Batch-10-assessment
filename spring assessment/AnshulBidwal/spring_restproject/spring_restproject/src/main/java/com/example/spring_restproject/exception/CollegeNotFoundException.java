package com.example.spring_restproject.exception;

public class CollegeNotFoundException extends Exception {
	String message;
	Integer collegeId;

	public CollegeNotFoundException() {
	}

	public CollegeNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CollegeNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public CollegeNotFoundException(String message) {
		super(message);
	}

	public CollegeNotFoundException(Throwable cause) {
		super(cause);
	}

	public CollegeNotFoundException(Integer collegeId) {
		super("College not found with id ---" + collegeId);
	}

//	public StudentNotFoundException(String studentName) {
//		super("Student not found with name ---"+studentName);
//	}
}
