package com.springassessmentdeve.exception;

public class CollageNotFoundException extends Exception {
	String message;
	Integer collageId;
	public CollageNotFoundException() {
		// TODO Auto-generated constructor stub
	}
	public CollageNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}
	public CollageNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}
	public CollageNotFoundException(Integer collageId) {
		super("Collage with Id "+collageId+" not found");
		// TODO Auto-generated constructor stub
	}
	public CollageNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
