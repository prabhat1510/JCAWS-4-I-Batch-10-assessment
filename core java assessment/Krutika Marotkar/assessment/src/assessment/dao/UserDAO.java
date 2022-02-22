package assessment.dao;

import java.util.List;

import assessment.data.User;

public interface UserDAO {
 
	public String checkuser(String user_name,String password);
	public List<User> getallUser();
	
}
