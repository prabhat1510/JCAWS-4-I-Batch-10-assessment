package userapp.data;

public class User {
	private String userId;
	private String userPassword;
	private boolean isAdmin;
	
	public User() {
	}

	public User(String userId, String userPassword, boolean isAdmin) {
		this.userId = userId;
		this.userPassword = userPassword;
		this.isAdmin = isAdmin;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public boolean getAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPassword=" + userPassword + ", isAdmin=" + isAdmin + "]";
	}
	
	
	
	

}
