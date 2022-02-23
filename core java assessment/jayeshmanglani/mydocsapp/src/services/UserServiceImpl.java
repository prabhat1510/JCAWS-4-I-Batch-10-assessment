package services;

import java.util.List;

import mydocsapp.dao.UserDAO;
import mydocsapp.dao.UserDAOImpl;
import mydocsapp.data.Users;

public class UserServiceImpl implements UserService {
	private UserDAO userDAO = new UserDAOImpl();
	@Override
	public List<Users> getAllUsers(String getUser) {
		return userDAO.getAllUsers(getUser);
	}

	@Override
	public String loginVerify(String userName, String password) {
		
		return userDAO.loginVerify(userName, password);
	}


}
