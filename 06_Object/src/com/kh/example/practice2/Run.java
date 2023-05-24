package com.kh.example.practice2;

import com.kh.example.practice2.model.Circle;

public class Run {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.incrementRadius();
		c.incrementRadius();
		
//		System.out.println(c.circumference());
//		System.out.println(c.area());
//------------------개같이 망한 내가 한 것 확인ㅎ.ㅎ
		
		//원의 둘레 = 2 x 반지름 x pi
		System.out.println(2 * c.radius * Circle.PI);
	
		//원의 넓이 = 반지름 x 반지름 x pi
		System.out.println(c.radius *c.radius*Circle.PI);
		
	}

}
