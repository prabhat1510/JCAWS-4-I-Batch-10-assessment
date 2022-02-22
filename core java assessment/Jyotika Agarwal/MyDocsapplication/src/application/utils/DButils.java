package application.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButils {
	 private static final String url = "jdbc:mysql://localhost:3306/bms_dl";
	    public static Connection getDBconnection(){
	    	Connection conn=null;
	    	try {
			 conn = DriverManager.getConnection(url, "root", "password");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return conn;
}
}