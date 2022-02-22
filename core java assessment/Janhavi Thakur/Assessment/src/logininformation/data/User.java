package logininformation.data;

public class User {

	private String userName;
	private String password;
	private String userRoles;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(String userRoles) {
		this.userRoles = userRoles;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", userRoles=" + userRoles + "]";
	}

	public User(String userName, String password, String userRoles) {
		super();
		this.userName = userName;
		this.password = password;
		this.userRoles = userRoles;
	}
	
}
