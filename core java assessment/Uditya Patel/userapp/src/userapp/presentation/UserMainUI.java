package userapp.presentation;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import userapp.data.User;
import userapp.exception.UserNotFoundException;
import userapp.service.UserService;
import userapp.service.UserServiceImpl;

public class UserMainUI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ADDED SOME USERS IN OUR DATABASE		
		UserService userService = new UserServiceImpl();
		User user1 = new User("Uditya123", "Udit@2110", false);
		User user2 = new User("Avinash123", "Avinash@20", false);
		User user3 = new User("Rohit123", "Rohit@21", true);
		
//		System.out.println("1 user is added in database : " + userService.addUser(user1));
//		System.out.println("1 user is added in database : " +userService.addUser(user2));
//		System.out.println("1 user is added in database : " +userService.addUser(user3));
		
		
		// ENTER USER ID AND USER PASSWWORD FOR LOGIN		
		System.out.println("Enter User Name to Login");
		String userId = sc.next();
		System.out.println("Enter User Password to Login");
		String userPassword = sc.next();
		User myUser;
		try {
			myUser = userService.loginUser(userId, userPassword);
			if(myUser!=null) {
//				System.out.println(myUser);
				System.out.println("Hello " + userId);
			}
			
		} catch (UserNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Do you want to check that you are a Admin or not?");
		System.out.println("Enter 1 for YES OR 0 for NO");
		int userChoice = sc.nextInt();
		if(userChoice==1) {
			// CHECK FOR A USER IS ADMIN OR NOT 
			// IF THE USER IS ADMIN RETuRN ALL USERS IN SORTED FORMAT
			// ELSE DISPLAYING PROPER MESSAGE		
			User myAdminUser = userService.isAdmin(userId, userPassword);
			if(myAdminUser.getAdmin()==true) {
				List<User> myUsersList = userService.getAllusers();
				Collections.sort(myUsersList, (o1, o2) -> o1.getUserId().compareTo(o2.getUserId()));
				System.out.println(myUsersList.toString());
			}
			else {
				System.out.println("UnAuthorized Access! You are not Admin");
			}
		}
		else {
			System.out.println("Thank You");
		}
	

	}

}
