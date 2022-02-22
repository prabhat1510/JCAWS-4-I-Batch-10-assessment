package mydocsapp.util;

public class QueryMapper {
	public static final String REGISTER_USER = "insert into user(user_id,user_name,user_password) values(?,?,?)";
	public static final String LOGIN_USER = "select * from user where user_name=? and user_password=?";
	public static final String GET_ALL_USERS = "select * from user";
}
