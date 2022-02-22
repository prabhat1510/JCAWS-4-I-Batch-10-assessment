package assessmentJCAWS.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtil {
	
private static final String URL="jdbc:mysql://localhost:3306/ods";
	

	public static Connection getDBConnection() {
		
		Connection conn=null;
		try {
			conn=DriverManager.getConnection(URL, "root", "Jathartha@22");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

}
