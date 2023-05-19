package com.kh.operator;

import java.util.Scanner;

public class E_Logical {

	/*
	 * 논리 연산자(조건문에서 자주 사용) 
	 * - 두 개의 논리값을 연산해주는 연산자
	 * - 논리 연산한 결과마저도 논리값임!!
	 * 
	 * 논리값 && 논리값 : (and, 그리고) 왼쪽, 오른쪽 둘 다 true일 경우 결과값은 true
	 * 논리값 || 논리값 : (or, 또는) 왼쪽, 오른쪽 둘 중 하나라도 true일 경우 결과값은 true 
	 * 
	 * */
		public static void main(String[] args) {
			E_Logical e = new E_Logical();
//			e.method1();    //주석처리 단축키 ctrl + /
//			e.method2();
			e.method3();
	}
	
		public void method1() {
			int number = 0; // 나중에 코드가 길어지면 값을 초기화해서 상위에 지정해두면 좋아
			boolean result = false;
			
			Scanner sc = new Scanner(System.in);
			
			//사용자가 입력한 정수값이 1부터 100 사이의 값인지 확인
			System.out.println("임의의 정수를 입력해 주세요 > ");
			number = sc.nextInt();
			
			// 1 <= number <= 100 // 조건 두 개 결합, 둘 다 만족해야해서 이렇게 쓰면 안돼
			result = (number >=  1) && (number <= 100);
			System.out.println(number + "는 1부터 100 사이의 값인가요? : " + result);
			
		}
		
		public void method2() {
			
			// Short cut Evaluation
			int number = 10;
			boolean result = false;
			
			// && 연산자를 기준으로 앞에서 이미 false가 나오면 뒤의 연산은 수행하지 않는다.
			result = (number < 5 ) && (++number > 0);
			
			System.out.println(result); // false
			System.out.println(number); // 앞에 있는 값이 false 이므로 number는 그대로 10
			
			//|| 연산자를 기준으로 앞에서 이미 true가 나오면 뒤의 연산은 수행하지 않는다.
			result = (number < 20) || (++number > 0);
			System.out.println(result); // true, number값은 10 뒤에 연산은 수행하지 않으므로
			
		}
		
		public void method3() {
			
			/*
			 * 문제
			 * 사용자가 입력한 문자 값이 알파벳 대문자인지 확인하기
			 * 'A'~'Z'까지가 코드값으로 65~90까지의 숫자로 나열 
			 * */
		
//			int number = 65;
//			boolean result = false;
			
//			Scanner sc = new Scanner(System.in);
		
//			System.out.println("알파벳 대문자를 입력해 주세요 > ");
//			String str = sc.nextLine();
			
//			result = (number >= 65) && (number <= 90);
//			System.out.println(str + "는'A'부터 'Z'사이의 값인가요? : " + result);
// 			내가 한 것
	
			
			 Scanner sc = new Scanner(System.in);
			 char ch = sc.nextLine().charAt(0); // 문자열 메소드이므로 연달아 쓰기 가능
			 
			 System.out.println("사용자가 입력한 값이 대문자입니가? : " + ((ch >= 'A') && (ch <= 'Z')));
			 
//			정답!
			
		}
}
