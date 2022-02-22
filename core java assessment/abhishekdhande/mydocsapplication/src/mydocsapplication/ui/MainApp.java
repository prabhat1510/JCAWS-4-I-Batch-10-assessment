package mydocsapplication.ui;
import java.util.Scanner;

import mydocsapplication.service.ServiceLogin;
import mydocsapplication.service.ServiceLoginImpl;
import mydocsapplication.dto.User;

public class MainApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String username = sc.next();
		String password = sc.next();
		
		username = username.strip();
		password = password.strip();
		
		// creating object with parameterized constructor 
		
		ServiceLogin serLogin = (ServiceLogin) new ServiceLoginImpl();
		User user_obj = new User();
		
		 user_obj = serLogin.Login(username, password);
		
		if(user_obj == null)
			System.out.println("Failed");
		else
		{
			System.out.println("logged in successfully");
		
			if(user_obj.getIs_admin() == true)
			{
				System.out.println("You are admin");
				System.out.println(serLogin.UserList());
			}
		}
		// call login method
		
		// if is admin is true call get all method

	}

}
