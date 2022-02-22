package dao;


	import java.util.List;
	import mydocsapp.data.Users;
	import mydocsapp.service.UserService;
	import mydocsapp.service.UserServiceImpl;

	public interface UserDao {
		
		public List<Users> getAllUsers(String getUser);
		
		
		public String loginVerify(String userName,String password);
	}

}
