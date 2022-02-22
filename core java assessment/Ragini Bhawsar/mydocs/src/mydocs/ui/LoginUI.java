package mydocs.ui;

import java.util.Scanner;

import mydocs.data.Login;
import mydocs.service.LoginService;
import mydocs.service.LoginServiceImpl;

public class LoginUI {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		LoginService loginService = new LoginServiceImpl();
		System.out.println("Enter Username");
		String uname = scan.nextLine();
		
		Login login = new Login();
		System.out.println("Enter Password");
		String pass = scan.nextLine();
		login = loginService.checkUser(uname, pass);
		System.out.println(login);
		
		if(login == null)
			System.out.println("Login Failed Please Check Username or Password");
		else
		{
			System.out.println("logged in successfully");
		}
	}
}
