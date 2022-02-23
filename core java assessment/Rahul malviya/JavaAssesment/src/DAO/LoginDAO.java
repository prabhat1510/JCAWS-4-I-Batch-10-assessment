package DAO;



	import java.util.ArrayList;
	import java.util.List;

	import DTO.User;
	public interface LoginDao {

		public User Login(String uname , String pass);
		public List<User> UserList();

	}

