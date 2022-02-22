package main.exceptions;

public class UserNotAddedException extends Exception{
	String message;
	
	public UserNotAddedException(String message) {
		super(message);
	}
}
