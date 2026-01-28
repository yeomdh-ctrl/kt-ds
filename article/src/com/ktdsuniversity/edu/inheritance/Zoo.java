package com.ktdsuniversity.edu.inheritance;

public class Zoo {
	public static void main(String[] args) {
		String name = "a";
		String other = "a";
		System.out.println(name == other); // true가 나오는데 Object안에 값을 비교하는 equals가 있기 때문
		

//		Bird 는 Animal 이기 때문에 Bird 를 Animal 로 바꾸는 것도 가능 => 다형성
//		Bird bird = new Animal(); 처럼 반대의 경우는 불가능. Animal 이 더 큰 개념
//		Bird duck = new Bird("오리", "꽥", 15f, 20f, 50f);
		Animal duck = new Bird("오리", "꽥", 15f, 20f, 50f);
		Animal duck2 = new Bird("오리", "꽥", 15f, 20f, 50f);
		duck.howling();
		duck.move();
		
		System.out.println(duck);
		System.out.println("==비교: " + (duck == duck2)); //메모리의 주소를 비교하기 때문에 false가 나옴
		System.out.println("equals 비교: " + duck.equals(duck2)); // false가 나오는데 zoo에서 equals를 오버라이딩한 후 true가 나옴
		
		StringBuffer sb = new StringBuffer();
		sb.append("asdasdasd");
		System.out.println(sb);
//		옛날 버전
//		if(duck instanceof Bird) {
//			Bird bird = (Bird)duck; //명시적 형변환
//			bird.fly();
//			bird.land();
//		}
		//현재버전 => duck이 Bird의 인스턴스가 맞다면 bird로 변환한다를 한줄로
		if(duck instanceof Bird bird) {
			bird.fly();
			bird.move();
			
			bird.land();
			bird.move();
			
			bird.fly();
		}
//		duck.fly();
//		duck.land(); => Animal에는 없는 인스턴스기 때문에 사용불가
		
		Animal lion = new Animal("사자", "크앙", 80f, 60f, 200f);
		Animal tiger = new Animal("호랑이", "어흥", 50f, 55f, 200f);
		
		//attack 이 없지만 Bird 는 Animal 이기 때문에 상속이 돼서 사용가능
		tiger.attack(duck);
		duck.attack(tiger);
		
		lion.howling();
		tiger.howling();
		
		
		lion.move();
		tiger.move();
		
		lion.attack(tiger);
		lion.attack(tiger);
		lion.attack(tiger);
		lion.attack(tiger);
		lion.attack(tiger);
		lion.attack(tiger);
		
		tiger.attack(lion);
	}

}
