package assessment.service;

import java.util.List;

import assessment.dao.LoginCheckDAO;
import assessment.dao.LoginCheckDAOImpl;
import assessment.dto.UserCredential;
import assessment.exception.UserAlreadyPresentException;
import assessment.exception.UserNotAddedException;
import assessment.exception.UserNotFoundException;

public class LoginCheckServiceImpl implements LoginCheckService {
	private LoginCheckDAO loginCheckDAO = new LoginCheckDAOImpl();

	@Override
	public UserCredential userLoginToAdmin(String userId, String password) throws UserNotFoundException {
		return loginCheckDAO.userLoginToAdmin(userId, password);
		
	}

	@Override
	public String newUserAddition(UserCredential userCredential) throws UserNotAddedException, UserAlreadyPresentException {
		return loginCheckDAO.newUserAddition(userCredential);
	}

	@Override
	public List<UserCredential> getAllCustomer() {
		return loginCheckDAO.getAllCustomer();
	}
}