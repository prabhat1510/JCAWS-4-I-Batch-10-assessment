package mydocs.dao;

import java.util.List;

import mydocs.data.User;

public interface UserDAO {

	//Retrieve 
		public User login(String userId, String password);
		public List<User> Users();
		
}
