package com.model;

import java.io.Serializable;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the sales_bill database table.
 * 
 */

public class SalesBill implements Serializable {
	private static final long serialVersionUID = 1L;


	private String salesBillId;


	private String contactNo;


	private String createdBy;


	private Date createdOn;


	private String customerEmail;


	private String firstName;


	private boolean isOpen;


	private String lastName;


	private double serviceChagre;


	private double totalAmount;


	private double totalPrice;


	private double totalTax;


	private List<SalesBillDetail> salesBillDetails;

	public SalesBill() {
	}

	public String getSalesBillId() {
		return this.salesBillId;
	}

	public void setSalesBillId(String salesBillId) {
		this.salesBillId = salesBillId;
	}

	public String getContactNo() {
		return this.contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getCustomerEmail() {
		return this.customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getServiceChagre() {
		return this.serviceChagre;
	}

	public void setServiceChagre(double serviceChagre) {
		this.serviceChagre = serviceChagre;
	}

	public double getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public double getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public double getTotalTax() {
		return this.totalTax;
	}

	public void setTotalTax(double totalTax) {
		this.totalTax = totalTax;
	}

	public List<SalesBillDetail> getSalesBillDetails() {
		return this.salesBillDetails;
	}

	public void setSalesBillDetails(List<SalesBillDetail> salesBillDetails) {
		this.salesBillDetails = salesBillDetails;
	}

	public SalesBillDetail addSalesBillDetail(SalesBillDetail salesBillDetail) {
		getSalesBillDetails().add(salesBillDetail);
		salesBillDetail.setSalesBill(this);

		return salesBillDetail;
	}

	public SalesBillDetail removeSalesBillDetail(SalesBillDetail salesBillDetail) {
		getSalesBillDetails().remove(salesBillDetail);
		salesBillDetail.setSalesBill(null);

		return salesBillDetail;
	}

}