package assessment.exception;

public class UserNotAddedException extends Exception {
	String message;

	public UserNotAddedException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserNotAddedException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public UserNotAddedException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public UserNotAddedException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public UserNotAddedException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	

}
