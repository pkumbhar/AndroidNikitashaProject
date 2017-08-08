package com.model;

import java.io.Serializable;

import java.util.List;


/**
 * The persistent class for the item database table.
 * 
 */

public class Item implements Serializable {
	private static final long serialVersionUID = 1L;


	private String itemId;

	private String name;


	private List<FacebookLike> facebookLikes;


	private ItemType itemType;


	private Uom uom;


	private List<ItemDetail> itemDetails;


	private List<PurchaseOrderDetail> purchaseOrderDetails;


	private List<Rating> ratings;


	private List<SalesBillDetail> salesBillDetails;

	public Item() {
	}

	public String getItemId() {
		return this.itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<FacebookLike> getFacebookLikes() {
		return this.facebookLikes;
	}

	public void setFacebookLikes(List<FacebookLike> facebookLikes) {
		this.facebookLikes = facebookLikes;
	}

	public FacebookLike addFacebookLike(FacebookLike facebookLike) {
		getFacebookLikes().add(facebookLike);
		facebookLike.setItem(this);

		return facebookLike;
	}

	public FacebookLike removeFacebookLike(FacebookLike facebookLike) {
		getFacebookLikes().remove(facebookLike);
		facebookLike.setItem(null);

		return facebookLike;
	}

	public ItemType getItemType() {
		return this.itemType;
	}

	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}

	public Uom getUom() {
		return this.uom;
	}

	public void setUom(Uom uom) {
		this.uom = uom;
	}

	public List<ItemDetail> getItemDetails() {
		return this.itemDetails;
	}

	public void setItemDetails(List<ItemDetail> itemDetails) {
		this.itemDetails = itemDetails;
	}

	public ItemDetail addItemDetail(ItemDetail itemDetail) {
		getItemDetails().add(itemDetail);
		itemDetail.setItem(this);

		return itemDetail;
	}

	public ItemDetail removeItemDetail(ItemDetail itemDetail) {
		getItemDetails().remove(itemDetail);
		itemDetail.setItem(null);

		return itemDetail;
	}

	public List<PurchaseOrderDetail> getPurchaseOrderDetails() {
		return this.purchaseOrderDetails;
	}

	public void setPurchaseOrderDetails(List<PurchaseOrderDetail> purchaseOrderDetails) {
		this.purchaseOrderDetails = purchaseOrderDetails;
	}

	public PurchaseOrderDetail addPurchaseOrderDetail(PurchaseOrderDetail purchaseOrderDetail) {
		getPurchaseOrderDetails().add(purchaseOrderDetail);
		purchaseOrderDetail.setItem(this);

		return purchaseOrderDetail;
	}

	public PurchaseOrderDetail removePurchaseOrderDetail(PurchaseOrderDetail purchaseOrderDetail) {
		getPurchaseOrderDetails().remove(purchaseOrderDetail);
		purchaseOrderDetail.setItem(null);

		return purchaseOrderDetail;
	}

	public List<Rating> getRatings() {
		return this.ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}

	public Rating addRating(Rating rating) {
		getRatings().add(rating);
		rating.setItem(this);

		return rating;
	}

	public Rating removeRating(Rating rating) {
		getRatings().remove(rating);
		rating.setItem(null);

		return rating;
	}

	public List<SalesBillDetail> getSalesBillDetails() {
		return this.salesBillDetails;
	}

	public void setSalesBillDetails(List<SalesBillDetail> salesBillDetails) {
		this.salesBillDetails = salesBillDetails;
	}

	public SalesBillDetail addSalesBillDetail(SalesBillDetail salesBillDetail) {
		getSalesBillDetails().add(salesBillDetail);
		salesBillDetail.setItem(this);

		return salesBillDetail;
	}

	public SalesBillDetail removeSalesBillDetail(SalesBillDetail salesBillDetail) {
		getSalesBillDetails().remove(salesBillDetail);
		salesBillDetail.setItem(null);

		return salesBillDetail;
	}

}