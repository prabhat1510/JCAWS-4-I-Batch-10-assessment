import java.sql.*;   
import java.util.*;
public class Login {
	public static void main(String args[]) throws Exception  
	 {  
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Scanner sc = new Scanner(System.in);  
	    System.out.print("Enter the user id : ");  
	    String uname = sc.next();  
	    System.out.print("Enter the password : ");  
	    String pass = sc.next();
	    welcome(uname,pass);
	    
	 }
	 
	 public static void welcome(String username , String password) {
	    try {
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "root");
	        Statement stmt = con.createStatement();  
	        ResultSet rs = stmt.executeQuery("select * from user where user_name='" + username + "' and password='" + password + "'");  
	        if (rs.next()) { 
	            System.out.println("Hello " + username + "\n");  
	            con.close();
	            if(username=="admin"){
	                getList();
	            }
	        }
	    
	        else  
	        System.out.println("username (or) password is incorrect");  
	        con.close();  
	    }	
	     catch (SQLException se) {
			se.printStackTrace();
		}
	}
	
	public static void getList(){
	    try{
	    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "root");
	    Statement stmt = con.createStatement();  
	    ResultSet rs1 = stmt.executeQuery("select user_name from user order by user_name");
	   while(rs1.next()){
                System.out.println("All users:");
	            System.out.println(rs1.getString("user_name"));
	   }
	   con.close();
	  }
	  catch (SQLException se) {
			se.printStackTrace();
		}
	}

}