package mydocs.dao;

import java.util.List;

import mydocs.data.Login;

public interface LoginDao {

	public Login checkUser(String username, String password);
	
	public List<Login> getAllUsers();
}
