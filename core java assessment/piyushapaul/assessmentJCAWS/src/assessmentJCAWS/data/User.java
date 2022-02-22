package assessmentJCAWS.data;

public class User {
	
	private Integer serialNo;
	private String username;
	private String password;
	
	

	public User(Integer serialNo, String username, String password) {
		this.serialNo = serialNo;
		this.username = username;
		this.password = password;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public Integer getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}

	@Override
	public String toString() {
		return "User [serialNo=" + serialNo + ", username=" + username + ", password=" + password + "]";
	}
	
	
	
	
	
	

}
