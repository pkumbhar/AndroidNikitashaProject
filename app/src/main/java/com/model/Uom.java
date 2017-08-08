package com.model;

import java.io.Serializable;

import java.util.List;


/**
 * The persistent class for the uom database table.
 * 
 */

public class Uom implements Serializable {
	private static final long serialVersionUID = 1L;


	private String uomId;


	private String uomName;


	private List<Item> items;


	private List<Stock> stocks;

	public Uom() {
	}

	public String getUomId() {
		return this.uomId;
	}

	public void setUomId(String uomId) {
		this.uomId = uomId;
	}

	public String getUomName() {
		return this.uomName;
	}

	public void setUomName(String uomName) {
		this.uomName = uomName;
	}

	public List<Item> getItems() {
		return this.items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Item addItem(Item item) {
		getItems().add(item);
		item.setUom(this);

		return item;
	}

	public Item removeItem(Item item) {
		getItems().remove(item);
		item.setUom(null);

		return item;
	}

	public List<Stock> getStocks() {
		return this.stocks;
	}

	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}

	public Stock addStock(Stock stock) {
		getStocks().add(stock);
		stock.setUom(this);

		return stock;
	}

	public Stock removeStock(Stock stock) {
		getStocks().remove(stock);
		stock.setUom(null);

		return stock;
	}

}