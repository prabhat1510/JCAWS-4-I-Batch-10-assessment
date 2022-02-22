package application.ui;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import application.data.UserLogin;
import application.service.UserService;
import application.service.UserServiceImpl;
import exceptionhandle.UnauthorizedAccessException;
import exceptionhandle.UserNotFoundException;

public class MainApp {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		UserService userService = new UserServiceImpl();
		try {
			Integer row = userService.registerUser(new UserLogin("Jyotika@1234","Jyoti",1));
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
			List<UserLogin> userList = userService.showUsers(user_name, password);
			
			//sorting according to name
			userList.sort((user1,user2)->user1.getUsername().compareTo(user2.getUsername()));
			userList.forEach(System.out::println);
			
		} catch (UserNotFoundException | SQLException | UnauthorizedAccessException e) {

			System.out.println(e.getMessage());
		}
		

	}

}
