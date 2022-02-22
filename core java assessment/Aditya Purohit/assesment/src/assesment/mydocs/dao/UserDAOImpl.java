package assesment.mydocs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import assesment.mydoc.util.DBConnection;
import assesment.mydocs.data.User;
import assesment.mydocs.exception.IncorrectLoginException;



public class UserDAOImpl implements UserDAO {

	@Override
	public User userLogIn(User user) throws IncorrectLoginException {
		// TODO Auto-generated method stub
		String Login =("Select userId , password ,isAdmin from userlogin where userId=? and password=?");
		User userfetch = null ;
		try {
			 
			PreparedStatement stmt = DBConnection.getDBConnection().prepareStatement(Login);
			stmt.setString(1,user.getUserId());
			stmt.setString(2,user.getPassword());
			//stmt.setString(3,user.getAdmin());
			ResultSet rs = stmt.executeQuery(); 
			while(rs.next())
			{
				userfetch = new User(rs.getString("userId"),rs.getString("password"),rs.getString("isAdmin"));
				return userfetch;
			}
			if (userfetch==null)
				throw new IncorrectLoginException("Login Details Are Not Correct");
			
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<User> getAllUserDetails() {
		
				String GET_ALL_USERS =("select * from userlogin where isAdmin=?");
				List<User> userList = new ArrayList<User>();
				try {
				     PreparedStatement stmt = DBConnection.getDBConnection().prepareStatement(GET_ALL_USERS);
				    stmt.setString(1,"no");
				    ResultSet rs = stmt.executeQuery();
				    while(rs.next())
				    {
				    	User user = new User(rs.getString("userId"),rs.getString("password"),rs.getString("isAdmin"));
				    	userList.add(user);
				    }
				    
//				    if(userList.isEmpty())
//				    {
//				    	throw new CustomerNotFoundException("No Customer in Data base");
//				    }
				    

				 } catch (SQLException e) {
				    e.printStackTrace();
				}
				return userList;
				
				
		
	}

	
	
}
