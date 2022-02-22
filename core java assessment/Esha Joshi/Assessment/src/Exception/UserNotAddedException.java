package Exception;

public class UserNotAddedException extends Exception{
	String message;
	
	public UserNotAddedException(String message) {
		super(message);
	}
}