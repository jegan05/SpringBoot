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
	private Long userMoblieNo; 
	private String userAddress;
	private String userMailId;
	

	public User_Entity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User_Entity(int userId, String userName, Long userMoblieNo, String userAddress,String userMailId) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userMoblieNo = userMoblieNo;
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

	public Long getUserMoblieNo() {
		return userMoblieNo;
	}

	public void setUserMoblieNo(Long userMoblieNo) {
		this.userMoblieNo = userMoblieNo;
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
