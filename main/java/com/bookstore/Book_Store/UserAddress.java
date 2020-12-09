package com.bookstore.Book_Store;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class UserAddress {
	@Column(name = "userCity")
	private String userCity;
	
	@Column(name = "userState")
	private String userState;
	
	@Column(name = "userCountry")
	private String userCounrty;

	public UserAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserAddress(String userCity, String userState, String userCounrty) {
		super();
		this.userCity = userCity;
		this.userState = userState;
		this.userCounrty = userCounrty;
	}

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	public String getUserState() {
		return userState;
	}

	public void setUserState(String userState) {
		this.userState = userState;
	}

	public String getUserCounrty() {
		return userCounrty;
	}

	public void setUserCounrty(String userCounrty) {
		this.userCounrty = userCounrty;
	}

}
