package com.ktdsuniversity.edu.fp.basic.impl;

import com.ktdsuniversity.edu.fp.basic.CallSomething;
// 값이 String 이 아니어도 결과가 출력 됐으면 좋겠어서 만든 클래스
public class CallAge2 extends CallSomething{

	@Override
	public int call(String message) {
		try {
			return Integer.parseInt(message);
		}
		catch(NumberFormatException nfe){
			return 0;
		}
	}

}
