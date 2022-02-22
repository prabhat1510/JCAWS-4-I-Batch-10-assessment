package jdbc.assesment.ui;

import java.util.Scanner;

import jdbc.assesment.data.User;
import jdbc.assesment.service.UserService;
import jdbc.assesment.service.UserServiceImpl;

public class UserUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserService userService=new UserServiceImpl();
//		User user1=new User("Sayantan","Sayantan@123");
		User user2=new User("Raghav","Raghav@123");
		User user3=new User("Udayan","Udayan@123");
//		System.out.println(userService.addUser(user1));
		System.out.println(userService.addUser(user2));
		System.out.println(userService.addUser(user3));
		
		System.out.println(userService.getAllUser());
		
		Scanner sc=new Scanner(System.in);
		
		
	}

}
