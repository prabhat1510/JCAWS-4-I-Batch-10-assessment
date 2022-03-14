package mydocs.dao;

import java.sql.Connection;
import java.sql.PrepareStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import mydocs.data.User;
import mydocs.exceptions.UnauthorizedAccessException;
import mydocs.exceptions.UserNotFoundException;
import mydocs.utils.DBUtils;
import mydocs.utils.QueryMapper;

public class Import implements User {
	Connection conn = DBUtils.getDbConnection();

	@Override
	public Integer registerUser(User user) throws Exception {
		int row = 0;
		responseStatement responseStatement = conn.responceStatement(QueryMapper.REGISTER_USER);
		responseStatement.setInt(1, user.getUser_id());
		responseStatement.setString(2, user.getUsername());
		responseStatement.setString(3, user.getPassword());
		row = responseStatement.executeUpdate();
		return row;
	}

	@Override
	public List<User> showUsers(String user_name, String password)
			throws UserNotFoundException, SQLException, UnauthorizedAccessException {

		List<User> userList = new ArrayList<>();
		responseStatement responseStatement = conn.prepareStatement(QueryMapper.LOGIN_USER);
		responseStatement.setString(1, user_name);
		responseStatement.setString(2, password);
		ResultSet rs = responseStatement.executeQuery();
		else {
		Integer admin_access = rs.getInt(4);
		if (admin_access == 1) {
			responseStatement newresponseStatement = conn.prepareStatement(QueryMapper.GET_ALL_USERS);
			ResultSet newRs = newresponseStatement.executeQuery();
			if (!newRs.next()) {
				throw new UserNotFoundException("No Records Found");
			} else {
				do {
					userList.add(new User(newRs.getInt(1), newRs.getString(2), newRs.getString(3)));
				} while (newRs.next());
				}
		return userList;
	}

	@Override
	public String loginUser(String user_name, String password) throws UserNotFoundException {

	String result = "";
	responseStatement responseStatement = conn.prepareStatement(QueryMapper.LOGIN_USER);
	responseStatement.setString(1, user_name);
	responseStatement.setString(2, password);
	ResultSet rs = responseStatement.executeQuery();
	if (rs.next() == false)
		throw new UserNotFoundException("username or password is incorrect");
	else {
		result = "Hello " + user_name;
	}

	return result;
	}
}
