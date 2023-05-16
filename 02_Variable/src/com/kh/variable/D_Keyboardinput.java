package com.kh.variable;

import java.util.Scanner;

public class D_Keyboardinput {

	/*
	 * Scanner
	 * - 화면(Console)으로부터 데이터를 "입력"받는 클래스
	 *  1) import java.util.Scanner; 추가 java.util은 자바API 기능 중 하나
	 *  
	 *  2) Scanner 클래스 생성
	 *  	Scanner sc = new Scanner(System.in);
	 *  
	 *  3) Scanner 클래스 사용
	 *  	입력 값이
	 *  	- 문자열일 때 : sc.next() - 공백이 있을 겅우 공백 이전까지
	 *  				 sc.nextLine() - 공백 포함 엔터 전까지(사용 권장)
	 *  	- 정수일 때 : sc.nextInt()
	 *  	- 실수일 때 : sc.nextFlaot(), sc.nextDouble()  
	 * */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름은 무엇입니까? > ");
		String name = sc.next();
		sc.nextLine(); // 넥스트라인 처리
		
		System.out.println(name);
		
		System.out.print("당신의 집은 어디십니까? > ");
		String addr = sc.nextLine();
		
		System.out.print("당신의 나이는 몇 살입니까? > ");
		int age = sc.nextInt();
		
		System.out.print("당신의 키는 몇 입니까?(소수점 첫째 자리까지 입력하세요.) > ");
		float height = sc.nextFloat();
		sc.nextLine(); // 넥스트라인 처리
		
		System.out.print("당신의 성별은 무엇입니까? (남/여) > ");
		String line = sc.nextLine(); // char를 받는 입력 값이 없으므로
		char gender = line.charAt(0); // 인덱스는 0부터 시작
		
		System.out.println("당신의 이름은 " + name + "이고 사는 곳은 " + addr + ",나이는 " + age + "세, 키는 " + height +"cm, 성별은 " + gender + "입니다.");
		
// 문제) 당신의 이름은 임지우이고 사는 곳은 성남 위례, 나이는 32, 키는 163.5cm, 성별은 여입니다.
// printf로 출력하기	
		
		String str = "당신의 이름은 임지우이고 사는 곳은 성남 위례, 나이는 32세, 키는 163.5cm, 성별은 여입니다.";
		System.out.printf("%s\t", str);
		
		System.out.printf("당신의 이름은 %s이고 사는 곳은 %s, 나이는 %d, 키는 %.1f, 성별은 %c 입니다.", name, addr, age, height, gender); 
		// 정답, pirntf(포멧,출력 값,값...) -> 첫 문장은 출력하는대로 나오니까+포맷, 대응되는 값들
		
		
	}
}
