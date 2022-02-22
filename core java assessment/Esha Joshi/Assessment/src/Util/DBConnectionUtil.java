package Util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtil {
	private static final String url = "jdbc:mysql://localhost:3306/test";

	public static Connection getDbConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, "root", "root");
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		return con;
	}
}
