package mydocs.app.exceptions;

public class UserNotAdminException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public UserNotAdminException(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}

}
