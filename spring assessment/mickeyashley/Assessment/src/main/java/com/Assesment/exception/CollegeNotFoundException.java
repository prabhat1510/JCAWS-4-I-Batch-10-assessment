package com.Assesment.exception;

public class CollegeNotFoundException extends Exception{
	String message;
	Integer collegeId;
	public CollegeNotFoundException() {
		// TODO Auto-generated constructor stub
	}
	public CollegeNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}
	public CollegeNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}
	public CollegeNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	public CollegeNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	public CollegeNotFoundException(Integer studentId) {
		super("College not found with id ---"+studentId);
		// TODO Auto-generated constructor stub
	}
}
