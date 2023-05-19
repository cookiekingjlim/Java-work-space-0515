package com.kh.loop;

import java.util.Scanner;

public class C_For {
	Scanner sc = new Scanner(System.in);

	/*
	 * for문
	 * 
	 * [표기법]
	 * 
	 * for(초기식; 조건식; 증감식) { //;세미콜론으로 구분 ...실행코드... }
	 * 
	 * -주어진 횟수만큼 코드를 반복 실행하는 구문 -초기식은 반복문이 수행될 때 단 한 번만 실행되는 구문으로 반복문 안에서 사용하게 될 변수를
	 * 선언하고 초기값을 대입한다. -조건식의 결과가 false이면 실행 코드를 수행하지 않고 반복문을 빠져나간다. -증감식은 반복문을 제어하는
	 * 변수의 값을 증감시키는 구문으로 주로 초기식에 제시한 변수를 가지고 증감 연산자를 사용한다.
	 * 
	 */
	public void method1() {
		// 반복문을 아는 게 없으니 하나하나 입력, for문에서 규칙 중요
		System.out.println(1);
		System.out.println(2); // +1
		System.out.println(3); // +1
		System.out.println(4); // +1
		System.out.println(5); // +1

		System.out.println();

		// for문으로 변환
		for (int i = 1; i <= 5; i++) { // int는 for문 안에서만 사용할 수 있는 변수 지정한 것
			System.out.println(i);
		}

		for (int i = 0; i <= 5; i++) { // 위에 코드랑 동일 다만 이렇게 더 자주 사용
			System.out.println(i + 1);
		}
	}

	public void method2() {
		// 1~5 반대로 출력해보기
		// 5, 이게 첫번째 초기값
		// 4
		// 3
		// 2
		// 1
		for (int i = 5; i >= 1; i--) { // 왜 전위연산자 말고 후위연산자를 쓰는 걸까...?
			System.out.println(i);
		}

	}

