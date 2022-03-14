package com.collegemanagementrestapp.exception;

public class CollegeNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;
	Integer collegeId;

	public CollegeNotFoundException() {
		super();
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
	public CollegeNotFoundException(Integer collegeId) {
		super("College not Found with Id : - "+collegeId);
		// TODO Auto-generated constructor stub
	}
}
