package mydocs.service;

import java.util.List;
import mydocs.dao.UserDAO;
import mydocs.dao.UserImpl;
import mydocs.data.User;

public class UserServiceImpl implements UserService {

UserDAO obj = new UserImpl();
	
	@Override
	public User login(String userID, String password) {
		// TODO Auto-generated method stub
		return obj.Login(userId,password);
	}

	@Override
	public List<User> Users() {
		// TODO Auto-generated method stub
		return obj.Users();
	}
}
