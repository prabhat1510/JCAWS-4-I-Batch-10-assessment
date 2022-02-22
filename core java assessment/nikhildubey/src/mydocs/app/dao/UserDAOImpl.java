package mydocs.app.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import mydocs.app.data.User;
import mydocs.app.exceptions.IncorrectCredentialsException;
import mydocs.app.exceptions.UserCannotBeAddedException;
import mydocs.app.exceptions.UserNotAdminException;
import mydocs.app.exceptions.UserNotFoundException;
import mydocs.app.utils.DBConnectionUtils;
import mydocs.app.utils.QuerryMapper;

public class UserDAOImpl implements UserDAO {

	@Override
	public User loginUser(String userName, String password) throws IncorrectCredentialsException {
		User user = new User();
		try {
			PreparedStatement prepareStatement = DBConnectionUtils.getConnection()
					.prepareStatement(QuerryMapper.Login_USER);
			prepareStatement.setString(1, userName);
			prepareStatement.setString(2, password);
			ResultSet rs = prepareStatement.executeQuery();

		

			while (rs.next()) {

				user.setUserId(rs.getInt("userId"));
				user.setUserName(rs.getString("userName"));
				user.setPassword(rs.getString("password"));
				user.setAdmin(rs.getBoolean("isAdmin"));
				System.out.println("Hello "+userName);
				return user;
			}
			
			
			
			if (rs.getRow() == 0) {
				throw new IncorrectCredentialsException("username (or) password is incorrect");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return user;
	}

	@Override
	public String getUserName(User user) {
		return user.getUserName();
	}

	@Override
	public String getPassword(User user) {
		return user.getPassword();
	}

	@Override
	public boolean isAdmin(User user) {
		return user.isAdmin();
	}

	@Override
	public List<User> getAllUser() throws UserNotFoundException {
		User user2 = new User();
		List<User> userList = new ArrayList<>();
		
		

		try {
			Statement statement = DBConnectionUtils.getConnection().createStatement();
			ResultSet rs = statement.executeQuery(QuerryMapper.GET_ALL_USER);

			while (rs.next()) {
				
				user2.setUserId(rs.getInt("userId"));
				user2.setUserName(rs.getString("userName"));
				user2.setPassword(rs.getString("password"));
				user2.setAdmin(rs.getBoolean("isAdmin"));

				userList.add(user2);

			}
			
			if (rs.getRow() == 0) {
				throw new UserNotFoundException("No Users Found");
			}
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return userList;
	}

	@Override
	public Integer addUser(User user) {
		Integer row=0;
		try {
			PreparedStatement prepareStatement = DBConnectionUtils.getConnection()
					.prepareStatement(QuerryMapper.CREATE_USER);
			prepareStatement.setInt(1, user.getUserId());
			prepareStatement.setString(2, user.getUserName());
			prepareStatement.setString(3, user.getPassword());
			prepareStatement.setBoolean(4, user.isAdmin());
			row = prepareStatement.executeUpdate();
			
			System.out.println("User Added Successfully");
			
		} catch (SQLException e) {
			UserCannotBeAddedException ucbe = new UserCannotBeAddedException("User cannot be added some exception occured.");
			System.out.println(ucbe.getMessage());
		}
		return row;
		
	}

}
