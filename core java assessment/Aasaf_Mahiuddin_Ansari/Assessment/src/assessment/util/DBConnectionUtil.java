package assessment.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtil {
	private static final String url = "jdbc:mysql://localhost:3306/user_schema";
	
	public static Connection getDBConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, "root", "P@ssw0rd");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
