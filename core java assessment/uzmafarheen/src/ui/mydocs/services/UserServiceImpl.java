package mydocs.services;

import java.sql.SQLException;
import java.util.List;

import mydocs.dao.UserDao;
import mydocs.dao.UserDaoImpl;
import mydocs.data.User;
import mydocs.exceptions.UnauthorizedAccessException;
import mydocs.exceptions.UserNotFoundException;

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
