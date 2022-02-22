package main.presentation;

import static java.lang.System.out;

import java.util.List;
import java.util.Scanner;

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
		try {
			User loggedInUser = userService.getUserByUsernameAndPassword(username, password);

			out.println("\nHello " + loggedInUser.getUsername() + "\n");

			if (loggedInUser.getRole().equals("admin")) {
				while (true) {
					out.println("\n****MENU****\n");
					out.println("1. List Users\n");
					out.println("5. Exit\n");
					int choice = sc.nextInt();
					switch (choice) {
					case 1:
						out.println("\n****LIST USERS****\n");
						List<User> userList = userService.getAllUsers();
						for (User user : userList) {
							out.println(user.toString());
						}
						break;
					case 3:
						System.exit(0);
					default:
						out.println("\n****INVALID CHOICE****\n");
						break;
					}
				}
			}
		} catch (Exception e) {
			out.println(e.getMessage());
		}
	}
}
