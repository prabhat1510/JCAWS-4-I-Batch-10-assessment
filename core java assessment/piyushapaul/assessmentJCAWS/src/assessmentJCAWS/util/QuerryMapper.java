package assessmentJCAWS.util;

public interface QuerryMapper {
	
	static final String REGISTER_USER = "insert into users(SerialNo.,username,password) values(?,?,?)";
	static final String LOGIN_USER = "select * from users where username=? and userpassword=?";
	static final String GET_ALL_USERS = "select * from user";

}