	public void method3() {
		// 1~10 사이의 홀수만 출력
		// 1
		// 3
		// 5
		// 7 ...
////		for(int i = 1; i <= 10;  i++) {
////			if(i % 2 == 1) {
////				System.out.println( i );
////		}
//문제풀어본 거
		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i);

		}
	}

	public void method4() {
		//1~10 사이의 짝수만 출력
		/*
		 * - continue문은 반복문 안에서 사용
		 * - 반복문 안에서 continue문을 만나게 되면 "현재 구문"을 종료
		 * - 반복문을 벗어나는 건 아님! 다음 반복을 계속 수행
		 * */
		
			for(int i = 1; i <=10; i++) {
			if(i % 2 != 0) continue; // continue 위치 중요, 앞에 조건을 건너뛴 느낌......
			System.out.println(i);
		}
	}
	
	public void method5() {
		// 1~10까지의 합계
		int sum1 = 1+2+3+4+5+6+7+8+9+10;

		int sum2 = 0;
		for(int i = 1; i <= 10; i++) {
			sum2 += i;
			System.out.println("1부터" + i + "까지의 합계" + sum2);
			}
		}
		
		
	public void method6() {
		//1부터 사용자가 입력한 수까지의 합계
		System.out.print("원하는 숫자 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= num; i++) { 
			sum += i;
		}
		System.out.println("1부터" + num + "까지의 합계" + sum); //반복문 바깥으로 나와야 답이 하나만 아니면 계속 반복에서 답이 나와
		
		//이렇게 나오면 안되는데ㅠㅠ 한 번 더 체크ㅠㅠ
	}
	
	public void method7() {
		/*
		 * java.lang.math 클래스에서 제공하는 random() 메소드 호출해서
		 * 매번 다른 랜덤값을 얻어 낼 수 있음!
		 * 
		 * */
		double random = Math.random(); // 이 클래스는 import할 필요 없음
//		System.out.println(random); // 범위 0.0 <= random < 1.0
		
//		random = Math.random() * 10;
//		System.out.println(random); // 범위 0.0 <= random < 10.
//		
//		random = Math.random() * 10 + 1;
//		System.out.println(random); // 범위 1.0 <= random < 11.0
//		
//		int num = (int) random;
//		System.out.println(num);

		
			
////		System.out.print(random);
////		random = Math.random() * 10;
////		int sum = 0;
////			
////		for(int i = 1; i == random; i++) {
////			sum += i;
////		}
////		
////		System.out.println(random+sum);
//문제 풀어 본 거: 개같이 틀림
		
		//---------------아래 뭔가 또 이상해 나 for문 싫어ㅠ
		int num = (int) random;
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum += i;
		
		}
	}
	
	public void method8() {	
		/*
		 * H
		 * e
		 * l
		 * l
		 * o
		 * */
		
////		String str = "";
////		System.out.println("Hello".charAt(0));
////		System.out.println("Hello".charAt(1));
////		System.out.println("Hello".charAt(2));
////		System.out.println("Hello".charAt(3));
////		System.out.println("Hello".charAt(4));
//마찬가지로 문제 풀어본 거 개같이 틀림!
		
		String str = "Hello";
		for(int i = 0; i <= 4; i++) {
			System.out.println(str.charAt(i));
		}		
	}
		

	public void method9() {
		/*
		 * 사용자한테 입력 받은 문자열 출력
		 * 
		 * */
		
		
	
		System.out.print("문자열을 입력하시오 : ");
		String str = sc.nextLine();
		
		/*
		 * 예를 들어 kiwi : 4글자
		 * banana : 6글자
		 * */
		
		System.out.println("문자열의 길이 : " + str.length()); //문자열 길이 측정하는 메소드
		
		for(int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
			
		}
		
	}
	
	public void method10() { //-----------------------------------------중요----------------------------------------------------//
		/*
		 * 반복문을 사용해서 구구단 2단 출력해보기
		 * 2X1 = 2
		 * 2X2 = 4
		 * ...
		 * */
		
		for(int i = 1; i <= 9; i++)
		System.out.println("2 X " + i + " = " + 2*i);
////드디어 맞았다ㅠㅠㅠ
	}

	
	public void method11() {
		//사용자가 입력한 단을 출력
		//단 수(2~9)를 입력 > 3
		// 3x1=3
		// 3x2=6
		// ...
		//지정한 단수를 제외한 입력시
		//잘못 입력하셨습니다 출력
		
////		System.out.print("단 수(2~9)를 입력하세요 > ");
////		int num = sc.nextInt();
////		
////		for(int i = 1; i <= 9; i++) {
////			System.out.println(num + " X " + i + " = " + num*i);
////		}
////		if(num > 9) {
////		System.out.println("잘못 입력하셨습니다.");
////		}
//잘못 입력하셨습니다 잘 안됨ㅠ	
			
		System.out.print("단 수(2~9)를 입력하세요 > ");
		int num = sc.nextInt();
		
		if(num >= 2 && num < 9) {
		for(int i = 1; i <= 9; i++) {
		System.out.println(num + " X " + i + " = " + num*i);
		}
		} else {
			System.out.println("잘못 입력하셨습니다");
		}
	}
	
	public void method12() {
		/*
		 * 2~9단 출력
		 * 조건문 반복문 쓰듯이
		 * 반복문도 중첩해서 쓸 수 있음
		 * */
		for(int i1 = 2; i1 <= 9; i1++) { //
			for(int i2 = 1; i2 <= 9; i2++) {//for문1 한번, for문2가 조건만큼 돌아서 나와서 단과 단 사이 간격 띄운 후 for문1 다음 숫자로 넘어가서 다시 반복
				System.out.println(i1 + "X" + i2 + " = " + i1*i2);
			}
			System.out.println(); // 단과 단 사이에 간격 띄우기
		}
		
		
	}
	
	
	public void method13() {
		/*
		 * 별 찍기
		 * 
		 *    *****
		 *    *****    
		 *    *****
		 *    *****
		 * 
		 * */
//		System.out.println("*"); //이것만 사용해서 별 찍기
		
////		for(int i = 0; i <= 4; i++) {
////			for(int j = 0; j <= 4; j++)
////			System.out.println("*");
//		}
//		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	
	public void method14() {
		/*
		 * 1*** : i=0, j=0
		 * *2** : i=1, j=1
		 * **3* : i=2, j=2
		 * ***4 : i=3, j=3
		 * 
		 * */

		
////		for(int i = 0; i < 4; i++) {
////			if(i)
////			for(int j = 0; j<5; j++) {
////	
////					
////				System.out.print("*");
////			}
////			System.out.println();
////			}
////		}
//개같이 망함
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(i == j) { // i랑 j가 같은 자리일 때 숫자 생성이므로
					System.out.print(i+1);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
		
	public void method15() {
		/*
		 * * : i=1 j=1
		 * ** : i=2 j=1 j=2
		 * *** : i=3 j=1 j2 j=3
		 * **** : i=4 j=1 j=2 j=3 j=4 
		 * ***** : i=5 j=1 j=2 j=3 j=4 j=5
		 * */
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
				if(i==j)System.out.println();
			}
		}
		
		
		
		
	}
	
	public void method16() {
		/*
		 * 		* i=1 j=5
		 *	   ** i=2 j=4 j=5
		 *	  *** i=3 j=3 j=4 j=5
		 *	 **** i=4 j=2 j=3 j=4 j=5
		 *	***** i=5 j=1 j=2 j=3 j=4 j=5
		 * 
		 * */
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j>=1; j--) {
				if(i < j) {
					System.out.print(" ");

				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		C_For c = new C_For();
//		c.method1();
//		c.method2();
//		c.method3();
//		c.method4();
//		c.method5();
//		c.method6();
//		c.method7();
//		c.method8();
//		c.method9();
//		c.method10();
//		c.method11();
//		c.method12();
//		c.method13();
//		c.method14();
//		c.method15();
		c.method16();
	}


}
