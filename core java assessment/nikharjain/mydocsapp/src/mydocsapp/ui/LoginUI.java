package mydocsapp.ui;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import mydocsapp.data.User;
import mydocsapp.exceptions.UnauthorizedAccessException;
import mydocsapp.exceptions.UserNotFoundException;
import mydocsapp.service.UserService;
import mydocsapp.service.UserServiceImpl;

public class LoginUI {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		UserService userService = new UserServiceImpl();
		
		

		
		try {
			Integer row = userService.registerUser(new User(2,"Nikhar","nikharjain12"));
			System.out.println(row+" User added");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		

		
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
