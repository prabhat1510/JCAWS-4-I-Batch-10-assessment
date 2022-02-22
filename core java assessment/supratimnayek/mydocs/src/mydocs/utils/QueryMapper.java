package mydocs.utils;

public interface QueryMapper {
	
	static final String REGISTER_USER = "insert into users(user_id,user_name,user_password) values(?,?,?)";
	static final String LOGIN_USER = "select * from users where user_name=? and user_password=?";
	static final String GET_ALL_USERS = "select * from users";
}
