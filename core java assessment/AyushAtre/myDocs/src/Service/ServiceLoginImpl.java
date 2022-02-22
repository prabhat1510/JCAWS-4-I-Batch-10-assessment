package Service;

import java.util.List;

import DAO.LoginDAOImpl;
import DAO.LoginDao;
import DTO.User;

public class ServiceLoginImpl implements ServiceLogin {

	LoginDao obj = new LoginDAOImpl();
	
	@Override
	public User Login(String uname, String pass) {
		// TODO Auto-generated method stub
		return obj.Login(uname,pass);
	}

	@Override
	public List<User> UserList() {
		return obj.UserList();
	}

}
