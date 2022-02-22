package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import data.User;
import exceptions.UnauthorizedAccessException;
import exceptions.UserNotFoundException;
import utils.DBUtils;
import utils.QueryMapper;

public class UserDaoImpl implements UserDao {
	
	Connection conn = DBUtils.getDbConnection();

	@Override
	public Integer registerUser(User user) throws Exception {
		
		int row = 0;
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(QueryMapper.REGISTER_USER);
			preparedStatement.setInt(1, user.getUser_id());
			preparedStatement.setString(2, user.getUser_name());
			preparedStatement.setString(3, user.getPassword());
			
			row = preparedStatement.executeUpdate();
		} catch (Exception e) {
			
			throw e;
		}
		
		
		return row;
	}
	

	@Override
	public String loginUser(String user_name, String password) throws UserNotFoundException{
		
		String result = "";
		
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(QueryMapper.LOGIN_USER);
			preparedStatement.setString(1, user_name);
			preparedStatement.setString(2, password);
			
			ResultSet rs = preparedStatement.executeQuery();
			
			if(rs.next()==false) throw new UserNotFoundException("username or password is incorrect");
			else {
				result = "Hello "+user_name;
			}
			
		}catch(UserNotFoundException unfe) {
			throw unfe;
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	

	@Override
	public List<User> showUsers(String user_name, String password) throws UserNotFoundException,SQLException,UnauthorizedAccessException {
		
		List<User> userList = new ArrayList<>();
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(QueryMapper.LOGIN_USER);
			preparedStatement.setString(1, user_name);
			preparedStatement.setString(2, password);
			
			ResultSet rs = preparedStatement.executeQuery();
			
			if(rs.next()==false) throw new UserNotFoundException("username or password is incorrect");
			else {
				Integer admin_access = rs.getInt(4);
				if(admin_access==1) {
					PreparedStatement newPreparedStatement = conn.prepareStatement(QueryMapper.GET_ALL_USERS);
					ResultSet newRs = newPreparedStatement.executeQuery();
					if (!newRs.next()) {
						throw new UserNotFoundException("No Records Found");
					} 
					else {
						do {
							userList.add(new User(newRs.getInt(1),newRs.getString(2),newRs.getString(3)));
						} while (newRs.next()); 
					}
				}else {
					throw new UnauthorizedAccessException("Unauthorized Access");
				}
			}
		} catch (SQLException e) {
			throw e;
		} catch (UserNotFoundException unfe) {
			throw unfe;
		} catch(UnauthorizedAccessException uae) {
			throw uae;
		}
		
		return userList;
	}

}
