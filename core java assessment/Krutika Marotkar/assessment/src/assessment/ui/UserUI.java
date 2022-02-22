package assessment.ui;

import java.util.Scanner;

import assessment.data.User;
import assessment.service.UserService;
import assessment.service.UserServiceImpl;

public class UserUI {

	 public static void main(String[] args) {
		 
		 System.out.println("Enter your UserName");
		 Scanner sc = new Scanner(System.in);
		 String user_name= sc.nextLine();
		 System.out.println("Enter your Password");
		 Scanner pw = new Scanner(System.in);
		 String password = pw.nextLine();
		 
		 UserService userservice = new UserServiceImpl();
		 User user = new User(user_name,password);
		 String usercheck = userservice.checkuser(user_name, password);
		 
	 }
}
