package mydocs.Dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import mydocs.Exception.UserNotFound;
import mydocs.Data.User;
import mydocs.Utils.DBConnectionUtils;
import mydocs.Utils.QueryMapper;

public class DaoImpl implements Dao {

	@Override
	public String checkUser(String username, String password) {
		String CHECK_USER = "select * from user where username = ? AND password=?";
		try
		{
			String url = "jdbc:mysql://localhost:3306/test";
			Connection conn = DriverManager.getConnection(url, "root", "Mysql8.0");
			Statement statement = conn.createStatement();
			ResultSet rs= statement.executeQuery(CHECK_USER);
		if(rs == null)
		{
			//throw new UserNotFound("User Not Found");
			System.out.println("User Not Found");
		}
		else
		{
			User user = new User();
			while(rs.next())
			{
				
			user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
			
				
			}
			String pass = user.getPassword();
			if(!password.equals(pass))
			{
				//throw new PasswordNotMatched("Password not matched , try again");
				System.out.println(password +" != "+ pass);
				System.out.println("Password not matched , try again");
			}
			else 
				return user;
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
		return null;
	}
		
		
		
		
	
	@Override
	public  List<User>  getUsers() {
		String GET_USER = "select * from user order by username";
		
		List<User> list= new ArrayList<User>();
		
		try {
			
			try {
				String url = "jdbc:mysql://localhost:3306/MyDocs";
				Connection conn = DriverManager.getConnection(url, "root", "Mysql8.0");
				Statement statement = conn.createStatement();
				ResultSet rs= statement.executeQuery(GET_USER);
			
			
			while(rs.next())
			{
				User user = new User();
				
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				
				list.add(user);
			}
			}
		}
		
	
		catch(SQLException e)
		{
			//e.printStackTrace();
		}
		
	}
		return list;	
	}
}
	