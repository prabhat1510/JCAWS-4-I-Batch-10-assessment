package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DTO.User;
import customException.PasswordNotMatched;
import customException.UserNotFound;



public class LoginDAOImpl implements LoginDao {

	@Override
	public User Login(String uname, String pass)  {
		// TODO Auto-generated method stub
		String query="Select * from login_details where username='"+uname+"'" ;
		
		try {
			String url = "jdbc:mysql://localhost:3306/MyDocs";
			Connection conn = DriverManager.getConnection(url, "root", "Password@123");
			Statement statement = conn.createStatement();
			ResultSet rs= statement.executeQuery(query);
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
					
					
					user.setUserId(rs.getInt(1));
					user.setUserName(rs.getString("username"));
					user.setPassword(rs.getString("password"));
					user.setIs_admin(rs.getBoolean(4));
					
				}
				String password = user.getPassword();
				if(!password.equals(pass))
				{
					//throw new PasswordNotMatched("Password not matched , try again");
					System.out.println(password +" != "+ pass);
					System.out.println("Password not matched , try again");
				}
				else 
					return user;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<User> UserList() {
		String GET_ALL_USERS= "select * from login_details order by username";
		
		
		List<User> userList= new ArrayList<User>();
		try {
		String url = "jdbc:mysql://localhost:3306/MyDocs";
		Connection conn = DriverManager.getConnection(url, "root", "Password@123");
		Statement statement = conn.createStatement();
		ResultSet rs= statement.executeQuery(GET_ALL_USERS);
		
		
		while(rs.next())
		{
			User user = new User();
			user.setUserId(rs.getInt(1));
			user.setUserName(rs.getString("username"));
			user.setPassword(rs.getString("password"));
			user.setIs_admin(rs.getBoolean(4));
			userList.add(user);
		}
		}
		catch (SQLException e){
			//e.printStackTrace();		
		}
		return userList;
	}

	
	
}
