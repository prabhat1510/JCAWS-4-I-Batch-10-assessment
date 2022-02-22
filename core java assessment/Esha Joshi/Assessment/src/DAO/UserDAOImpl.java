package DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import main.models.User;
import main.utils.DBConnectionUtil;
import main.utils.QueryMapper;

public class UserDAOImpl implements UserDAO {

	@Override
	public UserDAO getUserByUsernameAndPassword(String username, String password) {
		try {
			PreparedStatement st = DBConnectionUtil.getDbConnection()
					.prepareStatement(QueryMapper.GET_USER_BY_USERNAME);
			st.setString(1, username);
			st.setString(2, password);
			User resUser = new User();
			ResultSet rs = st.executeQuery();
			if (rs.next()) {
				resUser.setUsername(rs.getString(1));
				resUser.setPassword(rs.getString(2));
				resUser.setRole(rs.getString(3));
			}
			return resUser;
		} catch (SQLException se) {
			se.printStackTrace();
			return null;
		}
	}

	@Override
	public List<User> getAllUsers() {
		try {
			PreparedStatement st = DBConnectionUtil.getDbConnection().prepareStatement(QueryMapper.GET_ALL_USERS);
			List<User> userList = new ArrayList<User>();
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				User user = new User();
				user.setUsername(rs.getString(1));
				user.setPassword(rs.getString(2));
				user.setRole(rs.getString(3));
				userList.add(user);
			}
			return userList;
		} catch (SQLException se) {
			se.printStackTrace();
			return null;
		}
	}

	@Override
	public Integer addUser(User user) {
		try {
			PreparedStatement st = DBConnectionUtil.getDbConnection().prepareStatement(QueryMapper.ADD_USER);
			st.setString(1, user.getUsername());
			st.setString(2, user.getPassword());
			st.setString(3, user.getRole());
			Integer rs = st.executeUpdate();
			return rs;
		} catch (SQLException se) {
			se.printStackTrace();
			return null;
		}
	}

	@Override
	public Integer deleteUserByUsername(String username) {
		try {
			PreparedStatement st = DBConnectionUtil.getDbConnection().prepareStatement(QueryMapper.DELETE_USER);
			st.setString(1, username);
			return st.executeUpdate();
		} catch (SQLException se) {
			se.printStackTrace();
			return null;
		}
	}

	@Override
	public Integer updateUserPassword(String password) {
		try {
			PreparedStatement st = DBConnectionUtil.getDbConnection()
					.prepareStatement(QueryMapper.UPDATE_USER_PASSWORD);
			st.setString(1, password);
			return st.executeUpdate();
		} catch (SQLException se) {
			se.printStackTrace();
			return null;
		}
	}

}


