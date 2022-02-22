package assessment.dao;

import assessment.dto.UserCredential;
import assessment.exception.UserAlreadyPresentException;
import assessment.exception.UserNotAddedException;
import assessment.exception.UserNotFoundException;

import java.util.List;

public interface LoginCheckDAO {
	public UserCredential userLoginToAdmin(String userId, String password) throws UserNotFoundException;
	public String newUserAddition(UserCredential userCredential) throws UserNotAddedException, UserAlreadyPresentException ;
	public List<UserCredential> getAllCustomer();
}
