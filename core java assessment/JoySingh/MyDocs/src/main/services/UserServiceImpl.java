package main.services;

import java.util.List;

import main.dao.UserDao;
import main.dao.UserDaoImpl;
import main.exceptions.UserNotAddedException;
import main.exceptions.UserNotFoundException;
import main.exceptions.UserNotUpdatedException;
import main.models.User;

public class UserServiceImpl implements UserService {

	UserDao userDao = new UserDaoImpl();

	@Override
	public User getUserByUsernameAndPassword(String username, String password) throws UserNotFoundException {
		User user = userDao.getUserByUsernameAndPassword(username, password);
		if (user == null) {
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
