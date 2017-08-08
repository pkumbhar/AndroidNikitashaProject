package com.model;

import java.io.Serializable;



/**
 * The persistent class for the purchase_order_detail database table.
 * 
 */

public class PurchaseOrderDetail implements Serializable {
	private static final long serialVersionUID = 1L;


	private String podId;

	private double price;

	private double quantity;


	private double totalAmount;

	private String unit;


	private Item item;


	private PurchaseOrder purchaseOrder;

	public PurchaseOrderDetail() {
	}

	public String getPodId() {
		return this.podId;
	}

	public void setPodId(String podId) {
		this.podId = podId;
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

	public double getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public PurchaseOrder getPurchaseOrder() {
		return this.purchaseOrder;
	}

	public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}

}