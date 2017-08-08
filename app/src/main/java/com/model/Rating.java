package com.model;

import java.io.Serializable;



/**
 * The persistent class for the rating database table.
 * 
 */

public class Rating implements Serializable {
	private static final long serialVersionUID = 1L;


	private String rateId;


	private int rateValue;


	private String userId;


	private Item item;

	public Rating() {
	}

	public String getRateId() {
		return this.rateId;
	}

	public void setRateId(String rateId) {
		this.rateId = rateId;
	}

	public int getRateValue() {
		return this.rateValue;
	}

	public void setRateValue(int rateValue) {
		this.rateValue = rateValue;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

}