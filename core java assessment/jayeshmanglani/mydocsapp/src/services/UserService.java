package services;

	import java.util.List;
	import mydocsapp.data.Users;

	public interface UserService {
		
		public List<Users> getAllUsers(String getUser);
		
		public String loginVerify(String userName,String password);
	}

}
