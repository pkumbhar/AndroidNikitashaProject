package com.model;

import java.io.Serializable;
import java.util.Date;




/**
 * The persistent class for the seq database table.
 * 
 */

public class Seq implements Serializable {
	private static final long serialVersionUID = 1L;


	private String name;

	private int count;

	private int id;


	private String seqName;

	private int year;

	public Seq() {
	}
	

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return this.count;
	}

	public void setCount(int count) {
		this.count = count;
		
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSeqName() {
		return this.seqName;
	}

	public void setSeqName(String seqName) {
		this.seqName = seqName;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	public String getKey(){
		String id=getSeqName()+"-"+((1900)+new Date().getYear())+"-"+getCount();
		return id.trim();
	}

	public void increment() {
		count=count+1;
		
	}

}