package com.kh.inheritance.parent;

// 3개 클래스 모두 공통적으로 가지고 있는 멤버 변수만 추출하여 부모 클래스를 만든다.
public class Product { 			// 자식 클래스의 공통적인 것들을 부모클래스에 먼저 빼놓기!

	private String brand;
	String pCode;		// default 접근제한자 없는 것으로 변경
	protected String name;
	public int price;

	public Product() {}		//비어있는 생성자 만들어주고

	public Product(String brand, String pCode, String name, int price) {
		this.brand = brand;
		this.pCode = pCode;
		this.name = name;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [brand=" + brand + ", pCode=" + pCode + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
}
