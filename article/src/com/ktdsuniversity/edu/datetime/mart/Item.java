package com.ktdsuniversity.edu.datetime.mart;

import java.time.LocalDate;

public class Item {
	private String name;
	private LocalDate expireDate;
	
	//생성자
	public Item(String name, String expireDate) {
		this.name = name;
		this.expireDate = LocalDate.parse(expireDate);
	}
	//getter setter
	public LocalDate getExpireDate() {
		return this.expireDate;
	}	
	//toString override
	@Override
	public String toString() {
		return "제품 이름: " +this.name + ", " + " 유통기한: " +  this.expireDate + "까지";
	}
}
