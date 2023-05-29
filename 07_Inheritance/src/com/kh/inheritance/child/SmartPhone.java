package com.kh.inheritance.child;

import com.kh.inheritance.parent.Product;

public class SmartPhone extends Product {
	
//	private String brand;
//	private String pCode;
//	private String name;
//	private int price;
	private String mobileAgency;

	public SmartPhone() {
	}

	public SmartPhone(String brand, String pCode, String name, int price, String mobileAgency) {
		super(brand, pCode, name, price);
		this.mobileAgency = mobileAgency;
	}

	@Override
	public String toString() {
		return super.toString() + "SmartPhone [mobileAgency=" + mobileAgency + "]";
	}
	
	

}
