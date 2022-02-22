package application.service;

import java.sql.SQLException;
import java.util.List;

import application.data.UserLogin;
import exceptionhandle.UnauthorizedAccessException;
import exceptionhandle.UserNotFoundException;

public interface UserService {
public Integer registerUser(UserLogin user)throws Exception;
	
	public String loginUser(String user_name,String password)throws UserNotFoundException;
	
	public List<UserLogin> showUsers(String user_name,String password) throws UserNotFoundException, SQLException, UnauthorizedAccessException;

}
