package com.kh.inheritance.child;

import com.kh.inheritance.parent.Product;

public class Tv extends Product { //자식 클래스에서 공통적인 것들을 부모클래스에 빼버리는 것이 상속,,,
	
//	private String brand;
//	private String pCode;
//	private String name;
//	private int price;
	private int inch;

	public Tv() {
	}

	public Tv(String brand, String pCode, String name, int price, int inch) {		// 순서가 중요
		super(brand, pCode, name, price);
		this.inch = inch;
	}

	@Override
	public String toString() {
		return super.toString() + "Tv [inch=" + inch + "]";
	}
	
	

}
