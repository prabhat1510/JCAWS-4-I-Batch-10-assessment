package mydocs.dao;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import mydocs.data.User;
import mydocs.exceptions.UnauthorizedAccessException;
import mydocs.exceptions.UserNotFoundException;

class UserDaoTest {
	
	UserDao userDao = new UserDaoImpl();

	@Test
	@Disabled
	void testRegisterUser() {
		User user = new User(3,"Asif","2345");
		Integer result = 0;
		try {
			result = userDao.registerUser(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		assertEquals(result,1);
//		assertNotEquals(result, 1); // for duplicate entry
	}
	
	@Test
	@Disabled
	void loginUserTest() {
		try {
			String res = userDao.loginUser("Supratim", "123");
			System.out.println(res);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	void showUserTest() {
		try {
			List<User> userList = userDao.showUsers("Supratim", "1234");// throws exception if not admin
			userList.forEach(System.out::println);
		} catch (UserNotFoundException | SQLException | UnauthorizedAccessException e) {
			
			System.out.println(e.getMessage());
		}
	}
	
	
	

}
