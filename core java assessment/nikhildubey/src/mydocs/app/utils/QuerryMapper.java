package mydocs.app.utils;

public interface QuerryMapper {
	
	public final static String Login_USER = "SELECT * FROM users WHERE userName = ? and password = ?";
	
	public final static String GET_ALL_USER = "SELECT * FROM users";
	
	public final static String CREATE_USER	=	"INSERT INTO users SET userId=?, userName = ?, password = ?, isAdmin =?";

}
