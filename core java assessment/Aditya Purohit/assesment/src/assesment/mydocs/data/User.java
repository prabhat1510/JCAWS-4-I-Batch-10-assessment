package assesment.mydocs.data;

import java.util.Objects;

public class User {
	
	private String userId;
	private String password;
	private String admin;
	
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", admin=" + admin + "]";
	}
	public User(String userId, String password, String admin) {
		super();
		this.userId = userId;
		this.password = password;
		this.admin = admin;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
