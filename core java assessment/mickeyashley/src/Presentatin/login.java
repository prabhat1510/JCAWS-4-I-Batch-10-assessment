package Presentatin;

import java.util.Scanner;

import models.User;
import services.UserServices;
import services.UserServicesImpl;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter your username :");
		String username = sc.next();
		System.out.println("Please enter your password :");
		String password = sc.next();

		UserServices userService = new UserServicesImpl();
		try {
			User user = userService.getUser();
			if(user != null){
				System.out.println("Hello "+user.getUsername());
			}
		}catch(Exception e){
			System.out.println(e.printStackTrace());
		}
	}
	
}
