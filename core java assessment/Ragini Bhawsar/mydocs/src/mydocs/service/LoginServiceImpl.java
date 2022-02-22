package mydocs.service;

import java.util.List;

import mydocs.dao.LoginDao;
import mydocs.dao.LoginDaoImpl;
import mydocs.data.Login;

public class LoginServiceImpl implements LoginService{

	private LoginDao loginDao = new LoginDaoImpl();

	@Override
	public Login checkUser(String username, String password) {
		
		return loginDao.checkUser(username, password);
	}

	@Override
	public List<Login> getAllUsers() {
		
		return loginDao.getAllUsers();
	}	

}
