package com.kh.step4;

import com.kh.step4.model.Car;

public class Application {

	public static void main(String[] args) {
		Car c = new Car();
//----------------------기존 방식---------------
//		c.color = "white";
//		c.gearType = "auto";
//		c.door = 4; 
//------------------------사실 이렇게 하면 안돼!	
		Car c1 = new Car("white","auto",4);
		Car c2 = new Car("Black","manual");
		
		System.out.println(c1); // 주소값 나옴
		System.out.println(c2);
	}
		
		/*
		 * 오버로딩 : 오버로딩 쓸 경우, 한 클래스 내에 동일한 이름의 메소드를 매개변수의 자료형과 개수, 순서가 다르게 작성되어야 한다.
		 * ex.system.out.print할 경우 자동 인식해서 좌르륵 나오는 것, 같은 이름에 다른 매개변수를 가진,,
		 * 
		 * 
		 * */
		void test() {}
//		void test( ) {}
		void test(int a) {}
		void test(int a, String s) {}
		void test(String s, int a) {}
		void test(int a, int b) {}
//		void test(int c, int d) {} 얘는 오버로딩 아님 위에 인트랑---> 매개변수 자료형의 개수와 순서가 다르게 작성되어야 한다.
		
		void test(String s) {}
		
		
}
	