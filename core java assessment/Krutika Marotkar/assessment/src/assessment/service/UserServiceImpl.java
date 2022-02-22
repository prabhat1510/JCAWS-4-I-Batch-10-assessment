package assessment.service;

import java.util.List;

import assessment.dao.UserDAO;
import assessment.dao.UserDAOImpl;
import assessment.data.User;

public class UserServiceImpl implements UserService {
	private  UserDAO userDAO = new UserDAOImpl();

	//password match
	public String checkuser(String user_name,String password) {
		// TODO Auto-generated method stub
		return null ;
	}
// shows list
	public List<User> getallUser() {
		// TODO Auto-generated method stub
		return userDAO.getallUser();
	}
	

}
