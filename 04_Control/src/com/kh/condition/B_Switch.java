package com.kh.condition;

import java.util.Scanner;

public class B_Switch {
	Scanner sc = new Scanner(System.in);
	
	/*
	 * switch문
	 * 
	 * [표현법]
	 * 
	 * switch(조건식) {
	 * 		case 값1:
	 * 			... 조건식의 결과가 값1과 같을 경우 실행 코드 ....
	 * 			break; // 반드시 추가
	 * 		case 값2:
	 * 			... 조건식의 결과가 값2과 같을 경우 실행 코드 ....
	 * 			break;
	 * 		default: // if문의 else와 비슷
	 * 			...조건식의 결과가 일치하는 case문이 없을 때 실행 코드...
	 * }
	 * 
	 * -case문의 수는 제한이 없다.
	 * -조건식 결과는(case 값1...) 정수, 문자, 문자열이어야 한다.
	 * -조건문을 빠져나오려면 break가 필요하다.
	 * -default문은 생략 가능하다. if-else에서 else 생략 가능하듯이
	 * */
	
	public void method1() {
		/*
		 * 문제 if문으로
		 * 숫자를 입력 받아
		 * 1일 경우 "빨간색"
		 * 2일 경우 "파란색"
		 * 3일 경우 "초록색"
		 * 잘못 입력했을 경우 "잘못 입력하셨습니다." 
		 * */
		
		System.out.print("정수 입력 > ");
		int num = sc.nextInt();
		
//		if(num == 1) {
//			System.out.print("빨간색");
//		} else if(num == 2) {
//			System.out.print("파란색");
//		} else if(num == 3) {
//			System.out.print("초록색");
//		} else {
//			System.out.print("잘못 입력하셨습니다.");
//		}
		
//Switch문으로 변경
		
		switch(num) {
		case 1 :
			System.out.println("빨간색");
			break;
		case 2 :
			System.out.println("파란색");
			break;
		case 3 :
			System.out.println("초록색");
			break;
		default: 
			System.out.println("잘못 입력하셨습니다.");
			
		}
	}

	public void practice1() {
		/*
		 * 문제1
		 * 등급별 권한
		 * 1 : 관리권한, 글쓰기권한, 읽기권한
		 * 2 : 글쓰기 권한, 읽기권한
		 * 3 : 읽기권한
		 * 
		 * */
		
		System.out.print("등급별 권한 : ");
		int level = sc.nextInt();
				
//		switch(level) {
//		case 1 :
//			System.out.println("1등급 : 관리권한, 글쓰기권한, 읽기권한");
//			break;
//		case 2 :
//			System.out.println("2등급 : 글쓰기권한, 읽기권한");
//			break;
//		case 3 :
//			System.out.println("3등급 : 읽기권한");
//			break;
//		}
//		내가 한 거 : 틀림ㅎ_ㅎ
	
		switch(level) { // break 만나기 전까지 계속 출력되는 거 = 제어문에서 빠져나가는 역할
		case 1 :System.out.println("관리권한");
		case 2 :System.out.println("글쓰기권한");
		case 3 :System.out.println("읽기권한");
		}
		
		
	}
	
	
	public void practice2() {
		/*
		 * 문제)
		 * 월을 입력했을 때 계절을 출력
		 * 
		 * 3,4,5 : 봄
		 * 6,7,8 : 여름
		 * 9,10,11 : 가을
		 * 12,1,2 : 겨울
		 * 
		 * 예시)
		 * 월 > 5
		 * 봄
		 * 
		 * 월 > 11
		 * 가을
		 * 
		 * */
		System.out.print("월 > ");
		int month = sc.nextInt();
//		
//		switch(month) {
//			case 1 : System.out.println("겨울");
//			break;
//			case 2 : System.out.println("겨울");
//			break;
//			case 3: System.out.println("봄");
//			break;
//			case 4: System.out.println("봄");
//			break;
//			case 5: System.out.println("봄");
//			break;
//			case 6: System.out.println("여름");
//			break;
//			case 7: System.out.println("여름");
//			break;
//			case 8: System.out.println("여름");
//			break;
//			case 9: System.out.println("가을");
//			break;
//			case 10: System.out.println("가을");
//			break;
//			case 11: System.out.println("가을");
//			break;
//			case 12 : System.out.println("겨울");
//			break;
//		}
//		
		
	switch(month) {
	case 3: case 4: case 5:
		 System.out.println("봄");
	break;
	case 6: case 7: case 8:
		 System.out.println("여름");
	break;
	case 9: case 10: case 11:
		 System.out.println("가을");
	break;
	default :
		System.out.println("겨울");
	}
		
		
	}
	
	public static void main(String[] args) {
		B_Switch b = new B_Switch();
//		b.method1();
//		b.practice1();
		b.practice2();
		
		
	}

}
