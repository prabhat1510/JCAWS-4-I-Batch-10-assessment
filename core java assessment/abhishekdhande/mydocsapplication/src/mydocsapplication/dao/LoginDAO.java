package mydocsapplication.dao;

import java.util.List;

import mydocsapplication.dto.User;

public interface LoginDAO {

	public User Login(String uname , String pass);
	public List<User> UserList();
}
