package mydocsapp.dao;

import java.util.ArrayList;
import java.util.List;

import mydocsapp.dto.User;

public class UserDAOImpl implements UserDAO {
	
	List<User> userList = new ArrayList<User>();
	public User getUserById(Integer userId) {
		userList.add(new User(1,"Rajesh"));
		userList.add(new User(2,"Ramesh"));
		userList.add(new User(3,"Ragvesh"));
		userList.add(new User(4,"Ram"));
		userList.add(new User(5,"Ramlal"));
		userList.add(new User(6,"Ratnes"));
		userList.add(new User(7,"Raju"));
		userList.add(new User(8,"Bahubali"));
		

		userList.forEach(System.out::println);
		return null;
	}
	
	@Override
	public User getCustomerById(Integer customerId) {
		return null;
	}	
	
	@Override
	public List<User> getAllUsers() {
		return null;
	}

}