package com.model;

import java.io.Serializable;
import java.util.List;




/**
 * The persistent class for the user database table.
 * 
 */

public class User implements Serializable {
	private static final long serialVersionUID = 1L;


	private String userId;


	private String emailId;


	private String userName;


	private List<FacebookLike> facebookLikeList;
	
	
	
	public List<FacebookLike> getFacebookLikeList() {
		return facebookLikeList;
	}

	public void setFacebookLikeList(List<FacebookLike> facebookLikeList) {
		this.facebookLikeList = facebookLikeList;
	}

	public User() {
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}