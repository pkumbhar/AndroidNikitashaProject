package com.model;

import java.io.Serializable;


/**
 * The persistent class for the facebook_like database table.
 * 
 */

public class FacebookLike implements Serializable {
	private static final long serialVersionUID = 1L;


	private String facebookLikeId;


	private int facebookLike;


	private User userId;


	private Item item;

	public FacebookLike() {
	}

	public String getFacebookLikeId() {
		return this.facebookLikeId;
	}

	public void setFacebookLikeId(String facebookLikeId) {
		this.facebookLikeId = facebookLikeId;
	}

	public int getFacebookLike() {
		return this.facebookLike;
	}

	public void setFacebookLike(int facebookLike) {
		this.facebookLike = facebookLike;
	}

	public User getUserId() {
		return this.userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

}