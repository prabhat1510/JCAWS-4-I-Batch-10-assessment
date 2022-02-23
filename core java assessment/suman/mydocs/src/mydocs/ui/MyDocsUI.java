package mydocs.ui;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import mydocs.data.User;
import mydocs.exceptions.UnauthorizedAccessException;
import mydocs.exceptions.UserNotFoundException;
import mydocs.services.UserService;
import mydocs.services.UserServiceImpl;

public class MyDocsUI {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		UserService userService = new UserServiceImpl();
		
		
//		for user registration
		
		try {
			Integer row = userService.registerUser(new User(4,"riju","riju@123"));
			System.out.println(row+" User added");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
//		for user login
		
		try {
			System.out.println("Please Enter Username: ");
			String user_name = sc.nextLine();
			System.out.println("Please Enter Password: ");
			String password = sc.nextLine();
			String res = userService.loginUser(user_name, password);
			System.out.println(res);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
//		for displaying users allowed only for admin and throws exception if user is not admin
		
		try {
			System.out.println("Please Enter Username: ");
			String user_name = sc.nextLine();
			System.out.println("Please Enter Password: ");
			String password = sc.nextLine();
			List<User> userList = userService.showUsers(user_name, password);
			
			//sorting according to name
			userList.sort((user1,user2)->user1.getUser_name().compareTo(user2.getUser_name()));
			userList.forEach(System.out::println);
			
		} catch (UserNotFoundException | SQLException | UnauthorizedAccessException e) {

			System.out.println(e.getMessage());
		}
		

	}

}
