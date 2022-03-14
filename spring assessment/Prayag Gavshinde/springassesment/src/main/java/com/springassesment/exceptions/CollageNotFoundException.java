package com.springassesment.exceptions;

public class CollageNotFoundException extends Exception{
	String message;
	Integer collageId;
	public CollageNotFoundException() {
		super();
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
	public CollageNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	public CollageNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	public CollageNotFoundException(Integer collageId) {
		super("Collage Not Found "+collageId);
	
	}
}
