package com.kh.practice;

import java.util.Scanner;

public class VariablePractice {
	
	// FQCN(Fully Qualified Class Name)
	// 클래스가 속한 패키지명을 모두 포함한 이름

	public static void main(String[] args) {
		
		VariablePractice vp = new VariablePractice();
//		vp.method1();
//		vp.method2();
//		vp.method3();
		vp.method4();
	}
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.println("더하기 결과 : " +(num1+num2));
		System.out.println("빼기 결과 : " +(num1-num2));
		System.out.println("곱하기 결과 : " + (num1*num2));
		System.out.println("나누기 몫 결과 : " +(num1/num2));
		
		
	}
	
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("영화관의 요금표는 다음과 같습니다.");
		
		System.out.print("성인 요금 : "); //여기에 ~원을 넣고 싶은데 어떻게 넣지...?
		int num1 = sc.nextInt();
		
		System.out.print("청소년 요금 : ");
		int num2 = sc.nextInt();
		
		System.out.println("성인 2명 : " + (num1*2) +"원");
		System.out.println("청소년 3명 : " + (num2*3) +"원");
		
		System.out.println("총 금액 : " + ((num1*2) + (num2*3)) + "원");
	}
	

	public void method3() {
		int x = 5;
		int y = 7;
		int z = 9;
		
		final int X;
		x = 7;
		final int Y;
		y = 9;
		final int Z;
		z = 5;
		
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
	}
	
	
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : "); 
		sc.next();
		
		System.out.println("첫번째 문자 : " + "c");
		System.out.print("마지막 문자 : " + "r");
		
		// 이렇게 하는 게 맞나..? 쌤 제가 문제 의도를 제대로 읽은 게 맞나요... 막.. computer에 c위치 지정하고 그런 거 아니죠..? 
	}
	
}
