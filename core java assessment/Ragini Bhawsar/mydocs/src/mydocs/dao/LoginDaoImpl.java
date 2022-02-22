package mydocs.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import mydocs.data.Login;
import mydocs.util.DBConnectionUtils;
import mydocs.util.QueryMapper;

public class LoginDaoImpl implements LoginDao {

	@Override
	public Login checkUser(String username, String password) {
		
		Login login = new Login();
        try {
			
			PreparedStatement preparedStatement = DBConnectionUtils.getDBConnection().prepareStatement(QueryMapper.CHECK_USERNAME_PASSWORD);
			preparedStatement.setString(1, username);
			ResultSet rs = preparedStatement.executeQuery();
			if(rs == null)
			{
				System.out.println("User Not Found");
			}
			else
			{
			while(rs.next()) {
				
				login.setUsername(rs.getString("username"));
				login.setPassword(rs.getString("password"));
				
				String pw = login.getPassword();
				if(!pw.equals(password))
				{
					
					System.out.println(password +" != "+ password);
					System.out.println("Password not matched , try again");
				}
				else 
					return login;
				}
			}
	     } catch (SQLException e) {
				e.printStackTrace();
	     }	
     return null;	
	   
}

	@Override
	public List<Login> getAllUsers() {
		
		List<Login> list= new ArrayList<Login>();
		try {
		PreparedStatement preparedStatement = DBConnectionUtils.getDBConnection().prepareStatement(QueryMapper.GET_ALL_USERS);
		ResultSet rs = preparedStatement.executeQuery();
		
		
		while(rs.next())
		{
			Login login = new Login();
			login.setUsername(rs.getString("username"));
			login.setPassword(rs.getString("password"));
			
			list.add(login);
		}
		}
		catch (SQLException e){
				
		}
		return list;
	}	
		
}