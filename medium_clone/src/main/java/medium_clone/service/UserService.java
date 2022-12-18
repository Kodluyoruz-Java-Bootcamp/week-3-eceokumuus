package medium_clone.service;

import java.util.List;

import medium_clone.model.User;
import medium_clone.dao.UserDao;

public class UserService {
	private UserDao userDao = new UserDao();
	
	public void createUser(User user) {
		System.out.println("ben bir userDao objesiyim:" + userDao.toString());

		if (user.getPassword().length() < 5) {
			System.out.println("Şifre en az 5 karakterli olmalı");
		}
		userDao.createUser(user);
	}

	public List<User> getAllUser() {
		return userDao.findAllUsers();
	}

	public void printAllUser() {

		getAllUser().forEach(user -> System.out.println(user.getName()));

	}


}
