package mydocs.Service;

import java.util.List;

import mydocs.Data.User;

public interface Service {

	public User checkUser(String username,String Password);
	public List<User> getUsers();
}
