package com.ktdsuniversity.edu.constants;

public class CalculatorTest {
	
	public static void main(String[] args) {
		Calculator calc = new Calculator(40, 20);
		System.out.println(calc.compute(Calculator.ADD));
		System.out.println(calc.compute(Calculator.SUB));
		System.out.println(calc.compute(Calculator.MUL));
		System.out.println(calc.compute(Calculator.DIV));
		
		//첫번째 문제: 숫자가 무슨 뜻인지 클래스를 보지않으면 알기 힘듦
		System.out.println(calc.compute(1));
		System.out.println(calc.compute(2));
		System.out.println(calc.compute(3));
		System.out.println(calc.compute(4));
		
		//두번째 문제: 무슨 의미를 나타내는지 알기 힘듦
		System.out.println(calc.compute(11));
		System.out.println(calc.compute(22));
		System.out.println(calc.compute(33));
		System.out.println(calc.compute(44));
		
		//Enum사용
		System.out.println(calc.compute2(Operator.ADD));
		System.out.println(calc.compute2(Operator.SUB));
		System.out.println(calc.compute2(Operator.DIV));
		System.out.println(calc.compute2(Operator.MUL));
	}

}
