package mydocs.app.ui;

import java.util.List;
import java.util.Scanner;

import mydocs.app.data.User;
import mydocs.app.exceptions.IncorrectCredentialsException;
import mydocs.app.exceptions.PasswordConfirmPasswordNotMatchingException;
import mydocs.app.exceptions.UserNotAdminException;
import mydocs.app.exceptions.UserNotFoundException;
import mydocs.app.services.UserServicesImpl;

public class MyDocsOpsImpl implements MyDocsOps {
	
	Scanner sc = new Scanner(System.in);
	UserServicesImpl userService = new UserServicesImpl();
	
	private boolean isAdmin = false;
	
	public boolean getAdmin() {
		return this.isAdmin;
	}
	
	public void setIsAdmin(boolean value) {
		this.isAdmin = value;
	}
	
	public static void clearScreen() {  
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();  
	}

	@Override
	public boolean login() {
		

		String userName;
		String password;

		System.out.println("\t\t\tWelcome to MyDocs");
		System.out.println("Enter Yor Credentials to login");
		System.out.print("Enter Yor UserName:");
		userName = sc.next();
		System.out.println();
		System.out.print("Enter Yor Password:");
		password = sc.next();

		try {
			User userData = new User();
			userData=userService.loginUser(userName, password);
			
			setIsAdmin(userData.isAdmin());
			
		} catch (IncorrectCredentialsException e) {
			System.out.println(e.getMessage());
			return false;
		}
		
		return true;
	
	}

	@Override
	public void registerUser()  {
		clearScreen();
		
		int userId;
		String userName;
		String password;
		String confirmPassword;
		boolean isAdmin;
	
		
		System.out.println("Register User");
		
		User user = new User();
		
		System.out.println("Enter User Id:");
		userId = sc.nextInt();
		user.setUserId(userId);
		
		System.out.println("Enter User Name:");
		userName = sc.next();
		user.setUserName(userName);
		
		System.out.println("Enter password");
		password = sc.next();
		System.out.println("Confirm password");
		confirmPassword = sc.next();
		
		try {
		if(password.equals(confirmPassword)) {
			user.setPassword(password);
		}
		else {
			throw new PasswordConfirmPasswordNotMatchingException("Password and Confirm Password Does Not Match");
		}}catch(PasswordConfirmPasswordNotMatchingException pcnfe) {
			System.out.println(pcnfe.getMessage());
		}
		
		user.setAdmin(false);
		userService.addUser(user);
		
		System.out.println();
		
	}

	@Override
	public List<User> getAllUser() {
		
		try {
			if(!isAdmin) {
				throw new UserNotAdminException("User is not admin. Cannot perform this operation.");
			}
			userService.getAllUser();
		} catch (UserNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UserNotAdminException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	

}
