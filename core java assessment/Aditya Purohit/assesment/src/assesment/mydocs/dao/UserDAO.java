package assesment.mydocs.dao;

import java.util.List;

import assesment.mydocs.data.User;
import assesment.mydocs.exception.IncorrectLoginException;


public interface UserDAO {
	
	//CRUD OPERATIONS 
	
	//
	public User userLogIn(User user) throws IncorrectLoginException;
	
	public List<User> getAllUserDetails();

}
