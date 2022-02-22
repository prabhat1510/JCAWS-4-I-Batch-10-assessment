package assessment.util;

public interface QuearyMapping {
	public static final String GET_USER_BY_ID_PASS = "select * from user_schema where userId=? and password=?";
	public static final String ADD_USER = "INSERT INTO user_schema(userId, password) VALUES(?,?)";
	public static final String GET_ALL_USER = "select * from user_schema";
}
