package core_java_assesment.ui;
import java.util.Scanner;

import core_java_assesment.data.User;
import core_java_assesment.service.UserService;
import core_java_assesment.service.UserServiceImpl;

public class UserUI {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		UserService userservice = new UserServiceImpl();
		
		System.out.println("Enter username");
		String userName = obj.nextLine();
		
		System.out.println("Enter password");
		String password = obj.nextLine();
		
		
		User name = userservice.getUserByUsername(userName,password);
		System.out.println(name);
		
	}

}
