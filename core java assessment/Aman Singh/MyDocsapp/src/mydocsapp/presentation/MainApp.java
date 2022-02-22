package mydocsapp.presentation;

import java.util.Scanner;

import mydocsapp.dao.UserDAOImpl;
import mydocsapp.exception.UserNotFoundException;

public class MainApp {


	public static void main(String[] args) {
		String USERNAME ="AdminOfAll";
		String PASSWORD ="Ast2riNg";
		
		String username ="Admin";
		String password = "Astring";

		System.out.println("Enter your username");
		Scanner obj = new Scanner(System.in);
		String user = obj.nextLine();
		System.out.println("Enter your password");
		String pass = obj.nextLine();
		
		if (username.equalsIgnoreCase(user)||USERNAME.equalsIgnoreCase(user) && PASSWORD.equals(pass)||password.equals(pass))
		{
			System.out.println("Hello " + username);
			if(PASSWORD.equals(pass)&&(USERNAME.equals(user)))
			{
				System.out.println("Hello "+ USERNAME);
				UserDAOImpl list = new UserDAOImpl();
				System.out.println("List of users"+ list.getListOfAll());
				
				
			}
		}
		else
		{
			System.out.println("username (or) password is incorrect");			
		}			
	}
}
