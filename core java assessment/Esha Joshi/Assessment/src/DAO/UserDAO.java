package DAO;

import java.util.List;


public interface UserDAO {
	public User getUserByUsernameAndPassword(String username, String password);

	public List<User> getAllUsers();

	public Integer addUser(User user);

	public Integer deleteUserByUsername(String username);

	public Integer updateUserPassword(String password);
}


