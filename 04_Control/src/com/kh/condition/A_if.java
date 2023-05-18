package com.kh.condition;

import java.util.Scanner;

public class A_if {

	Scanner sc = new Scanner(System.in); // 메소드 바깥에 적용, 인스턴스 변수, 위치가 어디든 쓸 수 있음 = 매번 생성할 필요 없음

	/*
	 * if문
	 * 
	 * [표현법]
	 * 
	 * if(조건식){ .. 조건식이 참(true)일 때 실행할 코드.. // 제어문 }
	 * 
	 * -보통 조건식에는 비교연산자, 논리연산자를 주로 사용 /결과값 전부 트루,폴스
	 * 
	 * 
	 */

	public static void main(String[] args) { // 실행이 되는 부분 어디에 위치하든 상관 없어
		A_if a = new A_if();
//호출		a.method1();
//		a.method2();
//		a.method3();
//		a.method4();
//		a.method5();
//		a.method6();
//		a.practice1();
		a.practice2();

	}

	public void method1() {

		int score = 80; // 지역 변수 : 이 메소드 안에서만 사용하는 변수다.

		// 60점 이상이어야 합격! //막막하면 먼저 한글로 구조대로 작성해봐
		// 먄약(60점 이상){ 의사 코드(슈도코드, pseudocode)

		// 합격!

		// }

		if (score >= 60) { // 59점이면 이 조건문은 폴스 아래로
			System.out.println("합격!"); // if()score >= 60) System.out.println("합격!"); 이런식으로 간단한 붙여쓰기 가능
		} // if문은 중괄호 생략 가능, 그러나 사용하기를 권장!

		// 불합격!
		if (score < 60)
			System.out.println("불합격!"); // 59점일 때 이것이 트루

		/*
		 * if-else문
		 * 
		 * [표현법]
		 * 
		 * if(조건식){ ... 조건식이 참(true)일 때 실행할 코드... }else{ ... 조건식이 거짓(false)일 때 실행할 코드...
		 * }
		 * 
		 */

	}

	public void method2() {

		int score = 0;

		System.out.print("점수 입력 > ");
		score = sc.nextInt();

		if (score >= 60) {
			System.out.print("합격!");
		} else {
			System.out.print("불합격!");
		}

		// 삼항 연산자
		System.out.print((score >= 60) ? "합격!" : "불합격!");

	}

	public void method3() {
		String name = ""; // 초기화 //기본 자료형 8가지는 실제값을 저장, 이외에는 주소값이 저장이 돼

		System.out.print("이름을 입력해주세요 > ");
		name = sc.nextLine();

		// 이름이 일치하는지 아닌지 판단하기

//		System.out.println("임지우 == name"); // false, 맞지 않는 코드
		System.out.println("임지우".equals(name));// .누르고 나온 스트링 클래스의 이퀄스 메소드 //true
		System.out.println("임지우".charAt(0)); // String 클래스의 charAt(0) 메소드

		// 본인이면 "본인이다", 본인이 아니면 "본인이 아니다."

		if ("임지우".equals(name)) { // 내가 한 거, 맞음
			System.out.println("본인이다.");
		} else {
			System.out.println("본인이 아니다.");
		}

	}

	public void method4() {
		int number = 0; // 초기화해줌

		System.out.println("숫자 입력 > ");
		number = sc.nextInt();

		// 0보다 크면 "양수", 그게 아니면 "음수"
		// 중첩 if문 : if문 중첩해서 사용 가능!
		// 2depth까지는 관례적으로 허용 이외에는 비추
		if (number > 0) {
			System.out.println("양수");
		} else {
			System.out.println("음수");
			if (number == 0) {
				System.out.println("0입니다.");
			} else {
				System.out.println("음수");
			}
		}
	}

	public void method5() {

		/*
		 * if-else if-else문
		 * 
		 * [표현법]
		 * 
		 * if(조건식1) { ..조건식1이 참(true)일 때 실행할 코드.. } else if(조건식2) { ..조건식2가 참(true)일 때
		 * 실행할 코드.. } else { .. 위에 어느 조건식에도 만족하지 않을 때 실행할 코드.. }
		 * 
		 * 
		 * -else if 수는 제한이 없다. -else는 생략 가능하다. -if 중첩보다 else if를 추천
		 */

		int number = 0;

		System.out.println("숫자 입력 > ");
		number = sc.nextInt();

		if (number > 0) {
			System.out.println("양수");
		} else if (number < 0) {
			System.out.println("음수");
		} else {
			System.out.println("0입니다.");
		}

	}

