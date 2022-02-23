package mydocs.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface DBUtils {
	
	static String url = "jdbc:mysql://localhost:3306/mydocs";
	static final String user = "root";
	static final String password = "1234";
	
	static Connection getDbConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

}
