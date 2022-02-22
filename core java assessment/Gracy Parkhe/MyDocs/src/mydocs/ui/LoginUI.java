package mydocs.ui;

import java.util.Scanner;

import mydocs.data.LoginDetails;
import mydocs.service.LoginService;
import mydocs.service.LoginServiceImpl;

public class LoginUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginService loginService = new LoginServiceImpl();
		
		 Scanner myObj = new Scanner(System.in);
		  System.out.println("Enter username");

		  String username = myObj.nextLine();
		  
		  System.out.println("Enter username");
		  String password = myObj.nextLine();
		  
		  LoginDetails login = loginService.checkLogin(username, password);
		  System.out.println(login);

	}

}