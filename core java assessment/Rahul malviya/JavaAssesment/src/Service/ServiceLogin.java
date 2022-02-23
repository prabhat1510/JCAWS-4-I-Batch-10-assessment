package Service;


	import java.util.List;

	import DTO.User;

	public interface ServiceLogin {


		public User Login(String uname , String pass);
		public List<User> UserList();
	}

