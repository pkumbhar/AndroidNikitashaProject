package com.model;

import java.io.Serializable;

import java.util.List;


/**
 * The persistent class for the item_detail database table.
 * 
 */

public class ItemDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	private String itemDetailId;

	private String color;

	private double discount;

	private String fabric;

	private String image1;

	private String image2;

	private String image3;

	private String image4;

	private String image5;

	private double mrp;

	private String pattern;


	private double salesPrice;


	private String sleeveType;

	private String weight;


	private ItemSize itemSize;


	private Item item;

	//bi-directional many-to-one association to Stock

	private List<Stock> stocks;

	public ItemDetail() {
	}

	public String getItemDetailId() {
		return this.itemDetailId;
	}

	public void setItemDetailId(String itemDetailId) {
		this.itemDetailId = itemDetailId;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getDiscount() {
		return this.discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getFabric() {
		return this.fabric;
	}

	public void setFabric(String fabric) {
		this.fabric = fabric;
	}

	public String getImage1() {
		return this.image1;
	}

	public void setImage1(String image1) {
		this.image1 = image1;
	}

	public String getImage2() {
		return this.image2;
	}

	public void setImage2(String image2) {
		this.image2 = image2;
	}

	public String getImage3() {
		return this.image3;
	}

	public void setImage3(String image3) {
		this.image3 = image3;
	}

	public String getImage4() {
		return this.image4;
	}

	public void setImage4(String image4) {
		this.image4 = image4;
	}

	public String getImage5() {
		return this.image5;
	}

	public void setImage5(String image5) {
		this.image5 = image5;
	}

	public double getMrp() {
		return this.mrp;
	}

	public void setMrp(double mrp) {
		this.mrp = mrp;
	}

	public String getPattern() {
		return this.pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public double getSalesPrice() {
		return this.salesPrice;
	}

	public void setSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
	}

	public String getSleeveType() {
		return this.sleeveType;
	}

	public void setSleeveType(String sleeveType) {
		this.sleeveType = sleeveType;
	}

	public String getWeight() {
		return this.weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public ItemSize getItemSize() {
		return this.itemSize;
	}

	public void setItemSize(ItemSize itemSize) {
		this.itemSize = itemSize;
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public List<Stock> getStocks() {
		return this.stocks;
	}

	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}

	public Stock addStock(Stock stock) {
		getStocks().add(stock);
		stock.setItemDetail(this);

		return stock;
	}

	public Stock removeStock(Stock stock) {
		getStocks().remove(stock);
		stock.setItemDetail(null);

		return stock;
	}

}