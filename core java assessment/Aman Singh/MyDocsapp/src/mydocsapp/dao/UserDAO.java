package mydocsapp.dao;

import java.util.List;

import mydocsapp.dto.User;

public interface UserDAO {
	public User getCustomerById(Integer customerId);

	User getUserById(Integer userId);

	public List<User> getAllUsers();
}