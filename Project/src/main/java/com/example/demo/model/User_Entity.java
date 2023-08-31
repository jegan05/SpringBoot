package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User_Entity 
{
	@Id
	private int userId;
	private String userName;
	private Long userMobileNo; 
	private String userAddress;
	private String userMailId;
	

	public User_Entity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User_Entity(int userId, String userName, Long userMobileNo, String userAddress,String userMailId) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userMobileNo = userMobileNo;
		this.userAddress = userAddress;
		this.userMailId=userMailId;
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

	public Long getUserMobileNo() {
		return userMobileNo;
	}

	public void setUserMobileNo(Long userMobileNo) {
		this.userMobileNo = userMobileNo;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	
	public String getUserMailId() {
		return userMailId;
	}
	
	public void setUserMailId(String userMailId) {
		this.userMailId = userMailId;
	}
}
