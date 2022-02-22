package assessment.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import assessment.dto.UserCredential;
import assessment.exception.UserAlreadyPresentException;
import assessment.exception.UserNotAddedException;
import assessment.exception.UserNotFoundException;
import assessment.util.DBConnectionUtil;
import assessment.util.QuearyMapping;

public class LoginCheckDAOImpl implements LoginCheckDAO {

	@Override
	public UserCredential userLoginToAdmin(String userId, String password) throws UserNotFoundException {
		UserCredential userCredential = new UserCredential();
		try {
			PreparedStatement preparedStatement = DBConnectionUtil.getDBConnection().prepareStatement(QuearyMapping.GET_USER_BY_ID_PASS);
			preparedStatement.setString(1, userId);
			preparedStatement.setString(2, password);
			ResultSet rs = preparedStatement.executeQuery();
			
			if(rs.next()==false) {
				throw new UserNotFoundException();
			}else {
				userCredential.setUserId(rs.getString("userId"));
				userCredential.setPassword(rs.getString("password"));
			}
		} catch (UserNotFoundException unf) {
			throw unf;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userCredential;
	}

	@Override
	public String newUserAddition(UserCredential userCredential) throws UserNotAddedException, UserAlreadyPresentException {
		int row = 0;
		try {
			PreparedStatement preparedStatement = DBConnectionUtil.getDBConnection().prepareStatement(QuearyMapping.ADD_USER);
			preparedStatement.setString(1, userCredential.getUserId());
			preparedStatement.setString(2, userCredential.getPassword());
			
			row = preparedStatement.executeUpdate();
			if(row==0) {
				throw new UserAlreadyPresentException();
			}
		} catch (UserAlreadyPresentException uap) {
			throw uap;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return row +"User Added Successfully";
	}

	@Override
	public List<UserCredential> getAllCustomer() {
		List<UserCredential> userList = new ArrayList<UserCredential>();
		Statement statement;
		try {
			statement = DBConnectionUtil.getDBConnection().createStatement();
			ResultSet rs = statement.executeQuery(QuearyMapping.GET_ALL_USER);
			while(rs.next()) {
				UserCredential userCredential = new UserCredential();
				userCredential.setUserId(rs.getString("userId"));
				userCredential.setPassword(rs.getString("password"));
				
				userList.add(userCredential);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Comparator<UserCredential> nameComparator = (UserCredential u1, UserCredential u2)->u1.getUserId().compareTo(u2.getUserId());
		Collections.sort(userList,nameComparator);
		
		return userList;
	}

}
