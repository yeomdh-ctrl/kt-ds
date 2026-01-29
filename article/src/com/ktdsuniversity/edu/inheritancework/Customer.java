package com.ktdsuniversity.edu.inheritancework;

public class Customer {
	private String name;
	private int wallet;
	private int point;
	private String grade;
	
	public Customer(String name, int wallet, int point, String grade) {
		this.name = name;
		this.wallet = wallet;
		this.point = point;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWallet() {
		return wallet;
	}

	public void setWallet(int wallet) {
		this.wallet = wallet;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	

}
