package mydocsapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import mydocsapp.data.Users;

public class UserDAOImpl implements UserDAO {
	
	@Override
	public List<Users> getAllUsers(String getUser) {
		String role="";
		String url = "jdbc:mysql://localhost:3308/training";
		String GET_ALL_USERS = "select * from users";
		String CHECK_ROLE = "select * from users where username = "+getUser;
		List<Users> UserList = new ArrayList<Users>();
		try {
			Connection conn = DriverManager.getConnection(url, "root", "root");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(GET_ALL_USERS);
			while(rs.next()) {
				Users user = new Users();
				user.setAadharNumber(rs.getLong(1));
				user.setName(rs.getString(2));
				user.setUserName(rs.getString(3));
				user.setPassword(rs.getString(4));
				user.setRole(rs.getString(5));
				role=rs.getString(5);
				UserList.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return UserList;
}
	@Override
	public String loginVerify(String userName, String password) {
		String USER_LOGIN ="select * from Users where Username=? and Password=?"; 
		try {
			String url = "jdbc:mysql://localhost:3308/training";
			Connection conn = DriverManager.getConnection(url, "root", "root");
			PreparedStatement preparedStatement = conn.prepareStatement(USER_LOGIN);
			preparedStatement.setString(1, userName);
			preparedStatement.setString(2, password);
			
			ResultSet rs = preparedStatement.executeQuery();
			if(rs.next()) {
				return userName;
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return "username (or) password is incorrect";
	}
}



