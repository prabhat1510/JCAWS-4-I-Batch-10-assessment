package mydocsapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	private static final String URL="jdbc:mysql://localhost:3306/assigment";
	
	public static Connection getBDConnection() {
		Connection conn =null;
		try {
		 conn = DriverManager.getConnection(URL, "root", "password");
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
		
	}
}
