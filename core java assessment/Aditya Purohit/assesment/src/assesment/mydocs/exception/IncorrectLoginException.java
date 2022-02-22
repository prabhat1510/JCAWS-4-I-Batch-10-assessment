package assesment.mydocs.exception;

public class IncorrectLoginException extends Exception {

	String message;

	public IncorrectLoginException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IncorrectLoginException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public IncorrectLoginException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public IncorrectLoginException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public IncorrectLoginException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	
}
