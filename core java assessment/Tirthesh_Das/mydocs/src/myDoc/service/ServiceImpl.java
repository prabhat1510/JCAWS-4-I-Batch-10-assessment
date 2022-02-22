package mydocs.services;
import java.sql.SQLException;
import java.util.List;
import mydocs.dao.UserDao;
import mydocs.dao.UserDaoImpl;
import mydocs.data.User;
import mydocs.exceptions.UnauthorizedAccessException;
import mydocs.exceptions.UserNotFoundException;

public class UserServiceImpl implements UserService {
	
	User user = new UserImpl();
	@Override
	public Integer registerUser(User user) throws Exception {
		return user.registerUser(user);
	}
	@Override
	public String loginUser(String user_name, String password) throws UserNotFoundException {
		return user.loginUser(user_name, password);
	}
	@Override
	public List<User> showUsers(String user_name, String password) throws UserNotFoundException,SQLException,UnauthorizedAccessException{
		return user.showUsers(user_name, password);
	}

}
