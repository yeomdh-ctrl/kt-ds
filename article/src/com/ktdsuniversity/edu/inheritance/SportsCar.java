package com.ktdsuniversity.edu.inheritance;

public class SportsCar extends Vehicle{
	private boolean turboMode;

	public SportsCar(String name, boolean engine, boolean turboMode) {
		super(name, engine, "부앙");
	}
	
	public void modeOn() {
		if(this.turboMode) {
			System.out.println("터보 모드 켜짐");
		}
		else {
			System.out.println("터보 모드 꺼짐");
		}
	}

}
