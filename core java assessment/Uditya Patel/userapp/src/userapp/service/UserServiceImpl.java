package userapp.service;

import java.util.List;

import userapp.dao.UserDao;
import userapp.dao.UserDaoImpl;
import userapp.data.User;
import userapp.exception.UserNotFoundException;

public class UserServiceImpl implements UserService {
	private UserDao userDao = new UserDaoImpl();

	@Override
	public Integer addUser(User user) {
		return userDao.addUser(user);
	}

	@Override
	public User loginUser(String userId, String userPassword) throws UserNotFoundException {
		return userDao.loginUser(userId, userPassword);
	}

	@Override
	public User isAdmin(String userId, String userPassword) {
		return userDao.isAdmin(userId, userPassword);
	}

	@Override
	public List<User> getAllusers() {
		return userDao.getAllusers();
	}

}
