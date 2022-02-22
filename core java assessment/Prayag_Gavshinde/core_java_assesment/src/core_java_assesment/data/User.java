package core_java_assesment.data;

public class User {
	private String username;
	private String password;
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public User() {}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
