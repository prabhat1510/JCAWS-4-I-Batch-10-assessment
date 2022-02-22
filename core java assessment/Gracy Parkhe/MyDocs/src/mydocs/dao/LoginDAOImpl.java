package mydocs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import mydocs.data.LoginDetails;
public class LoginDAOImpl implements LoginDAO{

//	@Override
	public void checkLogin(String f, String s) {
		// TODO Auto-generated method stub
		final String queryString= "SELECT username, password FROM user";
//		String url = "jdbc:mysql://localhost:3306/user";
//		Connection conn = DriverManager.getConnection(url, "root", "Gracy@15");
//		PreparedStatement results = conn.prepareStatement(queryString);
//		LoginDetails login = new LoginDetails(s, f);
		
//		final String queryString= "SELECT username, password FROM user";
		try {
			
			String url = "jdbc:mysql://localhost:3306/user";
			Connection conn = DriverManager.getConnection(url, "root", "Gracy@15");
			PreparedStatement results = conn.prepareStatement(queryString);
			LoginDetails login = new LoginDetails(s, f);
			
		
//			ResultSet results = Statement.executeQuery(queryString);
			
			while (results.next()) {
	            String username = results.getString("username");
	            String password =  results.getString("password");

	               if ((f.equals(username)) && (s.equals(password))) {

//	                  JOptionPane.showMessageDialog(null,"Successfully login");  
	            	   System.out.println("Successfully Login");
	            }else {

	             JOptionPane.showMessageDialog(null,"Username or password doesnot exist");
	            }
	            results.close();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
