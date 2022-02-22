package logininformation.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtil {

private static final String URL="jdbc:mysql://localhost:3306/test";
	
	public static Connection getDBConnection() {
		
		Connection conn=null;
		try {
			conn=DriverManager.getConnection(URL,"root","Jaya@acro29");
		}
		catch(SQLException e){
			e.printStackTrace();
		
		}
		return conn;
}
}
