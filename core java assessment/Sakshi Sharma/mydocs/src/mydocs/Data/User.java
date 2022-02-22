package mydocs.Data;

import java.util.Scanner;

public class User {
	
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserMain [username=" + username + ", password=" + password + "]";
	}
	public User() {
		super();
	}
	
	

}
