package com.bookstore.Book_Store;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	
	@Autowired
	RestTemplate restTemplate;
	
	@PostMapping("/adduser")
	public String addUser(@RequestBody User user) {
		UserAddress userAddress=new UserAddress("Ghaziabad", "UP", "India");
		user.setUserAddress(userAddress);
		final String url="http://localhost:8585/book/getBook/1";
		Book book=restTemplate.getForObject(url, Book.class);
		user.setUserBooks(Arrays.asList(book));
		userService.addUser(user);
		return user.getUserName()+" user has been added succesfully";
	}
}
