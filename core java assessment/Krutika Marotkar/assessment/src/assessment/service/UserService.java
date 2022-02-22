package assessment.service;

import java.util.List;

import assessment.data.User;

public interface UserService {

	public String checkuser(String user_name,String password);

	public List<User> getallUser();

}
