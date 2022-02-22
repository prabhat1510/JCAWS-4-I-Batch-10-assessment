package mydocs.app.exceptions;

public class UserNotFoundException extends Exception {
	
private String message;
	
	public UserNotFoundException(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}


}
