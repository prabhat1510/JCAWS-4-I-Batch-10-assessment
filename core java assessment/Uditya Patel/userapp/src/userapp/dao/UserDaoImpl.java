package userapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import userapp.data.User;
import userapp.exception.UserNotFoundException;

public class UserDaoImpl implements UserDao {

	@Override
	public Integer addUser(User user) {
		String ADD_USER ="INSERT INTO USER(userId,userPassword,isAdmin) VALUES(?,?,?)";
		int row = 0;
		try {
			String url = "jdbc:mysql://localhost:3306/test";
			Connection conn = DriverManager.getConnection(url, "root", "uditya@123");
			PreparedStatement preparedStatement = conn.prepareStatement(ADD_USER);
			preparedStatement.setString(1, user.getUserId());
			preparedStatement.setString(2, user.getUserPassword());
			preparedStatement.setBoolean(3, user.getAdmin());

			row = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return row;
	}

	@Override
	public User loginUser(String userId, String userPassword) throws UserNotFoundException {
		final String GET_USER_BY_ID = "select * from user where userId=? and userPassword=?";
		User user = new User();
		try {
			String url = "jdbc:mysql://localhost:3306/test";
			Connection conn = DriverManager.getConnection(url, "root", "uditya@123");
			PreparedStatement preparedStatement = conn.prepareStatement(GET_USER_BY_ID);
			preparedStatement.setString(1,  userId);
			preparedStatement.setString(2,  userPassword);
			ResultSet rs = preparedStatement.executeQuery();
			if(rs.next()) {
				
				user.setUserId(rs.getString(1));
				user.setUserPassword(rs.getString("userPassword"));
				user.setAdmin(rs.getBoolean("isAdmin"));
				return user;
				
			}
			else {
				throw new UserNotFoundException("username (or) password is incorrect");
			}
		} catch (SQLException e) {
			throw new UserNotFoundException("username (or) password is incorrect");
		}
	}

	@Override
	public User isAdmin(String userId, String userPassword) {
		final String GET_USER_BY_ID = "select * from user where userId=? and userPassword=?";
		User user = new User();
		String url = "jdbc:mysql://localhost:3306/test";
		try {
			Connection conn = DriverManager.getConnection(url, "root", "uditya@123");
			PreparedStatement preparedStatement = conn.prepareStatement(GET_USER_BY_ID);
			preparedStatement.setString(1,  userId);
			preparedStatement.setString(2,  userPassword);
			ResultSet rs = preparedStatement.executeQuery();
			if(rs.next()) {
				
				user.setUserId(rs.getString(1));
				user.setUserPassword(rs.getString("userPassword"));
				user.setAdmin(rs.getBoolean("isAdmin"));
			
			
			}
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return user;

	}

	@Override
	public List<User> getAllusers() {
		String GET_ALL_USERS = "select * from user";
		String url = "jdbc:mysql://localhost:3306/test";
		List<User> userList = new ArrayList<>();
		
		try {
			Connection conn = DriverManager.getConnection(url, "root", "uditya@123");
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(GET_ALL_USERS);
			while(rs.next()) {
				User user = new User();
				user.setUserId(rs.getString(1));
				user.setUserPassword(rs.getString("userPassword"));
				user.setAdmin(rs.getBoolean("isAdmin"));
				userList.add(user);
				
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return userList;
	}

}
