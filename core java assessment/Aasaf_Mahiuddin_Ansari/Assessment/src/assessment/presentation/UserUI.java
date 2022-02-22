package assessment.presentation;

import java.util.List;
import java.util.Scanner;

import assessment.dto.UserCredential;
import assessment.exception.UserAlreadyPresentException;
import assessment.exception.UserNotAddedException;
import assessment.exception.UserNotFoundException;
import assessment.service.LoginCheckService;
import assessment.service.LoginCheckServiceImpl;

public class UserUI {

	public static void main(String[] args) {
		LoginCheckService loginCheckService = new LoginCheckServiceImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter your userName and password to Login ");
		String userId = sc.next();
		String password = sc.next();
		UserCredential userCredential = new UserCredential();
		try {
			userCredential = loginCheckService.userLoginToAdmin(userId, password);
		
			if(userCredential.getUserId() != null && userCredential.getPassword() != null) {
				System.out.println("Hello "+ userId );
				System.out.println("Do you wish to add a new User 'yes/no' ");
				String result1 = sc.next();
				if(result1.equalsIgnoreCase("yes")) {
					System.out.println("Enter a userName and Password");
					String addUserId = sc.next();
					String addPassword = sc.next();
					UserCredential userCredentialA2 = new UserCredential(addUserId, addPassword);
					System.out.println(loginCheckService.newUserAddition(userCredentialA2));
				}
				System.out.println("Do you wish to see all User 'yes/no' ");
				String result2 = sc.next();
				if(result2.equalsIgnoreCase("yes")) {
					List<UserCredential> allUser = loginCheckService.getAllCustomer();
					System.out.println(allUser);
				}
				
			}else {
				System.out.println("UserName (or) Password is incorrect");
				System.out.println("Do you wish to add yourself 'yes/no' ");
				String result = sc.next();
				if(result.equalsIgnoreCase("yes")) {
					System.out.println("Enter a userName and Password");
					String addUserId = sc.next();
					String addPassword = sc.next();
					UserCredential userCredentialA1 = new UserCredential(addUserId, addPassword);
					System.out.println(loginCheckService.newUserAddition(userCredentialA1));
				}
			}
		} catch (UserNotFoundException | UserNotAddedException | UserAlreadyPresentException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}
