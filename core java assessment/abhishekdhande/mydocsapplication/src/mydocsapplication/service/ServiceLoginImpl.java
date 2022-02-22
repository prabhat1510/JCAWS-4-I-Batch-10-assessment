package mydocsapplication.service;

import java.util.List;

import mydocsapplication.dao.LoginDAOImpl;
import mydocsapplication.dao.LoginDAO;
import mydocsapplication.dto.User;


public class ServiceLoginImpl {
	
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
