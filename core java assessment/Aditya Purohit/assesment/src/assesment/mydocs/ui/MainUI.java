package assesment.mydocs.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import assesment.mydocs.data.User;
import assesment.mydocs.exception.IncorrectLoginException;
import assesment.mydocs.service.UserService;
import assesment.mydocs.service.UserServiceImpl;


public class MainUI {

	public static void main(String[] args) {
		
		
		String uid;
		String password;
		String admin;
		String choice;
		List<User> userList = new ArrayList<User>();
		Scanner sc = new Scanner(System.in);
		System.out.println("to Login Enter Credentials");
		System.out.println();
		
		System.out.println("Enter User ID");
		uid = sc.next();
		System.out.println("Enter User Password");
		password = sc.next();
		System.out.println("Are you Admin");
		admin = sc.next();
		
		User user = new User(uid,password,admin);
		
		UserService userService = new UserServiceImpl();
		User fetchedUser;
		try {
			fetchedUser = userService.userLogIn(user);
		
		System.out.println(fetchedUser);
		
		if(fetchedUser.getUserId().equals(user.getUserId()) && fetchedUser.getPassword().equals(user.getPassword()))
		{
			System.out.println("Hello "+fetchedUser.getUserId());
		}
		
		// fetch List of all other user
		if(fetchedUser.getAdmin().equals("yes"))
		{
			System.out.println("you are admin");
			userList = userService.getAllUserDetails();
			System.out.println(userList);
			
		}
		} catch (IncorrectLoginException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		}

}
