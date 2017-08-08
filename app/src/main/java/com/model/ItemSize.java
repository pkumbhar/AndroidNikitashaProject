package com.model;

import java.io.Serializable;
import java.util.List;


/**
 * The persistent class for the item_size database table.
 * 
 */

public class ItemSize implements Serializable {
	private static final long serialVersionUID = 1L;


	private String itemSizeId;

	

	private String itemSizeName;


	private List<ItemDetail> itemDetails;

	public ItemSize() {
	}

	public String getItemSizeId() {
		return this.itemSizeId;
	}

	public void setItemSizeId(String itemSizeId) {
		this.itemSizeId = itemSizeId;
	}

	

	public String getItemSizeName() {
		return this.itemSizeName;
	}

	public void setItemSizeName(String itemSizeName) {
		this.itemSizeName = itemSizeName;
	}

	public List<ItemDetail> getItemDetails() {
		return this.itemDetails;
	}

	public void setItemDetails(List<ItemDetail> itemDetails) {
		this.itemDetails = itemDetails;
	}

	public ItemDetail addItemDetail(ItemDetail itemDetail) {
		getItemDetails().add(itemDetail);
		itemDetail.setItemSize(this);

		return itemDetail;
	}

	public ItemDetail removeItemDetail(ItemDetail itemDetail) {
		getItemDetails().remove(itemDetail);
		itemDetail.setItemSize(null);

		return itemDetail;
	}

}