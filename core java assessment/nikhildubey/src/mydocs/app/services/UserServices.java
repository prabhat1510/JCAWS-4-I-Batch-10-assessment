package mydocs.app.services;

import java.util.List;

import mydocs.app.data.User;
import mydocs.app.exceptions.IncorrectCredentialsException;
import mydocs.app.exceptions.UserNotAdminException;
import mydocs.app.exceptions.UserNotFoundException;

public interface UserServices {
	
	public Integer addUser(User user);

	public User loginUser(String userName, String password) throws IncorrectCredentialsException;

	public String getUserName(User user);

	public String getPassword(User user);

	public boolean isAdmin(User user);

	public List<User> getAllUser() throws UserNotFoundException;

}
