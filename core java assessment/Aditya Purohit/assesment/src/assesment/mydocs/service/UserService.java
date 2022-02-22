package assesment.mydocs.service;

import java.util.List;

import assesment.mydocs.data.User;
import assesment.mydocs.exception.IncorrectLoginException;

public interface UserService {
	
	public User userLogIn(User user) throws IncorrectLoginException;
	
	public List<User> getAllUserDetails();

}
