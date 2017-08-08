package com.model;

import java.io.Serializable;



/**
 * The persistent class for the sales_bill_detail database table.
 * 
 */

public class SalesBillDetail implements Serializable {
	private static final long serialVersionUID = 1L;


	private String salesBillDetailId;

	private double price;

	private double quantity;


	private double totalPrice;


	private Item item;


	private SalesBill salesBill;

	public SalesBillDetail() {
	}

	public String getSalesBillDetailId() {
		return this.salesBillDetailId;
	}

	public void setSalesBillDetailId(String salesBillDetailId) {
		this.salesBillDetailId = salesBillDetailId;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getQuantity() {
		return this.quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public SalesBill getSalesBill() {
		return this.salesBill;
	}

	public void setSalesBill(SalesBill salesBill) {
		this.salesBill = salesBill;
	}

}