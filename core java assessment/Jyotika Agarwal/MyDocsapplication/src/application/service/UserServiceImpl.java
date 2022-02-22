package application.service;

import java.sql.SQLException;
import java.util.List;

import application.dao.UserDAO;
import application.dao.UserDAOImpl;
import application.data.UserLogin;
import exceptionhandle.UnauthorizedAccessException;
import exceptionhandle.UserNotFoundException;

public class UserServiceImpl implements UserService {
	UserDAO userDao = new UserDAOImpl();
	@Override
	public Integer registerUser(UserLogin user) throws Exception {
		// TODO Auto-generated method stub
		return userDao.registerUser(user);
	}

	@Override
	public String loginUser(String user_name, String password) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return userDao.loginUser(user_name, password);
	}

	@Override
	public List<UserLogin> showUsers(String user_name, String password)
			throws UserNotFoundException, SQLException, UnauthorizedAccessException {
		// TODO Auto-generated method stub
		return userDao.showUsers(user_name, password);
	}
}

	