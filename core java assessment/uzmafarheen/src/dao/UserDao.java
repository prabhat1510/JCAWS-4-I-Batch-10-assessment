package dao;


import java.sql.SQLException;
import java.util.List;

import data.User;
import exceptions.UnauthorizedAccessException;
import exceptions.UserNotFoundException;

public interface UserDao {
	
	public Integer registerUser(User user) throws Exception;
	
	public String loginUser(String user_name,String password) throws UserNotFoundException;
	
	public List<User> showUsers(String user_name,String password) throws UserNotFoundException, SQLException, UnauthorizedAccessException;


}
