package exception;

public class StudentNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;
	Integer collegeId;
	public StudentNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}
	public StudentNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}
	public StudentNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	public StudentNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	public StudentNotFoundException(Integer collegeId) {
		super("Could not find student "+collegeId);
	}
}

