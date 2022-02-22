package mydocsapp.dao;

import java.sql.SQLException;
import java.util.List;

import mydocsapp.data.User;
import mydocsapp.exceptions.UnauthorizedAccessException;
import mydocsapp.exceptions.UserNotFoundException;

public interface UserDao {
	
	public Integer registerUser(User user) throws Exception;
	
	public String loginUser(String user_name,String password) throws UserNotFoundException;
	
	public List<User> showUsers(String user_name,String password) throws UserNotFoundException, SQLException, UnauthorizedAccessException;


}