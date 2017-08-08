package com.model;

import java.io.Serializable;

import java.util.List;


/**
 * The persistent class for the vendor database table.
 * 
 */

public class Vendor implements Serializable {
	private static final long serialVersionUID = 1L;


	private String vendorId;


	private String contactNo;


	private String vendorAddress;


	private String vendorName;

	//bi-directional many-to-one association to PurchaseOrder

	private List<PurchaseOrder> purchaseOrders;

	public Vendor() {
	}

	public String getVendorId() {
		return this.vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public String getContactNo() {
		return this.contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getVendorAddress() {
		return this.vendorAddress;
	}

	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}

	public String getVendorName() {
		return this.vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public List<PurchaseOrder> getPurchaseOrders() {
		return this.purchaseOrders;
	}

	public void setPurchaseOrders(List<PurchaseOrder> purchaseOrders) {
		this.purchaseOrders = purchaseOrders;
	}

	public PurchaseOrder addPurchaseOrder(PurchaseOrder purchaseOrder) {
		getPurchaseOrders().add(purchaseOrder);
		purchaseOrder.setVendor(this);

		return purchaseOrder;
	}

	public PurchaseOrder removePurchaseOrder(PurchaseOrder purchaseOrder) {
		getPurchaseOrders().remove(purchaseOrder);
		purchaseOrder.setVendor(null);

		return purchaseOrder;
	}

}