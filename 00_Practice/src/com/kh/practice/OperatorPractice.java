package com.kh.practice;

import java.util.Scanner;

public class OperatorPractice {

	public static void main(String[] args) {
		OperatorPractice op = new OperatorPractice();
//		op.method1();
//		op.method2();
//		op.method3();
//		op.method4();
//		op.method5();
		op.method6();
	}
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원수 : ");
		int num1 = sc.nextInt();
		System.out.print("연필 개수 : ");
		int num2 = sc.nextInt();
		System.out.println("1인당 연필 개수 :" + (num2 / num1));
		System.out.println("남는 연필 개수 :" + (num2 % num1));
		

	}

	public void method2() {
		Scanner sc = new Scanner(System.in);		
		
		System.out.print("양수를 입력해주세요 > ");
		int num = sc.nextInt();
		
		System.out.println(num/100*100);
		
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("입력1 :");
		int num1 = sc.nextInt();
		
		System.out.print("입력2 :");
		int num2 = sc.nextInt();
		
		System.out.print("입력3 :");
		int num3 = sc.nextInt();
		
		System.out.println((num1 == num2) && (num2 == num3));
	
		
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.print("정수 : ");
		num = sc.nextInt();
		
		System.out.println((num % 2 == 0) ? "짝수이다." : "홀수이다.");
		
	}
	
	public void method5() { // num > 13은 불필요한 코드 조건문 배우고 코드 체크
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int num = sc.nextInt();
		
		System.out.println ((num <= 13) ? "어린이다." : (num > 13) && (num <= 19) ? "청소년이다." : "어른이다.");
	
	}
	
	public void method6() { // 이렇게 되면 사과가 100개, 바구니의 개수가 10개일 때 답이 잘못될거에요!
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사과의 개수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("바구니의 개수 : ");
		int num2 = sc.nextInt();
		
		int num3 = num1/num2;
		System.out.print("필요한 바구니의 개수 : " + ++num3);
	}
	
}

