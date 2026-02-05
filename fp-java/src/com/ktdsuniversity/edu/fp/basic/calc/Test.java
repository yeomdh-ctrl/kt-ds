package com.ktdsuniversity.edu.fp.basic.calc;

public class Test {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		// num1, num2 를 더해 반환한다
		int result = calc.calc2(1, 2, (num1,num2) -> num1 + num2);
		System.out.println(result);
		
		// num1, num2 를 제곱한 수를 반환
		result = calc.calc2(2, 4, (num1, num2) ->(int) Math.pow(num1, num2));
		System.out.println(result);
		// Method Reference -> Math 의 원형을 가져오는데 형태는 같아야함
		result = calc.calc2(2, 4, Math::powExact);
		
		// num1, num2 중 큰 수를 반환
		result = calc.calc(3, 6, (num1, num2) -> Math.max(num1, num2));
		System.out.println(result);
		// Method Reference
		result = calc.calc(3, 6, Math::max);
		
		// num1, num2 중 작은 수를 반환
		result = calc.calc(3, 6, (num1, num2) -> Math.min(num1, num2));
		System.out.println(result);
		// Method Reference
		result = calc.calc(3, 6, Math::min);
		
		// num1이 num2의 배수 0을 반환, 아니라면 1을 반환
		result = calc.calc(3, 14, (num1, num2) ->{
			if(num2 % num1 ==0) {
				return 0;
			}
			return 1;
			
		});
		System.out.println(result);
		
	}
}
