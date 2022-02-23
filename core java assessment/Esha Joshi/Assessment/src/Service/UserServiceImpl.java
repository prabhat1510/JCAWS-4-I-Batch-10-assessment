package Service;

import java.util.Collection;
import java.util.List;


public class UserServiceImpl implements UserService {

	UserDao userDao = new UserDaoImpl();

	@Override
	public User getUserByUsernameAndPassword(String username, String password) throws UserNotFoundException {
		User user = userDao.getUserByUsernameAndPassword(username, password);
		if (user.getUsername() == null || user.getPassword() == null) {
			throw new UserNotFoundException("username (or) password is incorrect");
		}
		return user;
	}

	@Override
	public List<User> getAllUsers() throws UserNotFoundException {
		List<User> userList = userDao.getAllUsers();
		if (userList.isEmpty() || userList == null || userList.size() == 0) {
			throw new UserNotFoundException("User list is empty");
		}
		return userList;
	}

	@Override
	public Integer addUser(User user) throws UserNotAddedException {
		Integer res = userDao.addUser(user);
		if (res > 0) {
			return res;
		} else {
			throw new UserNotAddedException("User not added");
		}
	}

	@Override
	public Integer deleteUserByUsername(String username) {
		return userDao.deleteUserByUsername(username);
	}

	@Override
	public Integer updateUserPassword(String password) throws UserNotUpdatedException {
		Integer res = userDao.updateUserPassword(password);
		if (res > 0) {
			return res;
		} else {
			throw new UserNotUpdatedException("Password not updated...!");
		}
	}

}