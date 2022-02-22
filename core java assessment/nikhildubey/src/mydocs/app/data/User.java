package mydocs.app.data;

import java.util.Objects;

public class User {

	private int userId;
	private String userName;
	private String password;
	private boolean isAdmin;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public User(int userId, String userName, String password, boolean isAdmin) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.isAdmin = isAdmin;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public User(int userId, String password, boolean isAdmin) {
		super();
		this.userId = userId;
		this.password = password;
		this.isAdmin = isAdmin;
	}

	@Override
	public int hashCode() {
		return Objects.hash(isAdmin, password, userId, userName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return isAdmin == other.isAdmin && Objects.equals(password, other.password) && userId == other.userId
				&& Objects.equals(userName, other.userName);
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", isAdmin=" + isAdmin
				+ "]";
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

}
