package assessmentJCAWS.ui;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import assessmentJCAWS.data.User;
import assessmentJCAWS.exception.UnauthorisedAccessException;
import assessmentJCAWS.exception.UserNotFoundException;
import assessmentJCAWS.service.UserService;
import assessmentJCAWS.service.UserServiceImpl;

public class UserUi {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		UserService userService = new UserServiceImpl();
		
		
//		for user registration
		
		try {
			Integer row = userService.registerUser(new User(4,"Piyusha","Piyu@123"));
			System.out.println(row+" User added");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
//		for user login
		
		try {
			System.out.println("Please Enter Username: ");
			String username = sc.nextLine();
			System.out.println("Please Enter Password: ");
			String password = sc.nextLine();
			String res = userService.loginUser(username, password);
			System.out.println(res);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
//		for displaying users allowed only for admin and throws exception if user is not admin
		
		try {
			System.out.println("Please Enter Username: ");
			String username = sc.nextLine();
			System.out.println("Please Enter Password: ");
			String password = sc.nextLine();
			List<User> userList = userService.showUsers(username, password);
			
			//sorting according to name
			userList.sort((user1,user2)->user1.getUsername().compareTo(user2.getUsername()));
			userList.forEach(System.out::println);
			
		} catch (UserNotFoundException | SQLException | UnauthorisedAccessException e) {

			System.out.println(e.getMessage());
		}
		

	}
		
}
