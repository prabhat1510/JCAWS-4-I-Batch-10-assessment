package main.dao;

import java.util.List;

import main.models.User;

public interface UserDao {
	public User getUserByUsernameAndPassword(String username, String password);

	public List<User> getAllUsers();

	public Integer addUser(User user);

	public Integer deleteUserByUsername(String username);

	public Integer updateUserPassword(String password);
}
