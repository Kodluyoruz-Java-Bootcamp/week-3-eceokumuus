package medium_clone;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import medium_clone.model.Blog;
//import medium_clone.service.BlogService;
import medium_clone.model.User;
import medium_clone.service.UserService;

public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);

		User userEce = prepareUser("Ece", "eceok@gmail.com", "Ece12345678");
		User userFatih = prepareUser("Fatih", "fcg@gmail.com", "Ece12345");

		UserService userService = applicationContext.getBean(UserService.class);
		
		userService.createUser(userEce);
		userService.createUser(userFatih);
		userService.printAllUser();
		

	}

	private static User prepareUser(String name, String email, String password) {
		User user = new User(name, email, password);
		return user;
	}

}
