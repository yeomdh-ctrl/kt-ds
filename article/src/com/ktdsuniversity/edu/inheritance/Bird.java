package com.ktdsuniversity.edu.inheritance;
//Bird 는 동물의 속성을 기본적으로 가지고 있으므로 Animal 을 상속해주면됨
public class Bird extends Animal {
	
	private boolean isFly;
	private float walkingSpeed;
	public Bird(String name, String voice, float speed, float damage, float hitPoint) {
		//super 은 Animal 에 있는 생성자를 호출하라는 뜻
		super(name, voice, speed, damage, hitPoint);
		this.walkingSpeed = speed;
	}
	public boolean getIsFly() {
		return this.isFly;
	}
	public void fly() {
		this.isFly = true;
		//this는 Bird안에서의 생성자를 의미 하기에 speed가오류. super도 Animal에서의 값이 private이기에 오류.
		// =>private를 protected로 변경
//		super.speed = 70;
		super.setSpeed(70f);
	}
	public void land() {
		this.isFly = false;
		super.setSpeed(this.walkingSpeed);
	}
	
	// Bird 클래스의 최종 Super Class인 Object 클래스의 toString() 메소드를 다시 정의한다.
	@Override
	public String toString() {
		String str = "Bird [name: %s, isFly: %s]";
		return str.formatted(super.getName(), this.isFly);
	}
	
}
