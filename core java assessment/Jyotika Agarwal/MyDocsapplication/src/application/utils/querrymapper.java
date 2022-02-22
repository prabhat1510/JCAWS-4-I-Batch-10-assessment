package application.utils;

public interface querrymapper {
	static final String REGISTERUSER = "insert into userlogin(userid,username,password) values(?,?,?)";
	static final String LOGINUSER = "select * from userlogin where username=? and userpassword=?";
	static final String GETALLUSERS = "select * from userlogin";
}
