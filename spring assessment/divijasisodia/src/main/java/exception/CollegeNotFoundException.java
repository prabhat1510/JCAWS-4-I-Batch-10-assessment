package exception;

public class CollegeNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Integer collegeId;
	String message;
	public CollegeNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CollegeNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}
	public CollegeNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}
	public CollegeNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	public CollegeNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	public CollegeNotFoundException(Integer collegeId) {
		super("Could not find college with id --"+collegeId);
		// TODO Auto-generated constructor stub
	}
}
