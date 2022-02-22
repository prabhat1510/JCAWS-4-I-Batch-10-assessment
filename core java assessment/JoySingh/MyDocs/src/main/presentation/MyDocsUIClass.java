package main.presentation;

import static java.lang.System.out;

import java.util.List;
import java.util.Scanner;

import main.exceptions.UserNotFoundException;
import main.models.User;
import main.services.UserService;
import main.services.UserServiceImpl;

public class MyDocsUIClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		out.println("\nHello From MyDocs\n");
		out.println("\n****LOGIN****\n");
		out.println("\nPlease enter your username : \n");
		String username = sc.next();
		out.println("\nPlease enter your password : \n");
		String password = sc.next();

		UserService userService = new UserServiceImpl();
		User loggedInUser;
		try {
			loggedInUser = userService.getUserByUsernameAndPassword(username, password);
			out.println("\nHello " + loggedInUser.getUsername() + "\n");
			out.println("\n****MENU****\n");
			out.println("1. List Users\n");
			out.println("5. Exit\n");

			int choice = sc.nextInt();
			if (loggedInUser.getRole() == "admin") {
				switch (choice) {
				case 1:
					out.println("\n****LIST USERS****\n");
					List<User> userList = userService.getAllUsers();
					for (User user : userList) {
						out.println(user.toString());
					}
				case 3:
					System.exit(0);
					break;
				default:
					out.println("\n****INVALID CHOICE****\n");
				}
			}
		} catch (UserNotFoundException e) {
			out.println(e.getMessage());
		}
	}
}
