package mydocsapp.data;

public class Users {
	private Long aadharNumber;
	private String name;
	private String userName;
	private String password;
	private String role;
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(Long aadharNumber, String name, String userName, String password, String role) {
		super();
		this.aadharNumber = aadharNumber;
		this.name = name;
		this.userName = userName;
		this.password = password;
		this.role = role;
	}
	public Long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(Long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Users [\naadharNumber=" + aadharNumber + ", name=" + name + ", userName=" + userName + ", password="
				+ password + ", role=" + role + "]";
	}
	
}
