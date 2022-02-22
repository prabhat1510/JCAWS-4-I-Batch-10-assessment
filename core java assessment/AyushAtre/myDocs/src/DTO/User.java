package DTO;

public class User {
	private Integer UserId;
	private String userName;
	private String password;
	private Boolean is_admin ;
	public User(Integer userId, String userName, String password, Boolean is_admin) {
		super();
		UserId = userId;
		this.userName = userName;
		this.password = password;
		this.is_admin = is_admin;
	}
	
	public User( String userName, String password) {
		super();

		this.userName = userName;
		this.password = password;

	}
	@Override
	public String toString() {
		return "User [UserId=" + UserId + ", userName=" + userName + ", password=" + password + ", is_admin=" + is_admin
				+ "]";
	}
	public Integer getUserId() {
		return UserId;
	}
	public void setUserId(Integer userId) {
		UserId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String string) {
		this.userName = string;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getIs_admin() {
		return is_admin;
	}
	public void setIs_admin(Boolean is_admin) {
		this.is_admin = is_admin;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
