package com.kh.practice.controller;

import com.kh.practice.model.Circle;

public class CircleController {

	 private Circle c = new Circle();  		// 여기에 private 쓰는 것....
	 
	 public String calcArea(int x, int y, int radius) {
		// 면적 : PI * 반지름 * 반지름
		 c.setX(x);
		 c.setY(y);
		 c.setRadius(radius);
		 return c.draw() +" / " + Math.PI * radius * radius;			// Math클래스에 Pi가 있음, 3.14 곱해도 뭐...무방... 		//리턴 "" -> 드로우 추가4
	 }
	public String calcCirum(int x, int y, int radius) {
		// 둘레 : PI * 반지름 * 2
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		return c.draw() + " / " + Math.PI * radius * 2;
	}
	
}
