package mydocs.app.ui;

import java.util.List;

import mydocs.app.data.User;

public interface MyDocsOps {
	
	public boolean login();
	
	public void registerUser();
	
	public List<User> getAllUser();

}
