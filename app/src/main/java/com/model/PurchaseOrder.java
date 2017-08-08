package com.model;

import java.io.Serializable;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the purchase_order database table.
 * 
 */

public class PurchaseOrder implements Serializable {
	private static final long serialVersionUID = 1L;


	private String purchaseOrderId;


	private Date orderDate;


	private double totalAmount;


	private Employee employee;


	private Vendor vendor;


	private List<PurchaseOrderDetail> purchaseOrderDetails;

	public PurchaseOrder() {
	}

	public String getPurchaseOrderId() {
		return this.purchaseOrderId;
	}

	public void setPurchaseOrderId(String purchaseOrderId) {
		this.purchaseOrderId = purchaseOrderId;
	}

	public Date getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public double getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Vendor getVendor() {
		return this.vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public List<PurchaseOrderDetail> getPurchaseOrderDetails() {
		return this.purchaseOrderDetails;
	}

	public void setPurchaseOrderDetails(List<PurchaseOrderDetail> purchaseOrderDetails) {
		this.purchaseOrderDetails = purchaseOrderDetails;
	}

	public PurchaseOrderDetail addPurchaseOrderDetail(PurchaseOrderDetail purchaseOrderDetail) {
		getPurchaseOrderDetails().add(purchaseOrderDetail);
		purchaseOrderDetail.setPurchaseOrder(this);

		return purchaseOrderDetail;
	}

	public PurchaseOrderDetail removePurchaseOrderDetail(PurchaseOrderDetail purchaseOrderDetail) {
		getPurchaseOrderDetails().remove(purchaseOrderDetail);
		purchaseOrderDetail.setPurchaseOrder(null);

		return purchaseOrderDetail;
	}

}