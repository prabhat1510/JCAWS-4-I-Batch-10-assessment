package application.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import application.data.UserLogin;
import application.utils.DButils;
import application.utils.querrymapper;
import exceptionhandle.UnauthorizedAccessException;
import exceptionhandle.UserNotFoundException;

public class UserDAOImpl implements UserDAO {
	Connection conn = DButils.getDBconnection();
	@Override
	public Integer registerUser(UserLogin user) throws Exception {
		int row = 0;
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(querrymapper.REGISTERUSER);
			preparedStatement.setInt(1, user.getUserid());
			preparedStatement.setString(2, user.getUsername());
			preparedStatement.setString(3, user.getPassword());
			
			row = preparedStatement.executeUpdate();
		} catch (Exception e) {
			
			throw e;
		}
		
		
		return row;
	}

	@Override
	public String loginUser(String username, String password) throws UserNotFoundException {
String result = "";
		
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(querrymapper.LOGINUSER);
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			
			ResultSet rs = preparedStatement.executeQuery();
			
			if(rs.next()==false) throw new UserNotFoundException("username or password is incorrect");
			else {
				result = "Hello "+username;
			}
			
		}catch(UserNotFoundException unfe) {
			throw unfe;
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public List<UserLogin> showUsers(String username, String password)
			throws UserNotFoundException, SQLException, UnauthorizedAccessException {
		List<UserLogin> userList = new ArrayList<>();
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(querrymapper.LOGINUSER);
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			
			ResultSet rs = preparedStatement.executeQuery();
			
			if(rs.next()==false) throw new UserNotFoundException("username or password is incorrect");
			else {
				Integer admin_access = rs.getInt(4);
				if(admin_access==1) {
					PreparedStatement newPreparedStatement = conn.prepareStatement(querrymapper.GETALLUSERS);
					ResultSet newRs = newPreparedStatement.executeQuery();
					if (!newRs.next()) {
						throw new UserNotFoundException("No Records Found");
					} 
					else {
						do {
							userList.add(new UserLogin(newRs.getString(3),newRs.getString(2),newRs.getInt(1)));
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
