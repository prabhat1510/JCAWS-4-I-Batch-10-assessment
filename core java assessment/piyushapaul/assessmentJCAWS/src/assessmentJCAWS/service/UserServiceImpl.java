package assessmentJCAWS.service;

import java.sql.SQLException;
import java.util.List;

import assessmentJCAWS.dao.UserDao;
import assessmentJCAWS.dao.UserDaoImpl;
import assessmentJCAWS.data.User;
import assessmentJCAWS.exception.UnauthorisedAccessException;
import assessmentJCAWS.exception.UserNotFoundException;


public class UserServiceImpl implements UserService {
	
	UserDao userDao = new UserDaoImpl();

	@Override
	public Integer registerUser(User user) throws Exception {
		
		return userDao.registerUser(user);
	}

	@Override
	public String loginUser(String username, String password) throws UserNotFoundException {
		
		return userDao.loginUser(username, password);
	}

	@Override
	public List<User> showUsers(String username, String password) throws UserNotFoundException,SQLException,UnauthorisedAccessException{
		
		return userDao.showUsers(username, password);
	}

}
