package jdbc.assesment.dao;

import java.util.List;

import jdbc.assesment.data.User;

public interface UsersDao {

	public boolean checkUser(User user);
	public Integer addUser(User user);
	
	
	public List<User> getAllUser();
}
