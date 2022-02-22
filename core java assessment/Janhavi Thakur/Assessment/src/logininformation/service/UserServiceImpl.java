package logininformation.service;

import java.util.List;

import logininformation.dao.UserDAO;
import logininformation.dao.UserDAOImpl;
import logininformation.data.User;

public class UserServiceImpl implements UserService {

	UserDAO userDAO= new UserDAOImpl();
	@Override
	public User getUserByUserNameAndPassword(String userName, String password) {
		User user = userDAO.getUserByUserNameAndPassword(userName, password);
		if (user.getUserName() == null || user.getPassword() == null) {
			System.out.println("username (or) password is incorrect");
		}
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		List<User> userList = userDAO.getAllUsers();
		if (userList.isEmpty() || userList == null || userList.size() == 0) {
			System.out.println("User list is empty");
		}
		return userList;
	}

	@Override
	public Integer addUser(User user) {
		
		Integer res = userDAO.addUser(user);
		if (res > 0) {
			return res;
		} 
		else {
			System.out.println("User not added");
			return null;
		}
	}

	@Override
	public Integer deleteUserByUserName(String userName) {
		return userDAO.deleteUserByUserName(userName);
	}

	@Override
	public Integer updateUserPassword(String password) {
		Integer result = userDAO.updateUserPassword(password);
		if (result > 0) {
			return result;
		} 
		else {
			System.out.println("Password not updated ");	
			return null;
			}

}
}
