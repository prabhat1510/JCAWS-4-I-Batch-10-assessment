package assessmentJCAWS.service;

import java.sql.SQLException;
import java.util.List;

import assessmentJCAWS.data.User;
import assessmentJCAWS.exception.UnauthorisedAccessException;
import assessmentJCAWS.exception.UserNotFoundException;

public interface UserService {
	
public Integer registerUser(User user) throws Exception;
	
	public String loginUser(String username,String password) throws UserNotFoundException;
	
	public List<User> showUsers(String username,String password) throws UserNotFoundException,SQLException,UnauthorisedAccessException;
}
