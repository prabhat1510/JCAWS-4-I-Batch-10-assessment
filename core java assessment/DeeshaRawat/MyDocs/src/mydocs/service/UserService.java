package mydocs.service;

import java.util.List;

import mydocs.data.User;


public interface UserService {

	public User login(String userId, String password);
	public List<User> Users();

	
}
