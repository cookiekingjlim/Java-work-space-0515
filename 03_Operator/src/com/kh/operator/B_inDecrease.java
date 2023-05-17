package com.kh.operator;

public class B_inDecrease {

	/*
	 * 증감 연산자
	 * [표현법] (증감 연산자)값; 또는 값(증감 연산자); // 값의 앞뒤로 연산자가 붙을 수 있음
	 * 
	 * - 증감 연산자는 피연산자의 값을 1 증가시키거나 1 감소시키는 연산자
	 *  
	 * - ++ : 피연산자의 값을 1 증가시키는 연산자
	 * - -- : 피연산자의 값을 1 감소시키는 연산자
	 * 
	 * - (증감 연산자)값 : 전위 연산으로 먼저 증감 연산을 수행하고 다른 연산을 수행
	 * - 값(증감 연산자) : 후위 연산으로 먼저 다른 연산을 수행하고 증감 연산을 수행
	 * 
	 * */
	
	
	
	public static void main(String[] args) {
		
		B_inDecrease b = new B_inDecrease();
	//	b.method1();
		b.method2();
							
		
	}
	
	public void method1() {
		
		int number = 10;
		
		//전위나 후위나 연산 후 결과값은 동일 다만, 출력값은 다름
		//https://codingadinga.tistory.com/11 참고
		
		//전위 연산자
		System.out.println("전위 연산자 적용 전 : " + number); //10
		System.out.println("1회 수행 후 값 : " + ++number); //11, number = number + 1
		System.out.println("2회 수행 후 값 : " + ++number); //12
		System.out.println("전위 연산자 적용 후 : " + number); //12
		
		System.out.println();
		
		//후위 연산자
		System.out.println("후위 연산자 적용전 : " + number); //12
		System.out.println("1회 수행 후 값 : " + number++); //12, 넘버값을 먼저 계산하므로 일단 그대로 12->(13)
		System.out.println("2회 수행 후 값 : " + number++); //13
		System.out.println("후위 연산자 적용 후 : " + number); //14
		
		
		
		
	}
	
	public void method2() {
		
		int number = 20;
		int result = number++ * 3; // 20*3+1 후위 연산자이므로
		
		System.out.println("number : " + number); // 21
		System.out.println("result : " + result); // 60
		
		System.out.println();
		
		int number1 = 10;
		int number2 = 20;
		int number3 = 30;
		
		System.out.println( number1++);// 10, number1값은 11
		System.out.println((++number1) + (number2++)); // 32, number1값 11+1 + 20 후위연산자, number2 출력 후 값 21
		System.out.println((number1++) + (--number2) + (--number3)); // 61,  number1은 12->13 number2는 21-1, number3는 30-1
	}
	
}
