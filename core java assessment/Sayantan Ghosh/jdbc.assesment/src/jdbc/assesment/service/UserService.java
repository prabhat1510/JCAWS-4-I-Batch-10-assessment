package jdbc.assesment.service;

import java.util.List;

import jdbc.assesment.data.User;

public interface UserService {

	public boolean checkUser(User user);
	
    public Integer addUser(User user);
	
	
	public List<User> getAllUser();
}
