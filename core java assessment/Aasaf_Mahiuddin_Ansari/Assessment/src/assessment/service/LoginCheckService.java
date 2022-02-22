package assessment.service;

import java.util.List;

import assessment.dto.UserCredential;
import assessment.exception.UserAlreadyPresentException;
import assessment.exception.UserNotAddedException;
import assessment.exception.UserNotFoundException;

public interface LoginCheckService {
	public UserCredential userLoginToAdmin(String userId, String password) throws UserNotFoundException;
	public String newUserAddition(UserCredential userCredential) throws UserNotAddedException, UserAlreadyPresentException ;
	public List<UserCredential> getAllCustomer();

}
