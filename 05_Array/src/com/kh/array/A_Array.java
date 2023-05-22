package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class A_Array {

	/*
	 * 변수 : 하나의 공간에 하나의 값을 담을 수 있음
	 * 배열 : 하나의 공간에 여러개의 값을 담을 수 있음
	 * 		"같은 자료형의 값"으로만 담을 수 있음
	 * 정확히 애기하자면 배열의 각 인덱스 자리에 실제 값이 담김
	 * (인덱스는 0부터 시작!)
	 * 
	 * 1. 배열의 선언
	 * 
	 * 		[표현법]
	 * 
	 * 		자료형[] 배열명;
	 * 		자료형 배열명[];
	 * 
	 * 2. 배열의 초기화
	 * 
	 * 		[표현법]
	 * 
	 * 		배열명 = new 자료형[배열 크기];    //배열도 클래스인 것
	 * 
	 * 3. 배열의 선언과 초기화를 동시에 진행
	 * 
	 * [표현법]
	 * 	
	 * 자료형[] 배열명 = new 자료형[배열크기];
	 * 자료형 배열명[] = new 자료형[배열크기];
	 * 	
	 * */
	
	public void method1() {
		/*
		 * 배열의 선언과 초기화
		 *1)배열 변수와 인덱스를 이용해 초기화
		 **/
		int[] score = new int[5]; //배열의 크기를 지정하지 않으면 에러! //5개정도 기본으로 지정
		/*
		 * 기본 자료형 :스택 메모리에 생성된 공간에 실제 변수값을 저장하는 반면
		 * 참조 자료형 : 실제 데이터 값은 힙 메모리에 저장하고,
		 * 			스택 메모리의 변수 공간에는 실제 변수값이 저장된 힙 메모리의 주소값 저장 
		 * 
		 * */
		
//		System.out.println(score); // [I@3d012ddd]

		/*
		 * -배열을 생성하고 초기화 해주지 않아도 문제없이 출력!
		 * -JVM이 지정한 기본값으로 배열이 초기화
		 * 	(정수형 : 0, 실수형 : 0.0, 문자형 : \u0000, 논리형 : false, 참조형 : null)
		 * 
		 * */
		
		//초기화!
		score[0] = 100; // 넣을 때 직접 지정
		score[1] = 90;
		score[2] = 80;
		score[3] = 70;
		score[4] = 60;
		
		
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
		
		
	}
	
	public void method2() {
	
		int[] score = /*new int[] 생략 가능함*/ {100, 90, 80, 70, 60}; 
		
//		int[] score2;
//		score2 = {100,90,80,70,60}; // 이건 안됨!
		
		//반복문을 사용해서 입력
		
		//문자열.length();, 배열.length; //괄호가 붙은 건 메소드, 후자는 변수
		for(int i = 0; i <score.length; i++) { //배열은 score.lengrth();에서 괄호 빼야해
			System.out.println(score[i]);
		}
		
		
		
	}
	
	public void method3() {
		// 3) 반복문을 이용한 초기화
		
		int[] score = new int[5];
		int num = 100;
		
		for(int i = 0; i<score.length; i++) {
			score[i] = num;
			num -= 10;
		}
		
		/*
		 * 향상된 for문
		 * -자바 5부터 배열 및 컬렉션 객체(클래스)를 좀 더 쉽게 처리할 목적으로 제공 
		 * -증감식을 사용하지 않고 배열 및 컬렉션의 요소 개수만큼 반복하고 for문을 종료
		 * 
		 * */
		for(int s : score) { //값 : 배열
			System.out.println(s);
			
		}
		
	}
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 3명의 키를 입력 받아 배열에 저장하고 3명의 키의 평균값을 구하시오.
		 * 
		 * 키 입력 > 180
		 * 키 입력 > 177.3
		 * 키 입력 > 168.2
		 * 
		 * 175.2
		 * 
		 * */
		
	
//	--------------------------------------
//		double[] height = new double[3];
//		double num = height.length; 
//
//		System.out.print("키 입력 > ");
//		
//		for(double i = 0; i<=3; i++) {
//			height = sc.next();
//			System.out.print("");
//		}
//		
//		
//		
//		for(double i = 0; i <height.length; i++) { //배열은 score.lengrth();에서 괄호 빼야해
//		System.out.println(height[i] );
//		}
//		 
//			System.out.println();
//	}
//	-------------------------개같이 망함!
		
			
		double sum = 0.0;
		double[] arr = new double[3];
		
		/*
		 * arr[0] = sc.nextDouble();
		 * arr[1] = sc.nextDouble();
		 * arr[2] = sc.nextDouble();
		 * 
		 * */
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("키 입력 > ");
			arr[i] = sc.nextDouble(); //주석처리한 것의 규칙
			sum += arr[i]; //위에 입력 받고 -> 추가 -> 반복
		}
		System.out.printf("%.1f", sum/arr.length);//평균값은 반복이 아니므로 //합계 나누기 입력 받은 것의 길이
	}
			
	
	public void method5() {
				  
		 // 1.얕은 복사 : 배열의 주소만 복사
		 
		 
		int[] number = {1,2,3,4,5};
		int[] copy = number; // number 얕은 복사
		
//		System.out.println(number);
//		System.out.println(copy);// 주소값이 나옴
		
		System.out.println(Arrays.toString(number));
		System.out.println(Arrays.toString(copy)); // 주소값을 보일 수 있도록 
		
		copy[1] = 20; //값을 수정 //카피뿐만 아니라 기존값까지 바뀜
		System.out.println(Arrays.toString(number));
		System.out.println(Arrays.toString(copy));
		
		System.out.println(Arrays.toString(number) == Arrays.toString(copy)); //넘버와 카피가 같냐 false!
		
		System.out.println(number.hashCode()); // 해쉬코드 : 객체를 식별할 하나의 정수
		System.out.println(copy.hashCode()); //C코드가 같은지 아닌지 비교
		
		System.out.println(number.hashCode() == copy.hashCode()); // 넘버와 카피 비교 true!
	
		
	}

	
	public void method6() { //얕은 복사 보다는 깊은 복사를 사용할 것 추천
		//2.깊은 복사 : 동일한 새로운 배열을 하나 생성해서 내부의 값들도 함께 복사
		//1) for문을 이용한 깊은 복사
		int[] number = {1,2,3,4,5};
		int[] copy = new int[5];
		
		for(int i = 0; i<number.length; i++) {
			copy[i] = number[i];
		}
	

		
		System.out.println(Arrays.toString(number));
		System.out.println(Arrays.toString(copy)); //복사

		copy[1] = 20;
		
		System.out.println(Arrays.toString(number));
		System.out.println(Arrays.toString(copy)); //얕은 복사랑 비교, 얕은 복사는 둘 다, 깊은 복사는 깊은 복사만.
		
		System.out.println(number.hashCode());
		System.out.println(copy.hashCode()); // 넘버와 카피의 해시코드 상이함을 확인
	}
		
	public void method7() {
		/*
		 * 깊은복사
		 * 2) System 클래스에서 제공하는 arraycopy() 메소드를 이용한 깊은 복사
		 * 
		 * [표현법]
		 * 
		 * System.arraycopy(원본 배열, 복사 시작 인덱스, 복사본 배열, 복사 시작 인덱스, 복사할 길이); //for문 사용 안 할 경우.
		 * 
		 * */
		int[] number = {1,2,3,4,5};
		int[] copy = new int[5];
		
		System.arraycopy(number,0,copy,0,number.length); //원본배열의 길이니까
		
		copy[2] = 30;
		
		System.out.println(Arrays.toString(number));
		System.out.println(Arrays.toString(copy)); //깊은 복사 됨.
		
		
		
	}
	
	public void method8() {
			/*
			 * 깊은복사
			 *3) Arrays 클래스에서 제공하는 copyOf() 메소드를 이욯한 깊은 복사
			 * 
			 * 
			 * [표현법]
			 * 
			 * Arrays.copyOf(원본배열, 복사본 배열 길이);
			 * 
			 * */
		int[] number = {1,2,3,4,5};
		int[] copy = null; // 널이나 뉴인트나 ㄱㅊ, 단 널은 사용하려면 
//		System.out.println(copy.length); // 아직 값이 없기때문에 NullPointerException 에러가 뜸
		
		copy = Arrays.copyOf(number, number.length);
		
		copy[3] = 10;
		
		System.out.println(Arrays.toString(number));
		System.out.println(Arrays.toString(copy));
		
	}
		
	public void method9() {
		// 4) 배열의 clone() 메소드를 이용하는 방법 //제일 자주 사용하는 방법
		int[] number = {1,2,3,4,5};
		int[] copy = null;
		
		copy = number.clone();
		
		copy[3] = 10;
	
		System.out.println(Arrays.toString(number));
		System.out.println(Arrays.toString(copy));
			
	}
	
	public static void main(String[] args) {
		
	
		
		A_Array a = new A_Array();
//		a.method1();
//		a.method2();
//		a.method3();
//		a.method4();
//		a.method5();
//		a.method6();
//		a.method7();
//		a.method8();
		a.method9();

	}

}
