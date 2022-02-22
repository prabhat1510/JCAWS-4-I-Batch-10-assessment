package mydocsapp.ui;

import java.util.Scanner;

import mydocsapp.service.UserService;
import mydocsapp.service.UserServiceImpl;

public class UserUI {
	 public static void main(String[] args) {
		 UserService userService = new UserServiceImpl();
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter Username : ");
		 String user = sc.next();
		 System.out.print("Enter Username : ");
		 String pass = sc.next();
		 String getUser = userService.loginVerify(user, pass);
		 System.out.println("Welcome "+getUser);
		 System.out.println(userService.getAllUsers(getUser));
	}
}
