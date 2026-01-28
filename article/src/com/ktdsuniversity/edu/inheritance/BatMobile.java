package com.ktdsuniversity.edu.inheritance;

public class BatMobile extends SportsCar{
	private boolean detachBatPod;
	public BatMobile(String name, boolean engine, boolean turboMode) {
		super(name, engine, turboMode);
	}
	public void isDetachBatPod() {
		if(this.detachBatPod) {
			System.out.println("배트포드 분리");
		}
		else {
			System.out.println("배트포드 결합");
		}
	}

}
