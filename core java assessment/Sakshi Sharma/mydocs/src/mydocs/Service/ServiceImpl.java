package mydocs.Service;

import java.util.List;

import mydocs.Dao.Dao;
import mydocs.Dao.DaoImpl;
import mydocs.Data.User;


public class ServiceImpl implements Service {

	
	private DAO dao = new DaoImpl();
	@Override
	public User checkUser(String username, String password) {
		// TODO Auto-generated method stub
		return Dao.checkUser(username, password);
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return Dao.getUsers();
	}

}
