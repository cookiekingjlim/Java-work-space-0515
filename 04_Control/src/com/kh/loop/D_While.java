package com.kh.loop;

import java.util.Scanner;

public class D_While {
	Scanner sc = new Scanner(System.in);
	
	
	/*
	 * while문
	 * 
	 * [표현법]
	 * 
	 * while(조건식) {
	 * 		...실행코드 ...
	 * }
	 * */
	
	public void method1() {
		
		for(int i=1; i<=5;i++) {
			System.out.println(i);
		}
		
		System.out.println();
		
		int i = 1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
	}

	public void method2() {
		/*
		 * break문
		 * -switch, 반복문의 실행을 중지하고 빠져나갈 때 사용
		 * -반복문이 중첩되는 경우 break문이 포함되어 있는 반복문에서만 빠져나간다.
		 * */
		
		//for문 무한루프 = 무한반복
		for(int i=1; i<=5; ) { // 무한루프 생김
			System.out.println(i);
			i++;//무한루프 해결
		
		for(int j=1; ;) {
			if(j<=5) {
			System.out.println(j); //무한루프
			} else {
				break; //무한루프 막기
			}
			j++;
		}
	}
		
	
}
	
	public void method3() {
		//while문 무한루프, 무한루프시 권장
		int input = 0;
		while(true) {//조건이 그냥 트루인 것
			System.out.print("숫자 입력 > ");
			input = sc.nextInt();
			System.out.println(input);
		}
	}
	
	
	public void method4() {
		/*
		 * do-while문//안씀
		 * 
		 * [표현법]
		 * 
		 * do {
		 * 		..실행 코드..
		 * }while(조건식);
		 * 
		 * -조건과 상관없이 무조건 한 번은 실행
		 * */
		int num = 1;
		
		while(num ==0) {
			System.out.println("while문");
		}
		
		do { //한 번은 실행함의 차이
			System.out.println("do-while문");

		}while(num == 0);
	}
	
	public void method5() {
		// 반복문 + 조건문
		/*
		 * 숫자 맞히기 게임!
		 * 1과 100 사이의 값을 입력해서 임의로 지정한(Random)값을 맞히면 게임 끝!
		 * 게임이 끝나면 몇 번만에 숫자를 맞혔는지 출력!
		 * 
		 * 예) 랜덤값 57
		 * 1과 100 사이의 값 입력 > 35
		 * 더 큰 수를 입력하세요. 출력
		 * 1과 100 사이의 값 입력 > 70
		 * 더 작은 수를 입력하세요. 출력
		 * 1과 100 사이의 값 입력 > 57
		 * 3번 만에 맞췄습니다. 출력
		 * */
		


		while(true) {
		int input = 0;
		System.out.print("1과 100 사이의 값 입력 > ");
		input = sc.nextInt();
			
		double random = Math.random();
		random = Math.random() * 100;
		int num2 = (int) random;
		System.out.println("랜덤값 : " + num2);
		
			if(input<num2) {
				System.out.println("더 큰 수를 입력하세요!");
			} else if(input>num2) {
				System.out.println("더 작은 수를 입력하세요!");
			}
			
		}
		
	}

	
	public static void main(String[] args) {
		D_While d = new D_While();
//		d.method1();
//		d.method2();
//		d.method3();
//		d.method4();
		d.method5();
	}

}
