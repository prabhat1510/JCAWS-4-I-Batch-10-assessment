package core_java_assesment.dao;
import core_java_assesment.data.User;
import java.util.List;


public interface UserDAO {
	public User getUserByUsername(String username,String password);
	
	public List<User> getUsers();
}
