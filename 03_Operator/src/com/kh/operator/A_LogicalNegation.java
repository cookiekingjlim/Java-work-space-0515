package com.kh.operator;

public class A_LogicalNegation {

	/*
	 * 논리 부정 연산자
	 * 
	 * [표현법] !논리값(true,false)
	 * 
	 * -논리 값을 반대로 바꾸는 연산자 
	 * 	(true->false, false->true)
	 * */
	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("b1 : " + b1);
		System.out.println("b1의 부정 : " + !b1); //false
		System.out.println("b1 : " + b1); //true 느낌표 안 붙였으니까
		
		b1 = !b2; // false+! = true
		System.out.println("b1의 부정 : " + !!b1); //true 에,,,false인 줄,,,
		
	}
	
}
