package com.kh.example.practice2.model;

public class Circle {

//	public int radius = 1;
//	double PI = 3.14;
//
//	public double circumference() {
//		return ((2*Pi)*radius); 
//	}
//	public double area() {
//		return ((radius*2)* Pi);
//	}
//	
//	
//public void incrementRadius() {
//	int radius1 = radius+1;
//
//	------------------어어 이것도 망함 인크레먼트웅앵 아주 똥같아--------------------------------
//	
//}
	
	public int radius = 1;
	public final static double PI = 3.14;	//Pi 대문자야!!!! 파이널 해줘야햄 //상수값은 스태틱 넣어주는게 좋아
	
	public void incrementRadius() {
		++radius;
		
	}
	
}