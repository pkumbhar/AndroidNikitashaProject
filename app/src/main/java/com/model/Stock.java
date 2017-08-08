package com.model;

import java.io.Serializable;

import java.util.Date;


/**
 * The persistent class for the stock database table.
 * 
 */

public class Stock implements Serializable {
	private static final long serialVersionUID = 1L;


	private String stockId;


	private double maxStock;


	private double minStock;

	private double quantity;


	private Date recordTime;

	private boolean status;


	private String storageId;

	//bi-directional many-to-one association to ItemDetail

	private ItemDetail itemDetail;

	private Uom uom;

	public Stock() {
	}

	public String getStockId() {
		return this.stockId;
	}

	public void setStockId(String stockId) {
		this.stockId = stockId;
	}

	public double getMaxStock() {
		return this.maxStock;
	}

	public void setMaxStock(double maxStock) {
		this.maxStock = maxStock;
	}

	public double getMinStock() {
		return this.minStock;
	}

	public void setMinStock(double minStock) {
		this.minStock = minStock;
	}

	public double getQuantity() {
		return this.quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public Date getRecordTime() {
		return this.recordTime;
	}

	public void setRecordTime(Date recordTime) {
		this.recordTime = recordTime;
	}

	

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getStorageId() {
		return this.storageId;
	}

	public void setStorageId(String storageId) {
		this.storageId = storageId;
	}

	public ItemDetail getItemDetail() {
		return this.itemDetail;
	}

	public void setItemDetail(ItemDetail itemDetail) {
		this.itemDetail = itemDetail;
	}

	public Uom getUom() {
		return this.uom;
	}

	public void setUom(Uom uom) {
		this.uom = uom;
	}

}