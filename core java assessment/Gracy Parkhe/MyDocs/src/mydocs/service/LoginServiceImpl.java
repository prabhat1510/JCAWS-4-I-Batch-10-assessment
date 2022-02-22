package mydocs.service;


import mydocs.dao.LoginDAO;
import mydocs.dao.LoginDAOImpl;
import mydocs.data.LoginDetails;

public class LoginServiceImpl implements LoginService{
	
	private LoginDAO loginDAO = new LoginDAOImpl();

	@Override
	public LoginDetails checkLogin(String f, String s) {
		// TODO Auto-generated method stub
		
		return LoginDAO.checkLogin(f, s);
		
	}

}
