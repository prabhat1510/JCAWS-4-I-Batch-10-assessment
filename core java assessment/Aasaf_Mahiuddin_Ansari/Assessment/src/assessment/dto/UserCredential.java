package assessment.dto;

public class UserCredential {
	private String userId;
	private String password;
	public UserCredential() {
	}
	public UserCredential(String userId, String password) {
		this.userId = userId;
		this.password = password;
	}
	public String getUserId() {
		return userId;
	}
	public String getPassword() {
		return password;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserCredential [userId=" + userId + ", password=" + password + "]";
	}
		
}
