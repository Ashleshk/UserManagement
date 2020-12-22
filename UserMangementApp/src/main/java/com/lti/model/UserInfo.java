package com.lti.model;

public class UserInfo {
	private int userId;
	private String userName;
	private String userPassword;
	private String userEmail;
	private String userCity;
	private String userMobile;
	public UserInfo(String userName, String userPassword, String userEmail, String userCity,
			String userMobile) {
		this.userName = userName;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
		this.userCity = userCity;
		this.userMobile = userMobile;
	}
	public UserInfo(int id,String userName, String userPassword, String userEmail, String userCity,
			String userMobile) {
		this.userId=id;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
		this.userCity = userCity;
		this.userMobile = userMobile;
	}
	public UserInfo() {
		// TODO Auto-generated constructor stub
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
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserCity() {
		return userCity;
	}
	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}
	public String getUserMobile() {
		return userMobile;
	}
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}
	
	
}
