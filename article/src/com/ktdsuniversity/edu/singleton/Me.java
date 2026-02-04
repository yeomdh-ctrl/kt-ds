package com.ktdsuniversity.edu.singleton;

public class Me {

	//전역(모든 곳) ==> static
	private static Me me;
	
	private String name;
	
	private Me() {
		this.name = "염동훈";
	}
	public static Me getInstance() {
		
		if(Me.me == null) {
			Me.me = new Me();
		}
		
		return Me.me;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
