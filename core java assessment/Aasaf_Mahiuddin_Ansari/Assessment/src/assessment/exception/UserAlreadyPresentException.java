package assessment.exception;

public class UserAlreadyPresentException extends Exception {
	String message;

	public UserAlreadyPresentException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserAlreadyPresentException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public UserAlreadyPresentException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public UserAlreadyPresentException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public UserAlreadyPresentException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
