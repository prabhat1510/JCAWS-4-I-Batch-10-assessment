package logininformation.UI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import logininformation.data.User;
import logininformation.service.UserService;
import logininformation.service.UserServiceImpl;

public class UserUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String userName;
		String password;
		String userRoles;
			List<User> userList = new ArrayList<User>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter User Name");
		userName = scanner.next();
		System.out.println("Enter Password");
		password = scanner.next();
		System.out.println("Role Information");
		userRoles = scanner.next();
		
		UserService userService = new UserServiceImpl();
		try {
			User loggedInUser = userService.getUserByUserNameAndPassword(userName, password);

			System.out.println("Hello " + loggedInUser.getUserName() + "\n");

			if (loggedInUser.getUserRoles().equals("admin")) {
				while (true) {
					System.out.println("\nMENU\n");
					System.out.println("1. List Users\n");
					System.out.println("5. Exit\n");
					int choice = scanner.nextInt();
					switch (choice) {
					case 1:
						System.out.println("\nLIST USER\n");
						List<User> userLists = userService.getAllUsers();
						for (User user : userLists) {
							System.out.println(user.toString());
						}
						break;
					case 3:
						System.exit(0);
					default:
						System.out.println("NOT AN OPTION");
						break;
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		
		}
	}

}
