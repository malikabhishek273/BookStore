package com.bookstore.Book_Store;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
@Component
@Entity(name = "User")
public class User implements Serializable {
	@Id
	@Column(name = "userId")
	private int userId;

	@Column(name = "userName")
	private String userName;

	@Column(name = "userAge")
	private int userAge;

	@Embedded
	UserAddress userAddress;

	@OneToMany
	@JoinTable(name="userBook")
	@Column(name = "userBooks")
	private List<Book> userBooks = new ArrayList<>();

	User() {

	}
	
	

	public User(int userId, String userName, int userAge, UserAddress userAddress, List<Book> userBooks) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAge = userAge;
		this.userAddress = userAddress;
		this.userBooks = userBooks;
	}



	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	

	public List<Book> getUserBooks() {
		return userBooks;
	}

	public void setUserBooks(List<Book> userBooks) {
		this.userBooks = userBooks;
	}



	public UserAddress getUserAddress() {
		return userAddress;
	}



	public void setUserAddress(UserAddress userAddress) {
		this.userAddress = userAddress;
	}
	
	

}
