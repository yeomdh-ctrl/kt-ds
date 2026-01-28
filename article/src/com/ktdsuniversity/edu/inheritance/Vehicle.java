package com.ktdsuniversity.edu.inheritance;

public class Vehicle {
	protected String name;
	protected boolean engine;
	private String engineSound;
	
	
	public Vehicle(String name, boolean engine, String engineSound) {
		this.name = name;
		this.engine = engine;
		this.engineSound = engineSound;
	}
	public void carName() {
		System.out.println(this.name);
	}
	public void startEngine() {
		if(!(this.engine)) {
			System.out.println("시동 꺼짐");
			return;
		}
		else {
			System.out.println("시동 켜짐");
			System.out.println(this.engineSound);
		}
	}
	
}