package assessmentJCAWS.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import assessmentJCAWS.data.User;
import assessmentJCAWS.exception.UnauthorisedAccessException;
import assessmentJCAWS.exception.UserNotFoundException;
import assessmentJCAWS.util.DBConnectionUtil;
import assessmentJCAWS.util.QuerryMapper;



public class UserDaoImpl implements UserDao {
	
	Connection conn = DBConnectionUtil.getDBConnection();

	@Override
	public Integer registerUser(User user) throws Exception {
		
		int row = 0;
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(QuerryMapper.REGISTER_USER);
			preparedStatement.setInt(1, user.getSerialNo());
			preparedStatement.setString(2, user.getUsername());
			preparedStatement.setString(3, user.getPassword());
			
			row = preparedStatement.executeUpdate();
		} catch (Exception e) {
			
			throw e;
		}
		
		
		return row;
	}
	

	@Override
	public String loginUser(String username, String password) throws UserNotFoundException{
		
		String result = "";
		
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(QuerryMapper.LOGIN_USER);
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
	public List<User> showUsers(String username, String password) throws UserNotFoundException,SQLException,UnauthorisedAccessException {
		
		List<User> userList = new ArrayList<>();
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(QuerryMapper.LOGIN_USER);
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			
			ResultSet rs = preparedStatement.executeQuery();
			
			if(rs.next()==false) throw new UserNotFoundException("username or password is incorrect");
			else {
				Integer admin_access = rs.getInt(4);
				if(admin_access==1) {
					PreparedStatement newPreparedStatement = conn.prepareStatement(QuerryMapper.GET_ALL_USERS);
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
					throw new UnauthorisedAccessException("Unauthoried exception");
				}
			}
		} catch (SQLException e) {
			throw e;
		} catch (UserNotFoundException unfe) {
			throw unfe;
		} catch(UnauthorisedAccessException uae) {
			throw uae;
		}
		
		return userList;
	}




	

}
