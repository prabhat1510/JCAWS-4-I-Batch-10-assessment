package mydocsapplication.service;

import java.util.List;

import mydocsapplication.dto.User;

public interface ServiceLogin {
	
	public User Login(String uname , String pass);
	public List<User> UserList();

}
