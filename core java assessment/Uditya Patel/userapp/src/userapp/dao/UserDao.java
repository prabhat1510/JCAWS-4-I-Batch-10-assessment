package userapp.dao;

import java.util.List;

import userapp.data.User;
import userapp.exception.UserNotFoundException;

public interface UserDao {
	
	public Integer addUser(User user);
	
	public User loginUser(String userId, String userPassword) throws UserNotFoundException;
	
	public User isAdmin(String userId, String userPassword);
	
	public List<User> getAllusers();

}
