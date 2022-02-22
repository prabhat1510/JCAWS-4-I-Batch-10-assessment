package mydocs.UI;


import java.util.Scanner;

import mydocs.Data.User;
import mydocs.Service.Service;
import mydocs.Service.ServiceImpl;

public class UserMain {
      
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String username=sc.nextLine();
	String password=sc.nextLine();
	
	
	username = username.strip();
	password = password.strip();
	
	User user=new User();
	
   Service  cs=new ServiceImpl();
   cs.checkUser(username,password);
   
	
	System.out.println(cs);
	
	
	cs.getUsers();
	System.out.println(cs);
	
	
}
	
}
