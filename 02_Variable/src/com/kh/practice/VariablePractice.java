package com.kh.practice;

import java.util.Scanner;

public class VariablePractice {
	
	// FQCN(Fully Qualified Class Name)
	// 클래스가 속한 패키지명을 모두 포함한 이름

	public static void main(String[] args) {
		
		VariablePractice vp = new VariablePractice();
//		vp.method1();
		vp.method2();
//		vp.method3();
//		vp.method4();
//		vp.method5();
//		vp.method6();
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
		
		System.out.print("성인 요금 : " + "원"); //여기에 ~원을 넣고 싶은데 어떻게 넣지...?
		int num1 = sc.nextInt();
		
		System.out.print("청소년 요금 : ");
		int num2 = sc.nextInt();
		
		System.out.println("성인 2명 : " + (num1*2) +"원");
		System.out.println("청소년 3명 : " + (num2*3) +"원");
		
		System.out.println("총 금액 : " + ((num1*2) + (num2*3)) + "원");
	}
	

	public void method3() { //다른 임시변수 만들어서 사용할 수 있음. 나중에 연습해봐
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
		String str = sc.nextLine();
		char ch1 = str.charAt(0);
		System.out.println("첫번째 문자 : " + ch1);
		char ch2 = str.charAt(7);
		System.out.println("마지막 문자 : " + ch2);
		
		//쌤 이거 우당탕탕 얼레벌레 돌아가기는 하는데...이해를 기반으로 푼 게 아니라 이것저것 다 집어넣다 보니까 어떻게 비슷하게 나왔어요..ㅎ..
		
	}
	
	public void method5() { //입력받은 값을 이용하는 것
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("문자 : ");
//		String str = sc.next();
//		int num1 = 'A';
//		System.out.println("A unicode : " + num1);
//		int num2 = 'B';
//		System.out.println("B unicode : " + num2);
		
		System.out.print("문자 : ");
		char ch = sc.next();
	}
	
	public void method6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double num1 = sc.nextInt();
		System.out.print("영어 : ");
		double num2 = sc.nextInt();
		System.out.print("수학 : ");
		double num3 = sc.nextInt();
		
		double result1 = num1+num2+num3;
		System.out.printf("총점 : " + "%.0f\n", result1);
		
		double result2 = result1/3;
		System.out.printf("평균 : " + "%.2f", result2);
	}
	
}
