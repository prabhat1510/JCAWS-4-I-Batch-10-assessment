package mydocs.Utils;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtils {

public static final String url = "jdbc:mysql://localhost:3306/mydocs";
	
    public static Connection getDBConnection()
	{
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, "root", "Mysql8.0");
		}catch (SQLException e) {
			e.printStackTrace();
		}
	
		return conn;
	}
}
