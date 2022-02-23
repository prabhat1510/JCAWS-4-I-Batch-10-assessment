package logininformation.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import logininformation.data.User;
import logininformation.util.DBConnectionUtil;
import logininformation.util.QuerryMapper;

public class UserDAOImpl implements UserDAO {

	@Override
	public User getUserByUserNameAndPassword(String userName, String password)   {
		// TODO Auto-generated method stub
		try {
				PreparedStatement preparedStatement = DBConnectionUtil.getDBConnection().prepareStatement(QuerryMapper.GET_USER_BY_USERNAME);
	preparedStatement.setString(1, userName);
		preparedStatement.setString(2, password);
		User resultUser = new User();
		ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			resultUser.setUserName(resultSet.getString(1));
			resultUser.setPassword(resultSet.getString(2));
			resultUser.setUserRoles(resultSet.getString(3));
		}
		return resultUser;
	} catch (SQLException e) {
		e.printStackTrace();
	return null;
	}
	
	}

	@Override
	public List<User> getAllUsers() {
	
		try {
			PreparedStatement preparedStatement = DBConnectionUtil.getDBConnection().prepareStatement(QuerryMapper.GET_ALL_USERS);
			List<User> userList = new ArrayList<User>();
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				User user = new User();
				user.setUserName(resultSet.getString(1));
				user.setPassword(resultSet.getString(2));
				user.setUserRoles(resultSet.getString(3));
				userList.add(user);
			}
			return userList;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	

	@Override
	public Integer addUser(User user) {
		try {
			PreparedStatement preparedStatement = DBConnectionUtil.getDBConnection().prepareStatement(QuerryMapper.ADD_USER);
			preparedStatement.setString(1, user.getUserName());
			preparedStatement.setString(2, user.getPassword());
			preparedStatement.setString(3, user.getUserRoles());
			Integer resultSet = preparedStatement.executeUpdate();
			return resultSet;
		} catch (SQLException e) {
			e.printStackTrace();
	return null;
		}	}

	@Override
	public Integer deleteUserByUserName(String userName) {
		try {
			PreparedStatement preparedstatement = DBConnectionUtil.getDBConnection().prepareStatement(QuerryMapper.DELETE_USER);
			preparedstatement.setString(1, userName);
			return preparedstatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Integer updateUserPassword(String password) {
		try {
			PreparedStatement preparedStatement = DBConnectionUtil.getDBConnection()
					.prepareStatement(QuerryMapper.UPDATE_USER_PASSWORD);
			preparedStatement.setString(1,password);
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			
		}return null;
	}

}
