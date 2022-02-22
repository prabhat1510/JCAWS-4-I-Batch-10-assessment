package mydocs.service;

import java.util.List;

import mydocs.data.Login;

public interface LoginService {

	public Login checkUser(String username, String password);
	
	public List<Login> getAllUsers();
}
