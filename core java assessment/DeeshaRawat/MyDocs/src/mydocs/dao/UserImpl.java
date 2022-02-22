package mydocs.dao;

import java.util.List;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



import mydocs.data.User;

import mydocs.data.User;
import mydocs.exceptions.WrongPassword;


public class UserImpl implements UserDAO {

	@Override
	public User login(String userId, String password) {
		
		final String queryString= "SELECT username, password FROM user";
		try {
			String url = "jdbc:mysql://localhost:3306/mydocs";
			Connection con = DriverManager.getConnection(url, "root", "Dr16@Itachi74");
			PreparedStatement results = con.prepareStatement(queryString);
			User login = new User(userId, password);
			
		
//			ResultSet results = Statement.executeQuery(queryString);
			
			while (results).next()) {
	            String userId1 = results.getString("username");
	            String password1 =  results.getString("password");

	               if ((userId.equals(userId1)) && (password.equals(password1))) {

//	                  JOptionPane.showMessageDialog(null,"Successfully login");  
	            	   System.out.println("Successfully Login");
	            }else {

	             JOptionPane.showMessageDialog(null,"Username or password doesnot exist");
	            }
	            results.close();
			}

        }
        catch (SQLException e) {
 
            System.out.println(e);
        }
		return null;
	}

	@Override
	public List<User> Users() {
		try {
			String url = "jdbc:mysql://localhost:3306/mydocs";
			Connection con = DriverManager.getConnection(url, "root", "Dr16@Itachi74");

        }
        catch (SQLException e) {
 
            System.out.println(e);
        }
		return null;
	
	}

	
}
