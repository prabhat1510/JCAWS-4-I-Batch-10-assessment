package assessment.data;

public class User {
	
	private String user_name;
	private String password;
 
	
	public User()
	 {
		 
	 }
	
	public User(String user_name, String password) {
		this.setUser_name(user_name);
		this.setPassword(password);
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String username) {
		this.user_name = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	 @Override
		public String toString() {
			return "User [username=" + user_name + ", password=" + password + "]";
		}

}
