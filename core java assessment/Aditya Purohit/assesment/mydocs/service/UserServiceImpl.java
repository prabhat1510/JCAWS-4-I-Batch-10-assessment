package assesment.mydocs.service;

import java.util.List;

import assesment.mydocs.dao.UserDAO;
import assesment.mydocs.dao.UserDAOImpl;
import assesment.mydocs.data.User;
import assesment.mydocs.exception.IncorrectLoginException;


public class UserServiceImpl implements UserService {
	
	private UserDAO userDAO = new UserDAOImpl();
	@Override
	public User userLogIn(User user) throws IncorrectLoginException {
		// TODO Auto-generated method stub
		return userDAO.userLogIn(user);
	}
	@Override
	public List<User> getAllUserDetails() {
		// TODO Auto-generated method stub
		return userDAO.getAllUserDetails();
	}
	
	

}
