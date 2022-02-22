package mydocsapp.service;

import java.util.List;

import mydocsapp.dto.User;

public interface UserService {
			
			public User getUserById(Integer UserId);

			public List<User> getAllUsers();


}

