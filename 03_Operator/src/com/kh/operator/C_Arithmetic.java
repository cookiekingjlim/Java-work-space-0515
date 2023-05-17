package com.kh.operator;

public class C_Arithmetic {

	/*
	 * 산술 연산자
	 * 
	 * +(더하기)
	 * -(빼기)
	 * *(곱하기)
	 * /(나누기)
	 * %(나머지)
	 * 
	 * */
	public static void main(String[] agrs) {
		C_Arithmetic c = new C_Arithmetic();
//      c.method1();
		c.method2();
		
	}
	
	public void method1() {
		
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1+num2 = " + (num1+num2));
		System.out.println("num1-num2 = " + (num1-num2));
		System.out.println("num1*num2 = " + (num1*num2));
		System.out.println("num1/num2 = " + (num1/num2)); // 나누기 했을 때의 몫 : 3, 정수만 나오기 때문
		System.out.println("num1%num2 = " + (num1%num2)); // 나누기 했을 때의 나머지 : 1, 정수만

	}
	
	public void method2() {
		int a = 5;
		int b = 10;
		int c = (++a) + b; // 16, a는 6, b는 10
		int d = c / a; // a는 6 b는 10 c는 16 d는 2(정수 몫만 오므로)
		int e = c % a; // a는 6 b는 10 c는 16 d는 2 e는 4
		int f = e++; //a는 6 b는 10 c는 16 d는 2 e는 4->(5)
		int g = (--b) + (d--); //g는 11 b는 9 d는 2->(1)
		int h = 2;
		
		int i = (a++) + b / (--c / f) * (g-- - d) % (++e +h); // 15(+1) / (15/5) * 10 % (6 + 3) // 5 * 10 % 9 		
//		int i = (a++) + b / (--c / f) * (g-- - d) % (++e +h);
		// 정답 a = 6(후위연산자이므로), b = 9, c = 15, d = 1, e = 6, h = 2, f = 4, g = 11
		//6 +9/3 * 10 % 8 
		//6 +3 *10 % 8
		//6 +  30 %  8
		//6 +  6
		
		System.out.println("f : " +f); // 4
		System.out.println("i : " +i); // 12
		
	}
}
