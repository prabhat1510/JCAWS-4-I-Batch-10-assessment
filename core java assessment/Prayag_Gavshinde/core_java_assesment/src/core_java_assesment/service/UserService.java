package core_java_assesment.service;

import java.util.List;
import core_java_assesment.data.User;

public interface UserService {
	public User getUserByUsername(String username,String password);
	
	public List<User> getUsers();
}
