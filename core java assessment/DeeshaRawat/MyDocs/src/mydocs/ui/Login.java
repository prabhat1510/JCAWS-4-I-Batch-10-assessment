package mydocs.ui;

import java.util.Scanner;

import mydocs.data.User;
import mydocs.service.UserService;
import mydocs.service.UserServiceImpl;

public class Login {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("username");
        String userId = sc.nextLine();
        System.out.println("Password");
        String password = sc.nextLine();
        
        userId = userId.strip();
		password = password.strip();
        
        UserService serLogin = new UserServiceImpl();
		User user_obj = new User(userId, password);
		
		 user_obj = serLogin.login(userId, password);
		
		if(user_obj == null)
			System.out.println("Login Failed");
		else
		{
			System.out.println("Welcome Back!!");
		
			if(user_obj.getIs_admin() == true)
			{
				System.out.println(serLogin.Users());
			}
		}

	}

}
