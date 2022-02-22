package core_java_assesment.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import core_java_assesment.data.User;


public class UserDAOImpl implements UserDAO {

	@Override
	public User getUserByUsername(String username,String password) {
		User user = new User();
		final String GET_USER = "select * from user_login where username = ? and password = ?";
		try {
			String url = "jdbc:mysql://localhost:3306/assesment";
			Connection conn = DriverManager.getConnection(url, "root", "root");
			PreparedStatement preparedStatement = conn.prepareStatement(GET_USER);
			preparedStatement.setString(1, username);
			preparedStatement.setString(2,password);
			ResultSet rs = preparedStatement.executeQuery();
			int row = 0;
			
			while(rs.next())
			{
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				row = preparedStatement.executeUpdate();
			}
			String pass = user.getPassword();
			if(!pass.equals(password))
			{
				//throw new PasswordNotMatched("Password not matched , try again");
				System.out.println(password +" != "+ pass);
				System.out.println("Password not matched , try again");
			}
			else 
				return user;
		
		
		}catch(SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<User> getUsers() {
		String GET_ALL_USERS= "select * from user_login order by username";
		
		
		List<User> userList= new ArrayList<User>();
		try {
		String url = "jdbc:mysql://localhost:3306/assesment";
		Connection conn = DriverManager.getConnection(url, "root", "Password@123");
		Statement statement = conn.createStatement();
		ResultSet rs= statement.executeQuery(GET_ALL_USERS);
		
		
		while(rs.next())
		{
			User user = new User();
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
		
			userList.add(user);
		}
		}
		catch (SQLException e){
			//e.printStackTrace();		
		}
		return userList;
	
	}

}
