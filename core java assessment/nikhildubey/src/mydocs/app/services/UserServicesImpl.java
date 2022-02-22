package mydocs.app.services;

import java.util.List;

import mydocs.app.dao.UserDAO;
import mydocs.app.dao.UserDAOImpl;
import mydocs.app.data.User;
import mydocs.app.exceptions.IncorrectCredentialsException;
import mydocs.app.exceptions.UserNotAdminException;
import mydocs.app.exceptions.UserNotFoundException;

public class UserServicesImpl implements UserServices {

	private UserDAO userDAO = new UserDAOImpl();
	
	@Override
	public Integer addUser(User user) {
		// TODO Auto-generated method stub
		return userDAO.addUser(user);
	}

	
	@Override
	public User loginUser(String userName, String password) throws IncorrectCredentialsException {
		// TODO Auto-generated method stub
		return userDAO.loginUser(userName, password);
	}

	@Override
	public String getUserName(User user) {
		// TODO Auto-generated method stub
		return userDAO.getUserName(user);
	}

	@Override
	public String getPassword(User user) {
		// TODO Auto-generated method stub
		return userDAO.getPassword(user);
	}

	@Override
	public boolean isAdmin(User user) {
		// TODO Auto-generated method stub
		return userDAO.isAdmin(user);
	}

	@Override
	public List<User> getAllUser() throws UserNotFoundException {
		// TODO Auto-generated method stub
		
		return userDAO.getAllUser();
	}

	
	

}
