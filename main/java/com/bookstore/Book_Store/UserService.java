package com.bookstore.Book_Store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserRepo userRepo;

	public void addUser(User user) {
		userRepo.save(user);
	}
	
}
