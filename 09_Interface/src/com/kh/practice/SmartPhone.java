package com.kh.practice;

public abstract class SmartPhone implements Phone {
	
	public void printInformation(String name, String brand) {	// S23Ultra+IPhone14Pro 둘 다 상속되기 때문에 여기에 작성 가능
		System.out.println(name + "는" + brand+"에서 만들어졌고 제원은 다음과 같다.");	
		System.out.println(makeCall());	// 스마트폰이 이미 폰을 가지고 있어서 호출 가능
		System.out.println(takeCall());
		System.out.println(picture());
	}

}
