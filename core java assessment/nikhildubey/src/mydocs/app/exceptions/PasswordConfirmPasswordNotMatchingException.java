package mydocs.app.exceptions;

public class PasswordConfirmPasswordNotMatchingException extends Exception{
	private String message;

	public PasswordConfirmPasswordNotMatchingException(String message) {
		super();
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}

}
