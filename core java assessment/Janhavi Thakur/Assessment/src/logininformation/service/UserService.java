package logininformation.service;

import java.util.List;

import logininformation.data.User;

public interface UserService {

	public User getUserByUserNameAndPassword(String userName, String password);
	public List<User> getAllUsers();
	public Integer addUser(User user);
	public Integer deleteUserByUserName(String userName);
	public Integer updateUserPassword(String Password);
}
