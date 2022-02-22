package main.utils;

public interface QueryMapper {
	public static final String GET_USER_BY_USERNAME = "Select * from user where username=? and password=?";
	public static final String GET_ALL_USERS = "Select * from user order by username asc";
	public static final String DELETE_USER = "Delete from user where username=?";
	public static final String ADD_USER = "Insert into user Values(?,?,?)";
	public static final String UPDATE_USER_PASSWORD = "Update user set password=?";
}
