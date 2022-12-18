package medium_clone;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import medium_clone.service.UserService;


@Configuration

public class BeanConfig {
	
	@Bean
	public UserService userService() {
		return new UserService();
	}
	
	

}
