package core_java_assesment.service;

import java.util.List;
import core_java_assesment.dao.*;
import core_java_assesment.data.*;

public class UserServiceImpl implements UserService {
	private UserDAO userDAO = new UserDAOImpl();

	@Override
	public User getUserByUsername(String username,String password) {	
		return 	userDAO.getUserByUsername(username,password);
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userDAO.getUsers();
	}

}
