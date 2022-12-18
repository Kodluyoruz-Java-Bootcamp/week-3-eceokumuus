package medium_clone.dao;

import java.util.ArrayList;
import java.util.List;

import medium_clone.model.User;

public class UserDao {
	private static List<User> userList = new ArrayList<User>();
	
	public void createUser(User user) {	
		userList.add(user);
	}
	
	public List<User> findAllUsers() {	
		return userList;
	}

}
