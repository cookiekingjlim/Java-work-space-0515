package com.kh.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayPractice ap = new ArrayPractice();
//		ap.method1();
		ap.method2();
//		ap.method3();
//		ap.method4();
		
	}

		
	/*
	 * 길이가 5인 배열을 선언하고 과일 5개로 초기화 한 후 본인이 좋아하는 과일 하나를 출력하세요. (과일 5개는 뭐든지~)
	 * 
	 * */
	public void method1() {
		String[] arr = {"딸기","복숭아","바나나","사과","망고"};
			for(int i = 0; i<arr.length;i++) {
		}
			System.out.println(arr[0]);
		}
		
		
		
		
		
	
	
	/*
	 * 사용자에게 배열의 길이와 배열의 크기 만큼 사용자한테 입력 받은 값으로 초기화 한 후
	 * 각 입력 받은 값이 잘 들어갔는지 출력 후 저장된 값들의 합을 출력하세요.
	 * 
	 * 정수 : 5
	 * 배열 0번째 인덱스에 넣을 값 : 4
	 * 배열 1번째 인덱스에 넣을 값 : -4
	 * 배열 2번째 인덱스에 넣을 값 : 3
	 * 배열 3번째 인덱스에 넣을 값 : -3
	 * 배열 4번째 인덱스에 넣을 값 : 2
	 * [4, -4, 3, -3, 2]
	 * 2
	 * */
	public void method2() {
		
		System.out.print("정수: ");
		int input = sc.nextInt();
		int sum = 0;
		
		int[] arr = new int[input];
		for(int i = 0; i<input; i++) {
			System.out.print("배열"+i+"번째 인덱스에 넣을 값: ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(sum);
	
//		System.out.print("정수 : ");
//		int num = sc.nextInt();
//		int sum= 0;
//		
//		int[] arr = new int[5]; //5?
//		for(int i=0; i<arr.length; i++) {
//			System.out.print("배열"+i+"번째 인덱스에 넣을 값 : ");
//			arr[i] = sc.nextInt();			//나 이거..어케 풀었지.....?
//			
//			sum += arr[i];	//sum = sum + arr[i]
//			
//		}
//	
//		System.out.println(Arrays.toString(arr));
//		System.out.println(sum);

	}

			
		

		
	
	
	
	/*
	 * 음식 메뉴는 자유롭게! 개수도 자유롭게! 배열 사용해서
	 * 사용자가 입력한 값이 배열에 있으면 "배달 가능", 없으면 "배달 불가능"을 출력하세요.
	 * 
	 * */
	public void method3() {
		String[] menu = {"까눌레","마들렌","휘낭시에","스콘"}; //배열 선언과 초기화
		
		System.out.print("메뉴 입력 : ");
		String name = sc.nextLine();
		
		for(int i = 0; i <menu.length; i++) { 
//			System.out.println(menu[i]); // 까눌레 마들렌 휘낭시에 스콘
			if(name.equals(menu[i])) { //메뉴랑 네임이 같으면........
				System.out.println("배달 가능"); //얘까지는 나오는데
			} else if(!name.equals(menu[i])) {
				System.out.println(""); // 넌 왜에ㅔㅔㅔ 배달불가능 왜 여러개야ㅏㅏㅏ
			}
			
		}
		
	}
			
		
	
	/*
	 * 
	 * 사용자에게 주민등록번호를 입력받아 성별자리 이후부터 *로 가리고 출력하세요.
	 * 단, 원본 배열은 건드리지 않고! 
	 * 
	 * 주민등록번호 : 123456-1234567
	 * 123456-1****** 14글자...
	 */


	 public void method4() {
		System.out.print("주민등록번호 : ");
		int[] num = {sc.nextInt()};
			for(int i=0; i>=9;i++) {
				System.out.println("*");
			}
		
	}
	
	/*
	 * 사용자가 입력한 단어를 거꾸로 뒤집어서 출력하세요. 
	 * 
	 * 단어 입력 : programming
	 * gnimmargorp
	 * 
	 * */
	public void method5() {
		
	}
	
}
