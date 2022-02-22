package mydocsapp.service;

import java.util.List;

import mydocsapp.dao.UserDAO;
import mydocsapp.dao.UserDAOImpl;
import mydocsapp.dto.User;

public class UserServiceImpl implements UserService {
	private UserDAO userDAO = new UserDAOImpl();
	@Override
	public User getUserById(Integer UserId) {
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		return userDAO.getAllUsers();
	}


}
