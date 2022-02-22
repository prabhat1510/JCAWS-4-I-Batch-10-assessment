package assessmentJCAWS.util;

public interface QuerryMapper {
	
	static final String REGISTER_USER = "insert into user(SerialNo.,username,password) values(?,?,?)";
	static final String LOGIN_USER = "select * from user where username=? and password=?";
	static final String GET_ALL_USERS = "select * from user";

}
