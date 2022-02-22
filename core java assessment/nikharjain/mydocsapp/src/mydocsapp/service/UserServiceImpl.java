package mydocsapp.service;


import java.sql.SQLException;
import java.util.List;

import mydocsapp.dao.UserDao;
import mydocsapp.dao.UserDaoImpl;
import mydocsapp.data.User;
import mydocsapp.exceptions.UnauthorizedAccessException;
import mydocsapp.exceptions.UserNotFoundException;

public class UserServiceImpl implements UserService {
	
	UserDao userDao = new UserDaoImpl();

	@Override
	public Integer registerUser(User user) throws Exception {
		
		return userDao.registerUser(user);
	}

	@Override
	public String loginUser(String user_name, String password) throws UserNotFoundException {
		
		return userDao.loginUser(user_name, password);
	}

	@Override
	public List<User> showUsers(String user_name, String password) throws UserNotFoundException,SQLException,UnauthorizedAccessException{
		
		return userDao.showUsers(user_name, password);
	}

}