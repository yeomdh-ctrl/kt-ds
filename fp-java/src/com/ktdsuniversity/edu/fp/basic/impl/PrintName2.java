package com.ktdsuniversity.edu.fp.basic.impl;

import com.ktdsuniversity.edu.fp.basic.PrintSomething;
//값이 null 이어도 출력되게 하고싶어서 만든 클래스
public class PrintName2 implements PrintSomething{

	@Override
	public void print(String message) {
		if(message == null) {
			System.out.println("출력할 내용이 없습니다.");
		}
		else {
			for(int i = 0; i < 5; i++) {
				System.out.println(message);
			}
		}
		
	}

}
