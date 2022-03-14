package springassesment.exception;

public class CollegeNotFoundException extends Exception {
	String message;
	Integer collegeId;

	public CollegeNotFoundException() {
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
		super("College not found with id ---" + collegeId);
		// TODO Auto-generated constructor stub
	}

//	public StudentNotFoundException(String studentName) {
//		super("Student not found with name ---"+studentName);
//		// TODO Auto-generated constructor stub
//	}
}