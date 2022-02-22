package Service;

import java.util.List;

import main.exceptions.UserNotAddedException;
import main.exceptions.UserNotFoundException;
import main.exceptions.UserNotUpdatedException;
import main.models.User;

public interface UserService {
	public User getUserByUsernameAndPassword(String username, String password) throws UserNotFoundException;

	public List<User> getAllUsers() throws UserNotFoundException;

	public Integer addUser(User user) throws UserNotAddedException;

	public Integer deleteUserByUsername(String username);

	public Integer updateUserPassword(String password) throws UserNotUpdatedException;
}
