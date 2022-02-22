package jdbc.assesment.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Statement;

import jdbc.assesment.data.User;

public class UserDaoImpl implements UsersDao {

	@Override
	public Integer addUser(User user) {
		// TODO Auto-generated method stub
		String ADD_USER ="INSERT INTO USER(userName,password) VALUES(?,?)"; 
		int row = 0;
		try {
			String url = "jdbc:mysql://localhost:3306/test";
			Connection conn = DriverManager.getConnection(url, "root", "1234");
			PreparedStatement preparedStatement = conn.prepareStatement(ADD_USER);
			preparedStatement.setString(1, user.getUserName());
			preparedStatement.setString(2, user.getPassword());
			row = preparedStatement.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return row;
		
	}

	
	

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		
		String GET_ALL_USER ="select * from user";
		String url = "jdbc:mysql://localhost:3306/test";
		List<User> customerList =new ArrayList<User>();
		try {
			Connection conn = DriverManager.getConnection(url, "root", "1234");
			Statement statement= (Statement) conn.createStatement();

			ResultSet rs= ((java.sql.Statement) statement).executeQuery(GET_ALL_USER);
			
			while(rs.next())
			{

				String userName= rs.getString("userName");
				String password=rs.getString("password");
				
				System.out.println("Username is: "+userName);
				System.out.println("Password is: "+password);

		} 
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean checkUser(User user) {
		// TODO Auto-generated method stub
		
		
		return false;
	}

}
