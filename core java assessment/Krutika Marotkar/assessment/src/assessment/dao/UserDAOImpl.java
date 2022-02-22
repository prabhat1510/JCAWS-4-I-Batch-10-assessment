package assessment.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//import com.mysql.cj.xdevapi.Statement;

import assessment.data.User;

public class UserDAOImpl implements UserDAO {

	@Override
	public String checkuser(String user_name, String password) {
		String check_user = "Select username ,password from login where username =? and password =?";
		User user = new User();
		String url = "jdbc:mysql://localhost:3306/assessment"; 
		
		try {
			Connection conn = DriverManager.getConnection(url,"root","krutika28");
		   PreparedStatement preparedstatement = conn.prepareStatement(check_user);
		   preparedstatement.setString(1,user.getUser_name());
		   preparedstatement.setString(2,user.getPassword());
		   
		  if(password.equals(user.getPassword()))
				  {
			        return"login successfully";
				  }
		  else
		  {
			  return "invalid username or password";
		  }
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return "checking successfull";
		
	}
	

	@Override
	public List<User> getallUser() {
		String get_all_user = "select * from login";
		String url = "jdbc:mysql://localhost:3306/assessment";
		
	List<User> userlist = new ArrayList<User>();
	try {
		Connection conn = DriverManager.getConnection(url,"root","krutika28");
	    Statement statement = conn.createStatement(); 
	    ResultSet rs = statement.executeQuery(get_all_user);
	     while(rs.next())
	     {
	    	 User user = new User();
	    	 user.setUser_name(rs.getString("user_name"));
	    	 user.setPassword(rs.getString("password"));
	     }
		}
	catch(Exception e){
		e.printStackTrace();
	}
		return userlist;
	}

	
	

}
