package com.kh.step3;

import com.kh.step3.model.Calculator;

public class Application {

	public static void main(String[] args) { //실행 메소드 필요

		/*
		 * 변수 호출 방법
		 * 	- 참조변수.변수;
		 * 
		 * 메소드 호출방법
		 * 	- 참조변수.메소드이름();					// 매개 변수가 없는 경우
		 * 	- 참조변수.메소드이름(값1, 값2, ...); 		// 매개 변수가 있는 경우
		 * */
		
		Calculator c = new Calculator();
		c.a = 200;
		c.b = 100;
		

		System.out.println("최댓값 : " + c.max()); //정수값이 넘어오고 있는 것
		
		System.out.println();
		
		System.out.println("더하기" + c.add());
		System.out.println("빼기" + c.substract());
		System.out.println("곱하기" + c.multiply(c.a, c.b)); //매개변수 담은 것
		System.out.println("나누기" + Calculator.divide(c.a, c.b)); //곱하기처럼 써도 되고 나누기처럼 써도 됨

		
		System.out.println("팩토리얼 : " + c.factorial(c.a));												
	}

}