	public void method6() {
		/*
		 * 문제! if-else를 이용해서 사용자에게 점수(0~100)을 입력 받아서 점수별로 등급을 출력하라 -90점 이상은 A등급 -90점 미만
		 * 80점 이상은 B등급 -80점 미만 70점 이상은 C등급 -70점 미만 60점 이상은 D등급 -60점 미만 F등급
		 */
		int number = 0;

		System.out.print("점수 입력 > ");
		number = sc.nextInt();

		// 첫번째 코드
		if (number >= 90) {
			System.out.println("A");
		} else if (number < 90 && number >= 80) { // 나는((number < 90) && (number >= 80)) 이렇게 괄호 사용했었음
			System.out.println("B");
		} else if (number < 80 && number >= 70) {
			System.out.println("C");
		} else if (number < 70 && number >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

		// 두번째 코드
		// 불필요한 코드 제거

		char grade = '\u0000'; // 캐릭터 초기화
		if (number >= 90) { // 1. 중복되는 점수 제거
			grade = 'A'; // 2. 매번 쓰는 시스템아웃프린트 중복 제거 후 if문 빠진 후 한 번만 입력
		} else if (number >= 80) {
			grade = 'B';
		} else if (number >= 70) {
			grade = 'C';
		} else if (number >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.println(grade);

	}

	public void practice1() {
		/*
		 * 세 점수를 입력했을 때 짝수만 출력
		 * 
		 * num1 입력 > 3 num2 입력 > 4 num3 입력 > 6
		 * 
		 * 출력값: 4 출력값: 6
		 * 
		 * 만 나오게 하기
		 * 
		 */

//		--------------주석 처리는 내가 짠 코드----------
//		int num1 = 0; 하고 num1이라고 하단에 입력 했었음
//		int num2 = 0;
//		int num3 = 0;

		System.out.print("점수 입력 1 : ");
		int num1 = sc.nextInt();
		System.out.print("점수 입력 2 : ");
		int num2 = sc.nextInt();
		System.out.print("점수 입력 3 : ");
		int num3 = sc.nextInt();

//		if(num1 % 2 == 0) {
//			System.out.println(num1);
//		}
//		if(num2 % 2 == 0) {
//			System.out.println(num2);
//		}
//		if(num3 % 2 == 0) {
//			System.out.println(num3);
//		}
		if (num1 % 2 == 0)
			System.out.println(num1);
		if (num2 % 2 == 0)
			System.out.println(num2);
		if (num3 % 2 == 0)
			System.out.println(num3);

	}

	public void practice2() {
		/*
		 * 문제2 정수 1개를 입력했을 때 음(minus)/양(plus)/0(zero), 짝(even)/홀(odd) 출력
		 * 
		 * 정수 입력 > -3 출력 값1 minus 출력 값2 odd
		 */
//		System.out.print("숫자 입력 : ");
//		int num = sc.nextInt();
//		
//		if(num < 0 ) {
//			System.out.println("음수(Minus)");
//		} else if(num > 0) {
//			System.out.println("양수(Plus)");
//		} else {
//			System.out.println("0(Zero)");
//		}
//		
//		if(num % 2 == 0) {
//			System.out.print("짝수(Even)");
//		} else {
//			System.out.print("홀수(Odd)");
//		}

//	------------------------------------------------축약	
		//ctrl+Shift+f 자동 줄바꿈(정렬) 예쁨..
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();

		if (num < 0) {
			System.out.println("음수(Minus)");
			if (num % 2 == 0) {
				System.out.print("짝수(Even)");
			} else {
				System.out.print("홀수(Odd)");
			}

		} else if (num > 0) {
			System.out.println("양수(Plus)");
			if (num % 2 == 0) {
				System.out.print("짝수(Even)");
			} else {
				System.out.print("홀수(Odd)");
			}

		} else {
			System.out.println("0(Zero)");
			if (num % 2 == 0) {
				System.out.print("짝수(Even)");
			} else {
				System.out.print("홀수(Odd)");
			}

		}

	}

}
