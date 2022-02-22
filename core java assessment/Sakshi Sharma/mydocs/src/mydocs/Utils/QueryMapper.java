package mydocs.Utils;

public class QueryMapper {
	public static final String CHECK_USER = "select * from user where username = ? AND password=?";
	
	public static final String GET_USER = "select * from user order by username=?";

}
