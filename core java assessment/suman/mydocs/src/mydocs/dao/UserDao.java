package mydocs.dao;

import java.sql.SQLException;
import java.util.List;

import mydocs.data.User;
import mydocs.exceptions.UnauthorizedAccessException;
import mydocs.exceptions.UserNotFoundException;

public interface UserDao {
	
	public Integer registerUser(User user) throws Exception;
	
	public String loginUser(String user_name,String password) throws UserNotFoundException;
	
	public List<User> showUsers(String user_name,String password) throws UserNotFoundException, SQLException, UnauthorizedAccessException;


}
