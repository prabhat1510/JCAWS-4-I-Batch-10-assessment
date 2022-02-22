package jdbc.assesment.service;

import java.util.List;

import jdbc.assesment.dao.UserDaoImpl;
import jdbc.assesment.data.User;


public class UserServiceImpl implements UserService  {

	private UserDaoImpl userDao = new UserDaoImpl();

	@Override
	public Integer addUser(User user) {
		// TODO Auto-generated method stub
		return userDao.addUser(user);
	}



	@Override
	public List<User> getAllUser() {
		return userDao.getAllUser();
	}



	@Override
	public boolean checkUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
